package com.javacampus.springboothelloworld;

// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController // 추가
public class HomeController {
    // @GetMapping(value="/home") // 추가
    @RequestMapping(value="/", method=RequestMethod.GET)
	public String home(){
		return "home() return : Hello World in URL /";
	}
}
