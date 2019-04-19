package com.polycis.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PolycisEurekaServerApplication extends SpringBootServletInitializer{
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(PolycisEurekaServerApplication.class);
	}
	public static void main(String[] args) {
		new SpringApplicationBuilder(PolycisEurekaServerApplication.class).web(true).run(args);
	}

}
