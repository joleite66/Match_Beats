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
        User user5 = new User();
        User user6 = new User();
        User user7 = new User();
        User user8 = new User();
        User user9 = new User();
        User user10 = new User();
        User user11 = new User();
        User user12 = new User();

        user1.setUserFoto("https://i.imgur.com/oZY7vCA.jpg");
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


        user2.setUserFoto("https://i.imgur.com/QPizvni.jpg");
        user2.setId(2);
        user2.setUserName("joleite");
        user2.setPassword("helloworld");
        user2.setFirstName("Daniel");
        user2.setLastName("igreja");
        user2.setMusicExp(3);
        user2.setInstrument("gaita");
        user2.setAboutMe("I love playing maraca with friends");
        user2.setFavouriteMusicians("Madona");
        user2.setMusicGenre("Jazz");


        user3.setUserFoto("https://i.imgur.com/dZqFhTH.jpg");
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

        user4.setUserFoto("https://i.imgur.com/yJrUedd.jpg");
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


        user5.setUserFoto("https://i.imgur.com/edhgNXX.jpg");
        user5.setId(5);
        user5.setUserName("user5");
        user5.setPassword("user5");
        user5.setFirstName("Patricia");
        user5.setLastName("Iaczinski");
        user5.setMusicExp(20);
        user5.setInstrument("Flauta");
        user5.setAboutMe("I live for Rock anr Roll");
        user5.setFavouriteMusicians("Kiss");
        user5.setMusicGenre("Rock");


        user6.setUserFoto("https://i.imgur.com/mP6zNEb.jpg");
        user6.setId(8);
        user6.setUserName("user6");
        user6.setPassword("user6");
        user6.setFirstName("João");
        user6.setLastName("Fonte");
        user6.setMusicExp(1);
        user6.setInstrument("Pratos");
        user6.setAboutMe("I am the real Jean Marc");
        user6.setFavouriteMusicians("U2");
        user6.setMusicGenre("Pop-Rock");

        user7.setUserFoto("https://i.imgur.com/x7Io7gH.jpg");
        user7.setId(7);
        user7.setUserName("user7");
        user7.setPassword("user7");
        user7.setFirstName("Stevenson");
        user7.setLastName("Mendonça");
        user7.setMusicExp(5);
        user7.setInstrument("Cavaquinho");
        user7.setAboutMe("Bagulho ta doido!");
        user7.setFavouriteMusicians("Roberto Carlos");
        user7.setMusicGenre("Baladas Brasileiras");

        user8.setUserFoto("https://i.imgur.com/9AIsz2G.jpg");
        user8.setId(8);
        user8.setUserName("user8");
        user8.setPassword("user8");
        user8.setFirstName("Thomaz");
        user8.setLastName("Kopanakis");
        user8.setMusicExp(20);
        user8.setInstrument("Moog Voyager XL Black face mod");
        user8.setAboutMe("Ta zoando com a facção");
        user8.setFavouriteMusicians("David Bowie");
        user8.setMusicGenre("Orgy Music");

        user9.setUserFoto("https://i.imgur.com/VBduTE4.jpg");
        user9.setId(9);
        user9.setUserName("user9");
        user9.setPassword("user9");
        user9.setFirstName("Mego");
        user9.setLastName("Santos");
        user9.setMusicExp(3);
        user9.setInstrument("Saxofone");
        user9.setAboutMe("Hoje é dia de maldade");
        user9.setFavouriteMusicians("Dua Lipa");
        user9.setMusicGenre("Pop");

        user10.setUserFoto("https://i.imgur.com/mP6zNEb.jpg");
        user10.setId(10);
        user10.setUserName("user10");
        user10.setPassword("user10");
        user10.setFirstName("Rui");
        user10.setLastName("Miguel");
        user10.setMusicExp(3);
        user10.setInstrument("Bateria");
        user10.setAboutMe("Bateria é vida!");
        user10.setFavouriteMusicians("Breaking Benjamin");
        user10.setMusicGenre("Metal");

        user11.setUserFoto("https://i.imgur.com/x7Io7gH.jpg");
        user11.setId(11);
        user11.setUserName("user11");
        user11.setPassword("user11");
        user11.setFirstName("João");
        user11.setLastName("Santos");
        user11.setMusicExp(12);
        user11.setInstrument("Baixo");
        user11.setAboutMe("I love Jean Marc");
        user11.setFavouriteMusicians("Ivete Sangalo");
        user11.setMusicGenre("Baladas");

        user12.setUserFoto("https://i.imgur.com/XnyJipm.jpg");
        user12.setId(12);
        user12.setUserName("user12");
        user12.setPassword("user12");
        user12.setFirstName("Zé");
        user12.setLastName("Maria");
        user12.setMusicExp(2);
        user12.setInstrument("Orgão");
        user12.setAboutMe("I live for Rock anr Roll");
        user12.setFavouriteMusicians("Roberto Carlos");
        user12.setMusicGenre("Brasileiradas");


        listOfUser.add(user1);
        listOfUser.add(user2);
        listOfUser.add(user3);
        listOfUser.add(user4);

        listOfUser.add(user5);
        listOfUser.add(user6);
        listOfUser.add(user7);
        listOfUser.add(user8);

        listOfUser.add(user9);
        listOfUser.add(user10);
        listOfUser.add(user11);
        listOfUser.add(user12);



    }
}