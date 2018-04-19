package com.tyjy.app;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.tyjy.app.dao")
//@ComponentScan("com.tyjy.app.service.imp")
public class SpringBootMybatisApplication {//

	public static void main(String[] args) {
		
		SpringApplication.run(SpringBootMybatisApplication.class, args);
	}
}
