package com.roommatematcher.enterprise.dto;

import lombok.Data;

/**
 * The data transfer object for created user profiles
 * <p>
 *     This class handles what kind of data will be entered and stored
 *     when a suer creates a profile
 * </p>
 * @author <<yournamehere>>
 */
public @Data
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
