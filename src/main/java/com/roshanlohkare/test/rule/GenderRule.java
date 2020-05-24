package com.roshanlohkare.test.rule;

import com.roshanlohkare.test.Gender;
import com.roshanlohkare.test.domain.User;

import java.util.Comparator;

/**
 * Created by lenovo on 5/24/2020.
 */
public class GenderRule implements Comparator<User> {
    public int compare(User o1, User o2) {
        if (Gender.FEMALE.getValue().equalsIgnoreCase(o1.getGender())) {
            if (Gender.MALE.getValue().equalsIgnoreCase(o2.getGender())) {
                return 1;
            }
        } else if (Gender.MALE.getValue().equalsIgnoreCase(o1.getGender())) {
            if (Gender.FEMALE.getValue().equalsIgnoreCase(o2.getGender())) {
                return 1;
            }
        }
        return 0;
    }
}
