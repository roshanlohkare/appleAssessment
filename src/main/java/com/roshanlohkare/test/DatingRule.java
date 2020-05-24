package com.roshanlohkare.test;

import com.roshanlohkare.test.domain.User;
import com.roshanlohkare.test.rule.AgeRule;
import com.roshanlohkare.test.rule.GenderRule;
import com.roshanlohkare.test.rule.InterestRule;

import java.util.*;

/**
 * Created by lenovo on 5/24/2020.
 */
public class DatingRule {

    public List<String> returnMatchList(User user, List<User> userList, int matchCount) {
        List<String> matchedUserList = new LinkedList<>();
        Map<Integer, User> userIntegerMap = new HashMap<>();
        for (User user1 : userList) {
            if (user.getName().equalsIgnoreCase(user1.getName())) {
                // Do not match to itself
                continue;
            }
            int matchPoint = this.calculateMatchPoint(user, user1);
            if (matchPoint > 0) {
                userIntegerMap.put(matchPoint, user1);
            }
        }

        Set<Map.Entry<Integer, User>> entrySet = userIntegerMap.entrySet();

        TreeMap<Integer, User> sorted = new TreeMap<>(userIntegerMap);
        Set<Map.Entry<Integer, User>> sortedUserIntegerMap = sorted.entrySet();

        int counter = 0;
        for (Map.Entry<Integer, User> mapping : sortedUserIntegerMap) {
            matchedUserList.add(mapping.getValue().getName());
            if (++counter >= matchCount) {
                break;
            }
        }
        return matchedUserList;
    }

    private int calculateMatchPoint(User user1, User user2) {
        int agePoint = 0;
        int interestPoint = 0;

        GenderRule genderRule = new GenderRule();
        int genderPoint = genderRule.compare(user1, user2);

        if (genderPoint >= 1) {
            genderPoint = genderPoint * 1000;
            AgeRule ageRule = new AgeRule();
            agePoint = ageRule.compare(user1, user2);
        }

        if (agePoint >= 1) {
            agePoint = agePoint * 100;
            InterestRule interestRule = new InterestRule();
            interestPoint = interestRule.compare(user1, user2);
        }


        return genderPoint + agePoint + interestPoint;
    }
}
