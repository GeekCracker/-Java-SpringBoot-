package com.springboot.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages="com.springboot")
@MapperScan(basePackages="com.springboot.mapper")
@EnableAutoConfiguration
public class BootRun {

	public static void main(String[] args) {
		SpringApplication springApplication = new SpringApplication(BootRun.class);
		springApplication.run(args);
	}
}
