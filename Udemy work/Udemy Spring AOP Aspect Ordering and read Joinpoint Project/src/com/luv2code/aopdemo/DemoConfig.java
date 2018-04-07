package com.luv2code.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//Pure Java Configuration for spring config file
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.luv2code.aopdemo") //here we are telling that where to go and scan for the beans
public class DemoConfig {

}
