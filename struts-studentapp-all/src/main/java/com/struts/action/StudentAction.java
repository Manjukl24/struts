package com.struts.action;

import java.util.Arrays;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.struts.model.Student;

public class StudentAction  extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//create a student object to populate the values
	private Student student;
	//create a list to populate the values of the hobbies array
	private List<String> hobbies;
    //create getter and setter for properties
	
//create a constructor to set 
	public StudentAction() {
		hobbies = Arrays.asList("sports","music","dance");
	}
	
	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public List<String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}


	public void ShowStudForm() {
		//check your name 
	}
}
