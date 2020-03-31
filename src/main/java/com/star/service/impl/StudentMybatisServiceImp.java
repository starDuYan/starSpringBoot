package com.star.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.star.bean.StudentMybatis;
import com.star.mapper.StudentMybatisMapper;
import com.star.service.StudentMybatisService;

@Service
public class StudentMybatisServiceImp implements StudentMybatisService{
	
	@Autowired
	private StudentMybatisMapper student;
	
	@Override
	public int addUserGeneratedKey(StudentMybatis student) {
		// TODO Auto-generated method stub
		return this.student.addUserGeneratedKey(student);
	}

	@Override
	public int update(StudentMybatis student) {
		// TODO Auto-generated method stub
		return this.student.update(student);
	}

	@Override
	public int deleteByid(Long id) {
		// TODO Auto-generated method stub
		return this.student.deleteByid(id);
	}

	@Override
	public int deleteByusername(String username) {
		// TODO Auto-generated method stub
		return this.student.deleteByusername(username);
	}

	@Override
	public StudentMybatis loadByIdHandAlias(Long id) {
		// TODO Auto-generated method stub
		return this.student.loadByIdHandAlias(id);
	}

	@Override
	public StudentMybatis loadByIdAutoAlias(Long id) {
		// TODO Auto-generated method stub
		return this.student.loadByIdAutoAlias(id);
	}

	@Override
	public StudentMybatis loadByIdResultMap(Long id) {
		// TODO Auto-generated method stub
		return this.student.loadByIdResultMap(id);
	}

	@Override
	public StudentMybatis loadByIdResults(Long id) {
		// TODO Auto-generated method stub
		return this.student.loadByIdResults(id);
	}
	

}
