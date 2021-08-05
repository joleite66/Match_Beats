package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.Bootstrap;
import org.academiadecodigo.bootcamp.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginService {

    private Bootstrap bootstrap;
    private List<User> users;

    public LoginService() {
        this.bootstrap = new Bootstrap();
        users = bootstrap.getListOfUser();
    }

    public boolean login(String username, String password) {

        for (User user : users) {

            if (user.getUserName().equals(username)) {
                if (user.getPassword().equals(password)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

}
