package org.academiadecodigo.bootcamp.model;

import org.academiadecodigo.bootcamp.manager.UserManager;
import org.academiadecodigo.bootcamp.services.UserService;
import org.academiadecodigo.bootcamp.utils.genderEnum;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private genderEnum gender;
    private Integer age;
    private Integer musicExp;
    private String instrument;
    private String aboutMe;
    private Matcher matcher;
    private List<String> favouriteMusicians = new ArrayList<>();
    private List<String> musicGenre = new ArrayList<>();
    private List<Integer> likedIDs = new ArrayList<>();

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

    public genderEnum getGender() {
        return gender;
    }

    public void setGender(genderEnum gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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

    public Matcher getMatcher() {
        return matcher;
    }

    public void setMatcher(Matcher matcher) {
        this.matcher = matcher;
    }

    public List<String> getFavouriteMusicians() {
        return favouriteMusicians;
    }

    public List<String> getMusicGenre() {
        return musicGenre;
    }

    public List<Integer> getLikedIDs() {
        return likedIDs;
    }


    public UserManager getUserManager() {
        return userManager;
    }

    public void setUserManager(UserManager userManager) {
        this.userManager = userManager;
    }

    public UserService getServiceUser() {
        return userService;
    }

    public void setServiceUser(UserService userService) {
        this.userService = userService;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", musicExp=" + musicExp +
                ", instrument='" + instrument + '\'' +
                ", aboutMe='" + aboutMe + '\'' +
                ", matcher=" + matcher +
                ", favouriteMusicians=" + favouriteMusicians +
                ", musicGenre=" + musicGenre +
                ", likedIDs=" + likedIDs +
                '}';
    }
}
