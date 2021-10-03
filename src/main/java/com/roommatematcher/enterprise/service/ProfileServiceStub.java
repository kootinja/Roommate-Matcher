package com.roommatematcher.enterprise.service;

import com.roommatematcher.enterprise.dto.Profile;
import org.springframework.stereotype.Component;

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

    @Override
    public Profile fetchByLocation(String location) {
        Profile profile = new Profile();
        profile.setLocation("Dallas");
        return profile;
    }
}
