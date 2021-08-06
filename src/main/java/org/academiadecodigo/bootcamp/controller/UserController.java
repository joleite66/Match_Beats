package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {

    private UserService userService;


    @Autowired
    public void setServiceUser(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}/edit")
    public String editUser(@PathVariable Integer id, Model model) {

        User savedUser = userService.getById(id);

        model.addAttribute("user", savedUser);

        return "/update";

    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""} )
    public String saveUser(@Valid @ModelAttribute("user") User user, RedirectAttributes redirectAttributes, BindingResult bindingResult) {

        userService.getUsers().add(user);

        return "redirect:index/";

    }






}

