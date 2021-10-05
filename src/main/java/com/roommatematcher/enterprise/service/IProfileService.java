package com.roommatematcher.enterprise.service;

import com.roommatematcher.enterprise.dto.Profile;

import java.util.ArrayList;
import java.util.List;

public interface IProfileService {
    /**
     * Fetch a profile with a given String gender.
     * @param gender a string, at the moment just for simplicity only male and female options.
     * @return all profiles with gender requested, or null if no matches found.
     */
    Profile fetchByGender(String gender);

    Profile fetchBySmokingPreference(Boolean smokingPreference);

    List<Profile> fetchByLocation(String location);
}
