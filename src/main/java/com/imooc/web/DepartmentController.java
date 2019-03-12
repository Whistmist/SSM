package com.imooc.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.imooc.bean.Department;
import com.imooc.services.DepartmentService;


@Controller
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/hello")
	@ResponseBody
	public String hello(){
		return "hello";
	}
	
	@RequestMapping(value="/querryById/{id}")
	@ResponseBody
	public Department querryById(@PathVariable(value="id") Integer id){
		Department department=departmentService.querryById(id);
		return department;
	}
	
	@RequestMapping(value="/querryAll")
	@ResponseBody
	public List<Department> querryAll(){
		List<Department> list=departmentService.querryAll();
		return list;
	}
	
	@RequestMapping(value="/index")
	public String index(){
		return "index";
	}
	
}
