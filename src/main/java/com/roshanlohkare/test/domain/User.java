package com.roshanlohkare.test.domain;

import com.roshanlohkare.test.Gender;

import java.util.List;

/**
 * Created by lenovo on 5/24/2020.
 */
public class User {
    private String name ;
    private String gender ;
    private int age ;
    private List<String> interests ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }


}
