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
public class RegisterController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/register"})
    public String addUser(Model model) {

        model.addAttribute("user",new User());

        return "register.html"; //return login view;

    }


    @RequestMapping(method = RequestMethod.POST, path = {"/register"})
    public String persistUser(@ModelAttribute("user") User user){

        userService.addUser(user);

        return "redirect:/login.html";
    }


}
