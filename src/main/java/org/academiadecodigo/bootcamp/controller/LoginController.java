package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.services.LoginService;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class LoginController {

    private LoginService loginService;
    private UserService userService;

    @Autowired
    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = {"/login", "/", ""})
    public String showLogin(Model model) {

        model.addAttribute("user", new User());

        return "login.html"; //return login view;

    }


    @RequestMapping(method = RequestMethod.POST, path = {"/login"})
    public String execLogin(@ModelAttribute("user") User user, Model model) {

        if (loginService.login(user.getUserName(), user.getPassword())) {

            int num = ((int) (Math.random() * 12) +1);


            model.addAttribute("user",userService.getById(num));

            return "teste2.html"; //view login again

        }

        return "redirect:/login.html";

    }

}
