package org.studyeasy;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class App {

	@GetMapping(value = "/")
	public String welcome() {
		return "welcome";
		
	}
}
