package com.Practice.SpringDemoAnnotation2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.Practice.SpringDemoAnnotation2")
@PropertySource("classpath:student.properties")
public class Config {
}
