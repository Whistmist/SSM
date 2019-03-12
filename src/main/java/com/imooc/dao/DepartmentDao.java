package com.imooc.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.imooc.bean.Department;

public interface DepartmentDao {

	@Select("select * from department where id=#{id}")
	Department querryById(Integer id);

	List<Department> querryAll();

}
