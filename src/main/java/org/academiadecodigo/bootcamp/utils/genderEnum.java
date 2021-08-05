package org.academiadecodigo.bootcamp.utils;

public enum genderEnum {
    M("Male"),
    F("Female"),
    T("Transgender"),
    U("Undefined");

    public String gender;


    genderEnum(String gender) {
        this.gender = gender;
    }
}

