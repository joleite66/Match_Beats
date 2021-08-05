package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.Bootstrap;
import org.academiadecodigo.bootcamp.persistance.model.User;
import org.academiadecodigo.bootcamp.services.LoginService;

import java.util.List;

public class LoginController {

    private LoginService loginService;

    public LoginController() {
        loginService = new LoginService();
    }

    //matchbeats/login;
    public String login(String username, String password){

        if (!loginService.login(username,password)) {
            return ""; //view login again
        }
        return ""; //matchbeats/{id}
    }


    public void logout(){
        //return login view
    }


    //ligaç\ao do user a partir de um link



}
