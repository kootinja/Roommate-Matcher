package com.roommatematcher.enterprise.dto;

import lombok.Data;

public @Data

/**
 * @param gender a stiring representing this profile's gender identity
 * @param smokingPreference a boolean indicating if the user is okay with smoking in their home
 * @param cleanliness a string indicating how clean the user is
 * @param location a string storing the users living location
 * @param numberOfPeople a double storing the preferred number of roommates (self included)
 * @param priceTotal a double storing the total price of the profile's living space
 * @param sleepSchedule a string of the profile's sleep schedule
 * @param workSchedule a string storing the profile's expected work schedule
 * @param description @NOTE is this a description of the user? Of a living space? needs documented by creator
 * @param profilePicture how is a picture stored as a string? Does this reference a file name in  a database?
 */
class Profile {
    private String gender;
    private Boolean smokingPreference;
    private String cleanliness;
    private String location;
    private Double numberOfPeople;
    private Double priceTotal;
    private String sleepSchedule;
    private String workSchedule;
    private String description;
    private String profilePicture;

}
