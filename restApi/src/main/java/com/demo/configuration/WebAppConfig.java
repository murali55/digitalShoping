package com.demo.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc //similar to <mvc:annotation-driven> in dispatcher-servlet.xml
@ComponentScan (basePackages="com.demo")//similar to <context:component-scan> in dispatcher-servlet.xml 
public class WebAppConfig {
	public WebAppConfig(){
		System.out.println("WebAppConfig class is loaded and instantiated");
	}

}
