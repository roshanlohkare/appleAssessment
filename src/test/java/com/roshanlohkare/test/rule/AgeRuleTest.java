package com.roshanlohkare.test.rule;

import com.roshanlohkare.test.Gender;
import com.roshanlohkare.test.domain.User;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lenovo on 5/24/2020.
 */
public class AgeRuleTest {

    @Test
    public void testCompare_1() throws Exception {
        AgeRule ageRule = new AgeRule() ;
        User user1 = new User();
        user1.setAge(27);
        User user2 = new User();
        user2.setAge(28);
        int point = ageRule.compare(user1,user2);
        Assert.assertTrue(point == 1);
    }

    @Test
    public void testCompare_2() throws Exception {
        AgeRule ageRule = new AgeRule() ;
        User user1 = new User();
        user1.setAge(27);
        User user2 = new User();
        user2.setAge(54);
        int point = ageRule.compare(user1,user2);
        Assert.assertTrue(point == 27);
    }
}