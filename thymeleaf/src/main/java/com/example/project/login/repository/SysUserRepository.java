package com.example.project.login.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.login.entity.SysUser;

public interface SysUserRepository extends JpaRepository<SysUser, Long> {
	
	SysUser findByUsername(String username);
	
//	Page<SysUser> findAll(Pageable pageable);

}
