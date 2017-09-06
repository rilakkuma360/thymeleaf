package com.example.project.role.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.project.role.entity.SysRole;
import com.example.project.role.repository.SysRoleRepository;
import com.example.project.user.entity.SysUser;
import com.example.project.user.repository.SysUserRepository;

@Controller
public class RoleController {
	
	@Autowired
	SysRoleRepository sysRoleRepository;
	
	@GetMapping("/roles")
	public ModelAndView getUsers() {
		
		
		Pageable pageable = new PageRequest(0, 5);
		Page<SysRole> page = sysRoleRepository.findAll(pageable);
		
		ModelAndView mv = new ModelAndView("admin/roles", "page",  page);
		return mv;
	}

	
	
	
}
