package com.lkc.admin.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lkc.admin.service.AuthService;

@RestController
public class IndexController {
    @Autowired
    private AuthService authService;

    @RequestMapping("/")
    public String index(){
        return "hello";
    }
    @RequestMapping("/login/github")
    public void loginWithGithub(HttpServletResponse response) {
        try {
            response.sendRedirect(authService.getGithubOauthUrl());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
