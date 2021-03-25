package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class user {
	@Id
private int id;
	private String name;
private String first_name;
private String last_name;
private String password;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public user(int id, String name, String first_name, String last_name, String password) {
	super();
	this.id = id;
	this.name = name;
	this.first_name = first_name;
	this.last_name = last_name;
	this.password = password;
}
public user() {
	super();
}
@Override
public String toString() {
	return "user [id=" + id + ", name=" + name + ", first_name=" + first_name + ", last_name=" + last_name
			+ ", password=" + password + "]";
}
}