package com.star.bean;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString
@EqualsAndHashCode
@Component
public class StudentMybatis implements Serializable{
	
	private static final long serialVersionUID = -339516038496531943L;
	private Long id;
	private String username;
	private String password;
	private String icon;
	private String email;
	private String nickName;
	private String note;
	private Timestamp createTime;
	private Timestamp loginTime;
	private Integer status;
	
}
