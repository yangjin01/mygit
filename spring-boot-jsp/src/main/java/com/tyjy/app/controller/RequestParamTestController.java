package com.tyjy.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
/**
 * @RequestParam("value")可以将URL中的参数value绑定到处理函数方法的变量中
 * 浏览器访问地址为：http://localhost:8080/test/?value=123
 * 页面返回结果为"str=123"
 *
 */
@RestController
public class RequestParamTestController {
	@RequestMapping("/test")
	public String getRequestParamValue(@RequestParam("value") String str) {
		
		return "str="+str;
	}
}
