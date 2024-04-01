package com.example.action;

import com.opensymphony.xwork2.ActionSupport;

public class GreeterAction  extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String name;

	@Override
	public String toString() {
		return "GreeterAction [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
