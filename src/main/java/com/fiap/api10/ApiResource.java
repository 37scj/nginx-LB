package com.fiap.api10;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * REST controller for managing the current user's account.
 */
@RestController
@RequestMapping("/api")
public class ApiResource {

    @GetMapping("/user")
    public String isAuthenticated(HttpServletRequest request) {
        return "Nikola Tesla";
    }

}