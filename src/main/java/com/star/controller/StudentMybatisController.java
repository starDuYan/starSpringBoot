package com.star.controller;

import java.util.Date;
import java.sql.Timestamp;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.druid.support.json.JSONUtils;
import com.star.bean.StudentMybatis;
import com.star.service.StudentMybatisService;

/**
*	@author duxing
*   @Date 2020-03-28 22:24:55
*   测试配置信息
*/
@RestController
@EnableAutoConfiguration
public class StudentMybatisController {
	
	private static final Logger log = LoggerFactory.getLogger(StudentMybatisController.class);

	@Autowired
	private StudentMybatisService studentService;
	
	
	/**
	 * 测试 操作数据库
	 * 根据ID查询
	 * @return
	 */
	@RequestMapping(value = "/loadByIdHandAlias",method = RequestMethod.GET)
	public StudentMybatis loadByIdHandAlias(Long id) {
		StudentMybatis stu = this.studentService.loadByIdHandAlias(id);
		log.debug("loadByIdHandAlias:"+id);
		log.debug("loadByIdHandAlias:"+JSONUtils.toJSONString(stu));
		return stu;
	}
	/**
	 * 测试 操作数据库
	 * 根据ID自动查询
	 * @return
	 */
	@RequestMapping(value = "/loadByIdAutoAlias",method = RequestMethod.GET)
	public StudentMybatis loadByIdAutoAlias(Long id) {
		final StudentMybatis studentMybatis = this.studentService.loadByIdAutoAlias(id);
		return studentMybatis;
	}

	/**
	 * 测试 操作数据库
	 * 通过ID查询数据
	 * @return
	 */
	@RequestMapping(value = "/loadByIdResults",method = RequestMethod.GET)
	public StudentMybatis loadByIdResults(Long id) {
		return this.studentService.loadByIdResults(id);
	}
	/**
	 * 测试 操作数据库
	 * add数据
	 * @return
	 */
	@RequestMapping(value = "/addUserGeneratedKey",method = RequestMethod.GET)
	public int addUserGeneratedKey() {
		
		StudentMybatis stu = getStudentMybatis();
		
		return this.studentService.addUserGeneratedKey(stu);
	}
	/**
	 * 测试 操作数据库
	 * 更新数据
	 * @return
	 */
	@RequestMapping(value = "/update",method = RequestMethod.GET)
	public int update(Long id) {
		
		StudentMybatis stu = getUpdateStudentMybatis(id);
		return this.studentService.update(stu);
	}
	/**
	 * 测试 操作数据库
	 * 删除数据
	 * @return
	 */
	@RequestMapping(value = "/deleteByid",method = RequestMethod.GET)
	public int deleteByid(Long id) {
		return this.studentService.deleteByid(id);
	}
	/**
	 * 测试 操作数据库
	 * 根据name删除数据
	 * @return
	 */
	@RequestMapping(value = "/deleteByusername",method = RequestMethod.GET)
	public int deleteByusername(String  userName) {
		return this.studentService.deleteByusername(userName);
	}
	/**
	 * 模拟新增数据
	 * @return
	 */
//	@Bean
	private StudentMybatis getStudentMybatis() {
		StudentMybatis stu = new StudentMybatis();
		stu.setUsername("张"+(new Random().nextInt(100)));
		stu.setPassword("Ryx@"+(new Random().nextInt(9999)));
		stu.setIcon((new Random().nextInt(999999))+".jpg");
		stu.setEmail((new Random().nextInt(999999999))+"@qq.com");
		stu.setNickName((new Random().nextInt(999))+"test");
		stu.setNote((new Random().nextInt(999))+"测试"+(new Random().nextInt(9944449)));
		stu.setCreateTime(new Timestamp(System.currentTimeMillis()));
		stu.setLoginTime(new Timestamp(System.currentTimeMillis()));
		stu.setStatus(1);
		return stu;
	}
	/**
	 * 模拟修改数据
	 * @return
	 */
//	@Bean
	private StudentMybatis getUpdateStudentMybatis(Long id) {
		StudentMybatis stu = new StudentMybatis();
		stu.setId(id);
		stu.setUsername("李"+(new Random().nextInt(100)));
		stu.setPassword("CP22@"+(new Random().nextInt(9999)));
		stu.setIcon((new Random().nextInt(999999))+".jpg");
		stu.setEmail((new Random().nextInt(999999999))+"@qq.com");
		stu.setNickName((new Random().nextInt(999))+"test");
		stu.setNote((new Random().nextInt(999))+"测试"+(new Random().nextInt(9944449)));
		stu.setCreateTime(new Timestamp(new Date().getTime()));
		stu.setLoginTime(new Timestamp(new Date().getTime()));
		stu.setStatus(1);
		return stu;
	}
}
