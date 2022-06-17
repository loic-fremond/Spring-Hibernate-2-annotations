package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sport.properties")
// commented to make use only of the beans manually defined
// @ComponentScan("com.luv2code.springdemo.MyLoggerConfigNoXml")
public class SportConfig {
	
	// define bean for our sad fortune service
	// method name will be the bean id
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
	
	// define bean for our boxing coach and inject dependency
	@Bean
	public Coach boxingCoach() {
		// note how sadFortuneService() as a param is written with its paren, that's because we call bean method sadFortuneService() that returns said fortune service
		return new BoxingCoach(sadFortuneService());
	}

}
