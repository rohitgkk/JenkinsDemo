package com.TmobileDemo.spring.helloWorld;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
	@RequestMapping("/")
	 public String home() {
		 return ".......Hellommmkkkks.... World";
	 }
}
