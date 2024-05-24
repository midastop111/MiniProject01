package com.springstudy.bbs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Member02Controller {

	@GetMapping("/member02")
	public String member02(Model model) {
		model.addAttribute("msg", "Member02");

		return "member02";

	}	
}
