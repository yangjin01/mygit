package com.tyjy.app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Value可以获取配置文件中的自定义属性
 * 通过@Value("${属性名}")来获取属性值
 * 将值绑定到需要的属性上
 * 
 *
 */
@RestController
public class ValueTestController {
	@Value("${com.tyjy.name}")
	private String name;
	@Value("${com.tyjy.pw}")
	private String pwd;
	@RequestMapping("/value")
	public String get() {
		return name+","+pwd;
		
	}
}
