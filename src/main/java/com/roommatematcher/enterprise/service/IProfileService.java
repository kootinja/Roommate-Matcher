package com.roommatematcher.enterprise.service;

import com.roommatematcher.enterprise.dto.Profile;

public interface IProfileService {
    /**
     * Fetch a profile with a given String gender.
     * @param gender a string, at the moment just for simplicity only male and female options.
     * @return all profiles with gender requested, or null if no matches found.
     */
    Profile fetchByGender(String gender);

    /**
     * Fetch a profile with a given smoking preference.
     * @param smokingPreference a boolean representing if a user smokes or not
     * @return all profiles matching the smoking preference,  or null if no matches found.
     */
    Profile fetchBySmokingPreference(Boolean smokingPreference);

    /**
     * Fetch a profile with a given location.
     * @param location a string representing where a user is looking for roommates
     * @return all profiles matching with a matching location,  or null if no matches found.
     */
    Profile fetchByLocation(String location);
}
