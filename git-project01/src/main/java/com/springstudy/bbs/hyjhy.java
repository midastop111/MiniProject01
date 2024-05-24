package com.springstudy.bbs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hyjhy {
	
	@GetMapping("/hyjhy")
	public String hyjhymain(Model model) {
		model.addAttribute("msg", "hyjhy");
		return "hyjhy";
	}
}
