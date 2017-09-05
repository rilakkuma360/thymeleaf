package com.example.project.user.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.common.domain.DataTable;
import com.example.project.user.domian.UserTable;
import com.example.project.user.domian.UserTableSearch;
import com.example.project.user.entity.SysUser;
import com.example.project.user.repository.SysUserRepository;



@RestController
@RequestMapping("/rest")
public class UserRestController {
	
	@Autowired
	SysUserRepository sysUserRepository;
	
	@GetMapping("/users")
	public DataTable<UserTable> getUsers(UserTableSearch search, @RequestParam Map<String, String> otherParams) {
		
		
		Pageable pageable = new PageRequest(search.getPage(), search.getLength());
		
		
		SysUser suser = new SysUser();
		suser.setUserName(StringUtils.isEmpty(search.getName())?null:search.getName());
		suser.setAccount(StringUtils.isEmpty(search.getAccount())?null:search.getAccount());
		Example<SysUser> example = Example.of(suser);
		
		Page<SysUser> page = sysUserRepository.findAll(example, pageable);
		
		List<UserTable> list = new ArrayList<UserTable>();
		for (SysUser sysUser : page) {
			
			list.add(new UserTable(sysUser.getUserName(), sysUser.getAccount(), sysUser.getPassWord(),
					sysUser.getRegisterDate(), sysUser.getEmail(), sysUser.getPhoneNumber()));
		}
		
		DataTable<UserTable> tp = new DataTable<UserTable>(search.getDraw(), page.getTotalElements(), page.getTotalElements(), list);
		return tp;
	}

	
	@PostMapping("/user")
	public void insertUser(SysUser user){
		
		sysUserRepository.save(user);
		
		System.out.println("insert insert insert insert");
	}
	
	@DeleteMapping("/user/{account}")
	public void deleteUser(@PathVariable String account){
		
		SysUser user = sysUserRepository.findByAccount(account);
		sysUserRepository.delete(user);
		
		System.out.println("delete");
	}
	
	@GetMapping("/user/{account}")
	public UserTable getUser(@PathVariable String account){
		
		SysUser user = sysUserRepository.findByAccount(account);
		
		UserTable editUser = new UserTable(user.getUserName(), user.getAccount(), user.getPassWord(), user.getRegisterDate(), user.getEmail(), user.getPhoneNumber());
				
		return 	editUser;
	}
	
	@PutMapping("/user")
	@Transactional
	public void getUser(SysUser user){
		
		SysUser dbuser = sysUserRepository.findByAccount(user.getAccount());
		
		dbuser.setAccount(user.getAccount());
		dbuser.setEmail(user.getEmail());
		dbuser.setPassWord(user.getPassWord());
		dbuser.setPhoneNumber(user.getPhoneNumber());
		dbuser.setRegisterDate(user.getRegisterDate());
		dbuser.setUserName(user.getUserName());
		
	}
}
