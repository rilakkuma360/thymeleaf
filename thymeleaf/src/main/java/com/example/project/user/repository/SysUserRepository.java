package com.example.project.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.project.user.entity.SysUser;


public interface SysUserRepository extends JpaRepository<SysUser, Long> {
	
	SysUser findByUserName(String username);
	
	SysUser findByAccount(String account);
	
//	Page<SysUser> findAll(Pageable pageable);

}
