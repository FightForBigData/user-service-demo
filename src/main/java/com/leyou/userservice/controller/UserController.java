package com.leyou.userservice.controller;

import com.leyou.userservice.pojo.User;
import com.leyou.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: ruoFeng
 * @Date: Create in 2019-07-21 0021  21:57
 */
@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;

	@GetMapping("/{id}")
	public User queryById(@PathVariable("id") Long id) {
		return this.userService.queryById(id);
	}
}
