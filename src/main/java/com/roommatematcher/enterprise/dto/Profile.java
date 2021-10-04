package com.roommatematcher.enterprise.dto;

import lombok.Data;

public @Data
class Profile {
    private String gender;
    private Boolean smokingPreference;
    private String cleanliness;
    private String location;
    private Double numberOfPeople;
    private String sleepSchedule;
    private String workSchedule;
    private String description;
    private String profilePicture;
    private String name;
    private int age;
}
