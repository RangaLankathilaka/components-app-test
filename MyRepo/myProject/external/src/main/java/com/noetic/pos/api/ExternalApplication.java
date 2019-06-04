package com.noetic.pos.api;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;

import com.noetic.pos.api.config.SpringApplicationContext;
import com.noetic.pos.api.resource.ResourceAdvice;
import com.noetic.pos.api.resource.ResponseFilter;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.UiConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan(basePackageClasses = { SpringApplicationContext.class, ResponseFilter.class,
		ResourceAdvice.class }, basePackages = { "com.noetic.pos.api.resource.v1" })
public class ExternalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalApplication.class, args);
	}

	@Bean
	public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.any())
				.paths(regex("/v.*/(pos|admin).*")).build().pathMapping("/")
				.genericModelSubstitutes(ResponseEntity.class);
	}

	@Bean
	public UiConfiguration uiConfig() {
		return UiConfiguration.DEFAULT;
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("micro-service-pos").description("POS API documentation")
				.termsOfServiceUrl("https://github.com/RangaLankathilaka")
				.contact("Ranga Lankathilaka").version("1.0")
				.build();
	}
}
