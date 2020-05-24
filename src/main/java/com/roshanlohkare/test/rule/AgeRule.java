package com.roshanlohkare.test.rule;

import com.roshanlohkare.test.domain.User;

import java.util.Comparator;

/**
 * Created by lenovo on 5/24/2020.
 */
public class AgeRule  implements Comparator<User> {
    public int compare(User o1, User o2) {
        return Math.abs(o1.getAge()-o2.getAge());
    }
}
