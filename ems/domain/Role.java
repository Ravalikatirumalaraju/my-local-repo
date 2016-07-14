package com.flp.ems.domain;

public class Role {

	
	private String Role_id;
	private String Description;
	private String Name;
	
	public String getRole_id() {
		return Role_id;
	}
	
	public void setRole_id(String role_id) {
		Role_id = role_id;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	@Override
	public String toString() {
		return "Role [Role_id=" + Role_id + ", Description=" + Description + ", Name=" + Name + "]";
	}
	
}
