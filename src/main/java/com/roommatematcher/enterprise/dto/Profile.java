package com.roommatematcher.enterprise.dto;

import lombok.Data;
import com.google.gson.annotations.SerializedName;

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
    @SerializedName("gender")
    private String gender;
    @SerializedName("smokingPreference")
    private Boolean smokingPreference;
    @SerializedName("cleanliness")
    private String cleanliness;
    @SerializedName("location")
    private String location;
    @SerializedName("numberOfPeople")
    private Double numberOfPeople;
    @SerializedName("sleepSchedule")
    private String sleepSchedule;
    @SerializedName("workSchedule")
    private String workSchedule;
    @SerializedName("description")
    private String description;
    @SerializedName("profilePicture")
    private String profilePicture;
    @SerializedName("name")
    private String name;
    @SerializedName("age")
    private int age;

    //this method will add increased persistence functionality
    //when a profile is added to the database, the profile ID will need to be extracted and placed into persistence storage
    //without this functionality we will have no foreign keys by which we can tie profile attributes together in the database
    public String getProfileId() {
        String profileId = "";
        return profileId;
    }
}
