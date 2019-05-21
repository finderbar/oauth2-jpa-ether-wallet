/**
 * 
 */
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
        return "index";
    }
	
	@GetMapping("/index.html")
	public String indexXtml() {
		System.out.print("hello owrld");
		return "index.html";
	}

    @GetMapping("/user")
    public String userIndex() {
        return "user/index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/access-denied")
    public String accessDenied() {
        return "/error/access-denied";
    }
}
