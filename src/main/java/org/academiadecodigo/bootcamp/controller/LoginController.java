package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class LoginController {

    private LoginService loginService;

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }


    @RequestMapping(method = RequestMethod.GET, path = {"/login", "/",""})
    public String showLogin() {
        return "login.html"; //return login view;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/login/{username}/{password}"})
    public String execLogin(@PathVariable String username, @PathVariable String password){

        if (!loginService.login(username,password)) {
            return ""; //view login again
        }
        return ""; //matchbeats/{id}
    }



}
