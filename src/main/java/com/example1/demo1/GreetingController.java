package com.example1.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name1", required=false, defaultValue="World") String namePerson, Model model) {
		model.addAttribute("name2", namePerson);
		return "greeting";
	}

}
