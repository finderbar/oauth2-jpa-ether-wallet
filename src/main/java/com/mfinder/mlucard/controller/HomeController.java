/**
 * 
 */
package com.mfinder.mlucard.controller;

import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author thein
 * @createdAt Apr 17, 2019
 */
public class HomeController {
	@GetMapping("/")
    public String root() {
        return "index";
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
