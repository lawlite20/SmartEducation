package com.hhit.entity;

import java.util.Set;

//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Role.java
//  @ Date : 2016/3/25
//  @ Author : 
//
//




public class Role {
	private Integer id;
	private String roleName;
	private String description;
	private Set<UserDetails> userDetails;
	private Set<Privilege> privileges;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<UserDetails> getUserDetails() {
		return userDetails;
	}
	public void setUserDetails(Set<UserDetails> userDetails) {
		this.userDetails = userDetails;
	}
	public Set<Privilege> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}

}