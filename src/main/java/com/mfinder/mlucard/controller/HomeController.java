package com.mfinder.mlucard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author thein
 * @createdAt Apr 17, 2019
 */
@Controller
public class HomeController {
	@GetMapping("/")
    public String root() {
		return "login";
    }
	    
    @GetMapping("/dashboard")
    public String login() {
        return "dashboard";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "access-denied";
    }
}
