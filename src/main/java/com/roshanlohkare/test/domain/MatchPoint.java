package com.roshanlohkare.test.domain;

/**
 * Created by lenovo on 5/24/2020.
 */
public class MatchPoint implements Comparable {
    private int genderPoint ;
    private int agePoint ;
    private int interestPoint;

    public int getGenderPoint() {
        return genderPoint;
    }

    public void setGenderPoint(int genderPoint) {
        this.genderPoint = genderPoint;
    }

    public int getAgePoint() {
        return agePoint;
    }

    public void setAgePoint(int agePoint) {
        this.agePoint = agePoint;
    }

    public int getInterestPoint() {
        return interestPoint;
    }

    public void setInterestPoint(int interestPoint) {
        this.interestPoint = interestPoint;
    }

    @Override
    public int compareTo(Object o) {

        return 0;
    }
}
