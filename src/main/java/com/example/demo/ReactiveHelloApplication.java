package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import static org.springframework.web.reactive.function.server.RequestPredicates.DELETE;
import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.PUT;

import reactor.core.publisher.Mono;

@SpringBootApplication
@EnableRedisRepositories
public class ReactiveHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactiveHelloApplication.class, args);
	}
	
	@Bean
	public RouterFunction<ServerResponse> routes(HelloWorldHandler handler){
		return RouterFunctions.route(GET("/hello"), handler::helloworld);
	}
	
	
}
