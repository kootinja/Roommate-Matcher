package com.roommatematcher.enterprise.service;

import com.roommatematcher.enterprise.dto.Profile;
import org.springframework.stereotype.Component;

/**
 *stub is just a  hard coded representation of what actual implementation will make. The implementation details are the given when then from project
 might need to change so it can return a List of profiles and not just one. its just  stub so I left it singular
 */

@Component
public class ProfileServiceStub implements IProfileService {
    @Override
    public Profile fetchByGender(String gender) {
        Profile profile = new Profile();
        profile.setGender("Female");
        return profile;
    }

    @Override
    public Profile fetchBySmokingPreference(Boolean smokingPreference) {
        Profile profile = new Profile();
        profile.setSmokingPreference(true);
        return profile;
    }

    @Override
    public Profile fetchByLocation(String location) {
        Profile profile = new Profile();
        profile.setLocation("Dallas");
        return profile;
    }

    @Override
    public Profile fetchCleanliness(String cleanliness) {
        Profile profile = new Profile();
        profile.setCleanliness("I am clean");
        return profile;
    }

    @Override
    public Profile fetchByNumberOfRoommates(Double numberOfRoommates) {
        Profile profile = new Profile();
        profile.setNumberOfPeople(4.0);
        return profile;
    }

    @Override
    public Profile fetchBySleepSchedule(String sleepSchedule) {
        Profile profile = new Profile();
        profile.setSleepSchedule("12-8");
        return profile;
    }

    @Override
    public Profile fetchByWorkSchedule(String workSchedule) {
        Profile profile = new Profile();
        profile.setWorkSchedule("9-5");
        return profile;
    }

    @Override
    public Profile fetchByProfileDescription(String Description) {
        Profile profile = new Profile();
        profile.setDescription("Profile description string here");
        return profile;
    }

    @Override
    public Profile fetchByProfilePicture(String profilePicture) {
        Profile profile = new Profile();
        profile.setProfilePicture("test string for picture");
        return profile;
    }

    @Override
    public Profile fetchByName(String name) {
        Profile profile = new Profile();
        profile.setName("Ricky Bobby");
        return profile;
    }

    @Override
    public Profile fetchByAge(int age) {
        Profile profile = new Profile();
        profile.setAge(30);
        return profile;
    }
}
