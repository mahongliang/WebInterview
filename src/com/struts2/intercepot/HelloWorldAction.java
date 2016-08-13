package com.struts2.intercepot;

public class HelloWorldAction {

	private String name;
	public String execute(){
		System.out.println("Inside action....");
		return "success";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
