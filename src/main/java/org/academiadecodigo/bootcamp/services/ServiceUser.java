package org.academiadecodigo.bootcamp.services;

import org.academiadecodigo.bootcamp.persistance.model.Matcher;
import org.academiadecodigo.bootcamp.persistance.model.User;

public class ServiceUser {

    private User user;
    private Matcher matcher;

    public void login() {
        //if person is in database, login = true;
        //else, doesnt comeback
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
