package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.model.User;

import java.util.ArrayList;
import java.util.List;

public class Bootstrap {

    public Bootstrap() {
        this.listOfUser = new ArrayList<>();
        this.start();
    }

    private List<User> listOfUser;

    public List<User> getListOfUser() {
        return listOfUser;
    }

    public void start() {

        User user = new User();
        User user1 = new User();

        user.setId(1);
        user.setUserName("Daniel");
        user.setPassword("ola");
        user.setFirstName("Daniel");
        user.setLastName("igreja");
        user.setMusicExp(10);
        user.setInstrument("flauta");
        user.setAboutMe("ok eu toco bem");
        user.getFavouriteMusicians().add("Tame Impala");
        user.getFavouriteMusicians().add("Strokes");
        user.getMusicGenre().add("Alternative");
        user.getMusicGenre().add("Electronic");

        user1.setId(2);
        user1.setUserName("Daniel");
        user1.setPassword("ola");
        user1.setFirstName("Daniel");
        user1.setLastName("igreja");
        user1.setMusicExp(10);
        user1.setInstrument("flauta");
        user1.setAboutMe("ok eu toco bem");
        user1.getFavouriteMusicians().add("Tame Impala");
        user1.getFavouriteMusicians().add("Strokes");
        user1.getMusicGenre().add("Alternative");
        user1.getMusicGenre().add("Electronic");

        listOfUser.add(user);
        listOfUser.add(user1);

    }


}
