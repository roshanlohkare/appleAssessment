package com.roshanlohkare.test.rule;

import com.roshanlohkare.test.domain.User;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by lenovo on 5/24/2020.
 */
public class InterestRule implements Comparator<User> {
    public int compare(User o1, User o2) {
        List<String> user1InterestList = o1.getInterests();
        List<String> user2InterestList = o2.getInterests();

        Set<String> commonInterest = user1InterestList.stream()
                .distinct()
                .filter(user2InterestList::contains)
                .collect(Collectors.toSet());

        if (commonInterest != null) {
            return commonInterest.size();
        }
        return 0;
    }
}
