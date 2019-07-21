package com.leyou.userservice.pojo;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * @Author: ruoFeng
 * @Date: Create in 2019-07-21 0021  21:58
 */
@Table(name = "tb_user")
@Data
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String username;

	private String password;

	private String phone;

	private String email;

	private Date created;

	private Date updated;

	private String sourceType;

	private String nickName;

	private String name;

	private String status;

	private String headPic;

	private String qq;

	private Long accountBalance;

	private String isMobileCheck;

	private String isEmailCheck;

	private String sex;

	private Integer userLevel;

	private Integer points;

	private Integer experienceValue;

	private Date birthday;

	private Date lastLoginTime;
}
