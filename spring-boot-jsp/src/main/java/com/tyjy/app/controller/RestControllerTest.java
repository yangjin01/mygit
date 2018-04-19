package com.tyjy.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.tyjy.app.model.User;
/**
 * @RestController  Spring4之后新加入的注解，
 * 原来返回json需要@ResponseBody和@Controller配合。
 * 即@RestController是@ResponseBody和@Controller的组合注解。
 * 
 *
 */
@RestController
@RequestMapping("/rest")
public class RestControllerTest {
	@RequestMapping(value = "/vo", method = RequestMethod.GET)
	public User getUser() {
		User user=new User();
		user.setUsername("fwefwef");
		user.setUserpwd("fffef");
		return user;
		
	}
	@RequestMapping(value = "/string", method = RequestMethod.GET)
    // @ResponseStatus(HttpStatus.OK)  
    public String getUserHtml() {
        return "{'example':'---'}";
    }
}
