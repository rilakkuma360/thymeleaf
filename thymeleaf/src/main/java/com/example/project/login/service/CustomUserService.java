package com.example.project.login.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

import com.example.project.login.domain.LoginUser;
import com.example.project.role.entity.SysRole;
import com.example.project.user.entity.SysUser;
import com.example.project.user.repository.SysUserRepository;

public class CustomUserService implements UserDetailsService {
	
	@Autowired
	SysUserRepository sysUserRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		SysUser user = sysUserRepository.findByAccount(username);
		
		if (user == null) {
			throw new UsernameNotFoundException("用户名不存在");
		}
		
		List<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
		for (SysRole role : user.getRoles()) {
			auths.add(new SimpleGrantedAuthority(role.getName()));
		}
		
		
		LoginUser loginUser = new LoginUser(user.getUserName(), user.getPassWord(), auths);
		
		return loginUser;
	}

}
