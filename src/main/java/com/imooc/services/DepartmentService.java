package com.imooc.services;

import java.util.List;

import com.imooc.bean.Department;

public interface DepartmentService {

	Department querryById(Integer id);

	List<Department> querryAll();

}
