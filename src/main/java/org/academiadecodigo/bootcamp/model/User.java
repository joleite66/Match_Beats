package org.academiadecodigo.bootcamp.model;

import org.academiadecodigo.bootcamp.services.UserService;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String userFoto;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private Integer musicExp;
    private String instrument;
    private String aboutMe;
    private int phone;
    private String email;

    private String favouriteMusicians;
    private String musicGenre;
    private String likedIDs;

    private Matcher matcher;
    private boolean isLogin;

    private UserService userService;

    //photo link


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getMusicExp() {
        return musicExp;
    }

    public void setMusicExp(Integer musicExp) {
        this.musicExp = musicExp;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Matcher getMatcher() {
        return matcher;
    }

    public void setMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    public String getFavouriteMusicians() {
        return favouriteMusicians;
    }

    public void setFavouriteMusicians(String favouriteMusicians) {
        this.favouriteMusicians = favouriteMusicians;
    }

    public String getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(String musicGenre) {
        this.musicGenre = musicGenre;
    }

    public String getLikedIDs() {
        return likedIDs;
    }

    public void setLikedIDs(String likedIDs) {
        this.likedIDs = likedIDs;
    }


    public String getUserFoto() {
        return userFoto;
    }

    public void setUserFoto(String userFoto) {
        this.userFoto = userFoto;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", musicExp=" + musicExp +
                ", instrument='" + instrument + '\'' +
                ", aboutMe='" + aboutMe + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                ", favouriteMusicians=" + favouriteMusicians +
                ", musicGenre=" + musicGenre +
                ", likedIDs=" + likedIDs +
                '}';
    }

}
