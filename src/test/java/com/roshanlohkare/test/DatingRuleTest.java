package com.roshanlohkare.test;

import com.roshanlohkare.test.domain.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 5/24/2020.
 */
public class DatingRuleTest {

    @Test
    public void testReturnMatchList() throws Exception {
        DatingRule datingRule = new DatingRule();

        User testUser = new User();
        testUser.setName("UserB");
        testUser.setGender(Gender.MALE.getValue());
        testUser.setAge(27);
        List<String> interestList2 = new ArrayList<>();
        interestList2.add("Cricket");
        interestList2.add("Football");
        interestList2.add("Movies");
        testUser.setInterests(interestList2);

        List<String> matchedUserList = datingRule.returnMatchList(testUser, this.createTestData(), 2);

        matchedUserList.stream().forEach(user -> System.out.println(user));

    }

    private List<User> createTestData() {
        List<User> userList = new ArrayList<>();

        User user1 = new User();
        user1.setName("UserA");
        user1.setGender(Gender.FEMALE.getValue());
        user1.setAge(25);
        List<String> interestList1 = new ArrayList<>();
        interestList1.add("Cricket");
        user1.setInterests(interestList1);
        userList.add(user1);

        User user2 = new User();
        user2.setName("UserB");
        user2.setGender(Gender.MALE.getValue());
        user2.setAge(27);
        List<String> interestList2 = new ArrayList<>();
        interestList2.add("Cricket");
        interestList2.add("Football");
        interestList2.add("Movies");
        user2.setInterests(interestList2);
        userList.add(user2);

        User user3 = new User();
        user3.setName("UserC");
        user3.setGender(Gender.MALE.getValue());
        user3.setAge(26);
        List<String> interestList3 = new ArrayList<>();
        interestList3.add("Movies");
        interestList3.add("Tennis");
        interestList3.add("Football");
        interestList3.add("Cricket");
        user3.setInterests(interestList3);
        userList.add(user3);

        User user4 = new User();
        user4.setName("UserD");
        user4.setGender(Gender.FEMALE.getValue());
        user4.setAge(24);
        List<String> interestList4 = new ArrayList<>();
        interestList4.add("Tennis");
        interestList4.add("Football");
        interestList4.add("Badminton");
        user4.setInterests(interestList4);
        userList.add(user4);

        User user5 = new User();
        user5.setName("UserE");
        user5.setGender(Gender.FEMALE.getValue());
        user5.setAge(32);
        List<String> interestList5 = new ArrayList<>();
        interestList5.add("Cricket");
        interestList5.add("Football");
        interestList5.add("Football");
        interestList5.add("Badminton");
        user5.setInterests(interestList5);
        userList.add(user5);

        return userList;
    }
}