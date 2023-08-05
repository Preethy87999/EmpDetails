package com.simplilearn.EmpDetails.model;

import java.util.List;

public class Worker {
 
	Integer eid;
	String name;
	String phno;
	Integer age;
	Integer experience;
	String salary;
	public Worker() {
	}
	public Worker(Integer eid, String name, String phno, Integer age, 
			Integer experience, String salary) {
		this.eid = eid;
		this.name = name;
		this.phno = phno;
		this.age = age;
		this.experience = experience;
		this.salary = salary;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhno() {
		return phno;
	}
	public void setPhno(String phno) {
		this.phno = phno;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getExperience() {
		return experience;
	}
	public void setExperience(Integer experience) {
		this.experience = experience;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
}









	//@Override
	/*public String toString() {
		return "Workers [eid=" + eid + ", name=" + name + ", phno=" + phno + ", age=" + age + ", experience="
				+ experience + ", salary=" + salary + "]";
	}*/
	
	
	

