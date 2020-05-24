package com.roshanlohkare.test.rule;

import com.roshanlohkare.test.Gender;
import com.roshanlohkare.test.domain.User;
import org.junit.Assert;

/**
 * Created by lenovo on 5/24/2020.
 */
public class GenderRuleTest {

    @org.junit.Test
    public void testCompare_1() throws Exception {
        GenderRule genderRule = new GenderRule() ;
        User user1 = new User();
        user1.setGender(Gender.MALE.getValue());
        User user2 = new User();
        user2.setGender(Gender.FEMALE.getValue());
        int point = genderRule.compare(user1,user2);
        Assert.assertTrue(point == 100);
    }

    @org.junit.Test
    public void testCompare_2() throws Exception {
        GenderRule genderRule = new GenderRule() ;
        User user1 = new User();
        user1.setGender(Gender.FEMALE.getValue());
        User user2 = new User();
        user2.setGender(Gender.FEMALE.getValue());
        int point = genderRule.compare(user1,user2);
        Assert.assertTrue(point==0);
    }
}