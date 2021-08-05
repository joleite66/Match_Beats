package org.academiadecodigo.bootcamp.persistance.model;

import org.academiadecodigo.bootcamp.utils.genderEnum;

import java.util.ArrayList;
import java.util.List;

public class User {

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
    //photo link



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

    public void setGender(genderEnum gender) {
        this.gender = gender;
    }

    public genderEnum getGender() {
        return gender;
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

    public List<String> getFavouriteMusicians() {
        return favouriteMusicians;
    }

    public void setFavouriteMusicians(List<String> favouriteMusicians) {
        this.favouriteMusicians = favouriteMusicians;
    }

    public List<String> getMusicGenre() {
        return musicGenre;
    }

    public void setMusicGenre(List<String> musicGenre) {
        this.musicGenre = musicGenre;
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

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sex='" + gender + '\'' +
                ", age=" + age +
                ", musicExp=" + musicExp +
                ", instrument='" + instrument + '\'' +
                ", aboutMe='" + aboutMe + '\'' +
                ", matcher=" + matcher +
                ", favouriteMusicians=" + favouriteMusicians +
                ", musicGenre=" + musicGenre +
                '}';
    }
}
