package com.javacampus.springboothelloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping; // 추가
import org.springframework.web.bind.annotation.RestController; // 추가


// @RestController // 추가
@SpringBootApplication
public class SpringboothelloworldApplication { // SpringboothelloworldApplication.java = main. 프로젝트의 entry point 역할
	// @GetMapping(value="/home") // 추가
	// public String index(){
	// 	return "index() return : Hello World in URL /home";
	// }

	public static void main(String[] args) {
		SpringApplication.run(SpringboothelloworldApplication.class, args);
	}

}
