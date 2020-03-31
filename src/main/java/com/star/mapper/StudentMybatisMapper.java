package com.star.mapper;

import java.math.BigInteger;
import java.sql.Timestamp;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Component;

import com.star.bean.StudentMybatis;
/**
* @Description:
* @Param: 
* @return: 
* @Author: duxing
* @Date: 2020/3/31
*/
@Component
@Mapper
public interface StudentMybatisMapper {
	/**
	 * 插入记录，数据库生成主键
	 * @param user
	 * @return
	 */
	@Options(useGeneratedKeys =true,keyProperty = "id")
	@Insert("insert into student_mybatis(username,password,icon,email,nick_name,note,create_time,login_time,status) values(#{username},#{password},#{icon},#{email},#{nickName},#{note},#{createTime},#{loginTime},#{status})")
	int addUserGeneratedKey(StudentMybatis student);
	
	@Update("update student_mybatis set username=#{username},password=#{password},icon=#{icon},email=#{email},nick_name=#{nickName},note=#{note},create_time=#{createTime},login_time=#{loginTime},status=#{status} where id=#{id}")
    int update(StudentMybatis student);
	
	@Delete("delete from student_mybatis where id=#{id}")
    int deleteByid(@Param("id") Long id);
	
	@Delete("delete from student_mybatis where username=#{username}")
    int deleteByusername(@Param("username") String username);
	
	 /**
     * 根据ID查询，手动设置别名
     *
     * @param id
     * @return
     */
    @Select("SELECT id,username,password,icon,email,nick_name as nickName,note,create_time as createTime,login_time as loginTime,status FROM student_mybatis WHERE id=#{id}")
    StudentMybatis loadByIdHandAlias(@Param("id") Long id);
 
    /**
     *  根据ID查询，开了自动驼峰转换
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM student_mybatis WHERE id=#{id}")
    StudentMybatis loadByIdAutoAlias(@Param("id") Long id);
	
    /**
     * 使用ResultMap
     * @param id
     * @return
     */
	@Select("select * from student_mybatis where id=#{id}")
	@Results(id = "studentMap",value= {
		 @Result(property = "id", column = "id", javaType = BigInteger.class),
         @Result(property = "username", column = "username", javaType = String.class),
         @Result(property = "password", column = "password", javaType = String.class),
		 @Result(property = "icon", column = "icon", javaType = String.class),
         @Result(property = "email", column = "email", javaType = String.class),
         @Result(property = "nickName", column = "nick_name", javaType = String.class),
		 @Result(property = "note", column = "note", javaType = String.class),
         @Result(property = "createTime", column = "create_time", javaType = Timestamp.class),
         @Result(property = "loginTime", column = "login_time", javaType = Timestamp.class),
		 @Result(property = "status", column = "status", javaType = Integer.class)
	})
	StudentMybatis loadByIdResultMap(@Param("id") Long id);
	
	/**
     * 引用其他的Result
     *
     * @param id
     * @return
     */
    @ResultMap("studentMap")
    @Select("SELECT * FROM student_mybatis WHERE id=#{id}")
    StudentMybatis loadByIdResultMapReference(@Param("id") Long id);
	
	/**
     * 使用Results
     * @param id
     * @return
     */
	@Select("select * from student_mybatis where id=#{id}")
	@Results(id = "id",value= {
		 @Result(property = "id", column = "id"),
         @Result(property = "username", column = "username"),
         @Result(property = "password", column = "password"),
		 @Result(property = "icon", column = "icon"),
         @Result(property = "email", column = "email"),
         @Result(property = "nickName", column = "nick_name"),
		 @Result(property = "note", column = "note"),
         @Result(property = "createTime", column = "create_time"),
         @Result(property = "loginTime", column = "login_time"),
		 @Result(property = "status", column = "status")
	})
	StudentMybatis loadByIdResults(@Param("id") Long id);
}
