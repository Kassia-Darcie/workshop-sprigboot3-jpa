package com.kassiadarcie.webservices_com_springboot.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


@Configuration
public class SwaggerConfig {
	@Bean
	public OpenAPI apiInfo(@Value("${application-description}") String appDescription, 
			@Value("${application-version}") String appVersion) {
		return new OpenAPI()
				.info(new Info()
						.title("Webservice api")
						.version(appVersion)
						.description(appDescription)
						);
	}
}
