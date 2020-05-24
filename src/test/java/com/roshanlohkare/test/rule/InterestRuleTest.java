package com.roshanlohkare.test.rule;

import com.roshanlohkare.test.domain.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 5/24/2020.
 */
public class InterestRuleTest {

    @Test
    public void testCompare_1() throws Exception {
        InterestRule interestRule = new InterestRule() ;
        User user1 = new User();
        List<String> i1 = new ArrayList<>() ;
        i1.add("Cricket");
        i1.add("Football");
        i1.add("Movies");
        user1.setInterests(i1);
        User user2 = new User();
        List<String> i2 = new ArrayList<>() ;
        i2.add("Cricket");
        i2.add("Badminton");
        user2.setInterests(i2);
        int point = interestRule.compare(user1,user2);
        Assert.assertTrue(point == 1);
    }

    @Test
    public void testCompare_2() throws Exception {
        InterestRule interestRule = new InterestRule() ;
        User user1 = new User();
        List<String> i1 = new ArrayList<>() ;
        i1.add("Cricket");
        i1.add("Football");
        i1.add("Movies");
        user1.setInterests(i1);
        User user2 = new User();
        List<String> i2 = new ArrayList<>() ;
        i2.add("Tennis");
        i2.add("Badminton");
        user2.setInterests(i2);
        int point = interestRule.compare(user1,user2);
        Assert.assertTrue(point == 0);
    }
}