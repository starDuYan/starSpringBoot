package com.star.service;

import com.star.bean.StudentMybatis;
import com.star.controller.StudentMybatisController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface StudentMybatisService {
	/**
	 * 插入记录，数据库生成主键
	 * @param user
	 * @return
	 */
	int addUserGeneratedKey(StudentMybatis student);
	
    int update(StudentMybatis student);
	
    int deleteByid(Long id);
	
    int deleteByusername(String username);
	
	 /**
     * 根据ID查询，手动设置别名
     *
     * @param id
     * @return
     */
    StudentMybatis loadByIdHandAlias(Long id);
 
    /**
     *  根据ID查询，开了自动驼峰转换
     *
     * @param id
     * @return
     */
    StudentMybatis loadByIdAutoAlias(Long id);
	
    /**
     * 使用ResultMap
     * @param id
     * @return
     */
	StudentMybatis loadByIdResultMap(Long id);
	
	/**
     * 使用Results
     * @param id
     * @return
     */
	StudentMybatis loadByIdResults(Long id);

	/**
	 * 测试 操作数据库
	 * @return
	 * @param id
	 * @param studentMybatisController
	 */
	@RequestMapping(value = "/loadByIdResultMap",method = RequestMethod.GET)
	default StudentMybatis loadByIdResultMap(Long id, StudentMybatisController studentMybatisController) {
		return loadByIdResultMap(id);
	}
}
