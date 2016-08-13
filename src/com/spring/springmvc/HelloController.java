package com.spring.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {
	@RequestMapping(method= RequestMethod.GET)
	public String printHello(ModelMap modle){
		modle.addAttribute("message","Hello Spring MVC Framework");
		return "hello";
	}
}
