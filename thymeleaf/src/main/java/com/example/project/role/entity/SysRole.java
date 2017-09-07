package com.example.project.role.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class SysRole {

	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	//权限描述
	private String description;
	
	//备注
	private String comment;
	
	@OneToMany(cascade = {CascadeType.REFRESH}, fetch = FetchType.LAZY)
	private List<SysAuthority> authoritys;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}



	public List<SysAuthority> getAuthoritys() {
		return authoritys;
	}

	public void setAuthoritys(List<SysAuthority> authoritys) {
		this.authoritys = authoritys;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
