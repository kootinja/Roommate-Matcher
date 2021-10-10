package com.roommatematcher.enterprise.service;

import com.roommatematcher.enterprise.dao.IProfileDAO;
import com.roommatematcher.enterprise.dao.ProfileDAOStub;
import com.roommatematcher.enterprise.dto.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 *stub is just a  hard coded representation of what actual implementation will make. The implementation details are the given when then from project
 might need to change so it can return a List of profiles and not just one. its just  stub so i left it singular
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

    //return array of all profiles and sift for desired location attribute
    @Override
    public ArrayList<Profile> fetchByLocation(String location) {
        ArrayList<Profile> desiredProfiles = new ArrayList<Profile>();
        Profile profile = new Profile();
        desiredProfiles.add(profile);
        //get all profiles and put them into an ArrayList
        //desiredProfiles = ProfileDAOStub.fetchAll();
        //.removeIf() is essentially a foreach with nested if statement:
        // If e.location does not equal the location string
        // that is passed in, we remove it from the ArrayList.
        desiredProfiles.removeIf(e -> e.getLocation() != location);
        //an ArrayList only containing profiles
        // with matching locations is returned.
        return desiredProfiles;
    }
}
