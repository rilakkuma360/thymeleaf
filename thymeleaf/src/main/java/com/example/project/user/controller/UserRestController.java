package com.example.project.user.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.common.domain.DataTable;
import com.example.project.login.entity.SysUser;
import com.example.project.login.repository.SysUserRepository;
import com.example.project.user.domian.UserTable;
import com.example.project.user.domian.UserTableSearch;



@RestController
@RequestMapping("/")
public class UserRestController {
	
	@Autowired
	SysUserRepository sysUserRepository;
	
	@GetMapping("/rest/users")
	public DataTable<UserTable> getUsers(UserTableSearch search, @RequestParam Map<String, String> otherParams) {
		
		
		Pageable pageable = new PageRequest(search.getPage(), search.getLength());
		
		
		SysUser suser = new SysUser();
		suser.setUsername(StringUtils.isEmpty(search.getName())?null:search.getName());
		Example<SysUser> example = Example.of(suser);
		
		Page<SysUser> page = sysUserRepository.findAll(example, pageable);
		

		
		UserTable user = null;
		List<UserTable> list = new ArrayList<UserTable>();
		for (SysUser sysUser : page) {
			user = new UserTable();
			user.setName(sysUser.getUsername());
			user.setAccount(sysUser.getUsername());
			user.setPassword(sysUser.getPassword());
			list.add(user);
		}
		
		DataTable<UserTable> tp = new DataTable<UserTable>(search.getDraw(), page.getTotalElements(), page.getTotalElements(), list);
		return tp;
	}

}
