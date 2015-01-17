package org.upc.logistic.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogisticController {
	@RequestMapping("/")
	public String welcomeHandler() {
		return "redirect:/login/getForm";
	}
}
