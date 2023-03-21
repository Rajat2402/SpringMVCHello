package org.studyeasy;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class App {

	@GetMapping(value = "/")
	public String welcome() {
		return "welcome";
		
	}
	@GetMapping(value="/displayName")
	public String display(Model model, HttpServletRequest request)
	{
		String name= request.getParameter("firstName");
		model.addAttribute("name", name);
		return "display";
	}
}
