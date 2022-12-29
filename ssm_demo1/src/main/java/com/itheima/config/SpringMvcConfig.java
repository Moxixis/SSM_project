package com.itheima.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.itheima.controller", "com.itheima.config"})//包含扫描了异常处理控制器
@EnableWebMvc
public class SpringMvcConfig {
}
