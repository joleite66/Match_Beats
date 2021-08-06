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

        User user1 = new User();
        User user2 = new User();
        User user3 = new User();
        User user4 = new User();

        user1.setUserFoto("https://pixabay.com/get/gbdf221728c4a9e3e1cb550f80da8e77730438fbffa48839f05207a7f2d3e71d5bad07cfc92ecdb31ebccf0d4095b98b4_640.jpg");
        user1.setId(1);
        user1.setUserName("MCSara");
        user1.setPassword("codecadet");
        user1.setFirstName("Sara");
        user1.setLastName("Lopes");
        user1.setMusicExp(10);
        user1.setInstrument("Guitar");
        user1.setAboutMe("I love music more than me");
        user1.setFavouriteMusicians("Tame Impala");
        user1.setMusicGenre("Alternative");


        user2.setUserFoto("https://pixabay.com/get/gcefc4dd7bf8d6db8e81fbc85a5e66864837c0e807dc239ea9df9d62d288d4d48607512ed4335fba8292000c85a19436e_640.jpg");
        user2.setId(2);
        user2.setUserName("joleite");
        user2.setPassword("helloworld");
        user2.setFirstName("Daniel");
        user2.setLastName("igreja");
        user2.setMusicExp(3);
        user2.setInstrument("Maraca");
        user2.setAboutMe("I love playing maraca with friends");
        user2.setFavouriteMusicians("Madona");
        user2.setMusicGenre("Jazz");


        user3.setUserFoto("https://pixabay.com/get/gd64e5d34960598b5ae734c54fe3fb4d3d26a6499888c499de6b0029a3faa2e018ee34e7daefcd42b8028e0392d7c0af7_640.jpg");
        user3.setId(3);
        user3.setUserName("mysexycat");
        user3.setPassword("sexybody");
        user3.setFirstName("Bertolo");
        user3.setLastName("Mendes");
        user3.setMusicExp(35);
        user3.setInstrument("Clarinet");
        user3.setAboutMe("Can't live without music");
        user3.setFavouriteMusicians("Elton Jonh");
        user3.setMusicGenre("Country");

        user4.setUserFoto("https://pixabay.com/get/g71ee88903dfb95c1d61c3ad8e8cb596577cfea2c1153fb47ba2ad7c527c3360c8eacd3f181d647736518a5e9bf5a28fc_640.jpg");
        user4.setId(4);
        user4.setUserName("goodlife");
        user4.setPassword("love");
        user4.setFirstName("Marujo");
        user4.setLastName("Ribau");
        user4.setMusicExp(102);
        user4.setInstrument("Accordion");
        user4.setAboutMe("I live for the music");
        user4.setFavouriteMusicians("Beyonce");
        user4.setMusicGenre("Rock");

        listOfUser.add(user1);
        listOfUser.add(user2);
        listOfUser.add(user3);
        listOfUser.add(user4);

    }
}