package org.academiadecodigo.bootcamp.services;


import org.academiadecodigo.bootcamp.Bootstrap;
import org.academiadecodigo.bootcamp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.regex.Matcher;

@Service
public class UserService {

    private Bootstrap bootstrap;
    private List<User> users;
    private Matcher matcher;

    public UserService() {
        this.bootstrap = new Bootstrap();
        users = bootstrap.getListOfUser();
    }

    public List<User> getUsers() {
        return users;
    }


    public User getById(int id) {

        for (User user: users) {

            if(user.getId() == id) {
                return user;
            }

        }
        return null;
    }

    public User addUser() {
        //adds a user to the data base
        return new User();
    }

    public void editUser() {
        //edits the information of the user selected
        //needs credentials?
    }

    public void removeUser() {
        //removes the suer from the dataabse
        //needs credentials?
    }

}
