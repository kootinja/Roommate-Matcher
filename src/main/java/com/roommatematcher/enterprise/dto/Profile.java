package com.roommatematcher.enterprise.dto;

import lombok.Data;

public @Data
class Profile {
    private String gender;
    private Boolean smokingPreference;
    private Integer cleanlinessRating;
    private String location;
    private Double numberOfRoommates;
    private Double totalHousingPrice;
    private String sleepSchedule;
    private String workSchedule;
    private String description;
    private String profilePicture;

}
