package com.imooc.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imooc.bean.Department;
import com.imooc.dao.DepartmentDao;
import com.imooc.services.DepartmentService;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
	private DepartmentDao departmentDao;
	
	public Department querryById(Integer id) {
		return departmentDao.querryById(id);
	}

	public List<Department> querryAll() {
		return departmentDao.querryAll();
	}

}
