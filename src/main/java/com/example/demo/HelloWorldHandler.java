package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class HelloWorldHandler {
	
	public Mono<ServerResponse> helloworld(ServerRequest request){
		return ServerResponse.ok().body(Mono.just("hello Rective world"),String.class);
	}
	

}
