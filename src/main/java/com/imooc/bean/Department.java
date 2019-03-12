package com.imooc.bean;

public class Department {
	private Integer id;
	private String departmentName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDepartentName() {
		return departmentName;
	}
	public void setDepartentName(String departentName) {
		this.departmentName = departentName;
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", departentName=" + departmentName + "]";
	}
	
	
}
