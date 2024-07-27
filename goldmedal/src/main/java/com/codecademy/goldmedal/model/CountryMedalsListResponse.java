package com.codecademy.goldmedal.model;

import java.util.List;

public class CountryMedalsListResponse {
    private List<GoldMedal> medals;

    //constructor
    public CountryMedalsListResponse(List<GoldMedal> medals) {
        this.medals = medals;
    }

    //getter
    public List<GoldMedal> getMedals() {
        return medals;
    }

    //setter
    public void setMedals(List<GoldMedal> medals) {
        this.medals = medals;
    }
}
