package com.springstudy.bbs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Member01Controller {
		
	@GetMapping("/member01")
	public String member01(Model model) {
		model.addAttribute("msg", "Member01");
		
		return "member01";
	}

}
