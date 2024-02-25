package com.javacampus.springboothelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController // 추가
public class HomeController {
    @GetMapping(value="/home") // 추가
	public String index(){
		return "index() return : Hello World in URL /home";
	}
}
