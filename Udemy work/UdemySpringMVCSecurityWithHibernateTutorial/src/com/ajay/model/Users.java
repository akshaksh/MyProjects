package com.ajay.model;

import java.util.HashSet;
import java.util.Set;

public class Users {

	private String username;
	private String password;
	private String enabled;
	private Set<UserRole> userRole = new HashSet<UserRole>(0);
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEnabled() {
		return enabled;
	}
	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	public Set<UserRole> getUserRole() {
		return userRole;
	}
	public void setUserRole(Set<UserRole> userRole) {
		this.userRole = userRole;
	}

	
}
