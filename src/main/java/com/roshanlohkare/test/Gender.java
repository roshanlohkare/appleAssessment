package com.roshanlohkare.test;

/**
 * Created by lenovo on 5/24/2020.
 */
public enum Gender {
    MALE("Male"),
    FEMALE("Female");

    String value;

    Gender(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value ;
    }


}
