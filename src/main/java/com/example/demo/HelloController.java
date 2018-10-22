package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class HelloController {
	
	@GetMapping("/hello1")
	public Mono<String> helloworld1()
	{
		return Mono.just("hello world1");
	}
	
	@RequestMapping(value="/killApp")
	public @ResponseBody String kill(){
		System.exit(-1);    	
		return "Killed";

	}      

}
