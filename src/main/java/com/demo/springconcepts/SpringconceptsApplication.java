package com.demo.springconcepts;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.demo.springconcepts.component.DemoBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
/**
 * @SpringBootApplication to declare class main app class
 * ApplicationContext to configure SpringConceptApplication
 * Logger object to Loging messages of SpringConceptsApplication 
 */
@SpringBootApplication
public class SpringconceptsApplication {
	public static final Logger logger = LoggerFactory.getLogger(SpringconceptsApplication.class);
	public static void main(String[] args) {
		logger.debug("Welcome to Spring Concept Demo");
		ApplicationContext context = SpringApplication.run(SpringconceptsApplication.class, args);
		logger.debug("Checking Context : "+context.getBean(DemoBean.class));
	}

}