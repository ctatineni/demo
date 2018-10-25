package com.example.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Value("${hello.message}")
	private String message;
	
	@RequestMapping("/hello")
	public String hello() throws UnknownHostException {
		InetAddress IP = InetAddress.getLocalHost();
		return "Server IP Address is - " + IP + "and the message is " + message;
	}
	
	@RequestMapping("/kill")
	public String kill() {
		System.exit(-1);
		return "";
	}
	
}
