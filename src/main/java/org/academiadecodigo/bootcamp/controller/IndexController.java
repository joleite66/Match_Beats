package org.academiadecodigo.bootcamp.controller;


import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/app")
    public String randomUser(@ModelAttribute("user") User user, Model model) {
/*
        int num = randomize();

        while (userService.getById(num).equals(user)) {

            if(!userService.getById(num).equals(user)) {

                model.addAttribute("user",userService.getUsers().get(num));

            }

            randomize();

        }*/

        int num = ((int) (Math.random() * 3) +1);


        model.addAttribute("user",userService.getUsers().get(num));

        return "teste2.html";

    }



}
