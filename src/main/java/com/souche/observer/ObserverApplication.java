package com.souche.observer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ObserverApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext=SpringApplication.run(ObserverApplication.class, args);
		MyPubisher myPubisher=(MyPubisher) configurableApplicationContext.getBean("myPublisher");
		myPubisher.publishEvent(new MyTestEvent(1));
	}
}
