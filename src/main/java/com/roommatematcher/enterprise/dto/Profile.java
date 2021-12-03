package com.roommatematcher.enterprise.dto;

import lombok.Data;
import com.google.gson.annotations.SerializedName;

public @Data
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
