package com.roommatematcher.enterprise.service;

import com.roommatematcher.enterprise.dto.Profile;

import java.io.IOException;
import java.util.List;

public interface IProfileService {
    static Object fetchProfiles(int parseInt) {
    }

    /**
     * Fetch a profile with a given String gender.
     * @param gender a string, at the moment just for simplicity only male and female options.
     * @return all profiles with gender requested, or null if no matches found.
     */
    Profile fetchByGender(String gender);

    Profile fetchBySmokingPreference(Boolean smokingPreference);

    Profile fetchByLocation(String location);

    Profile fetchCleanliness(String cleanliness);


    Profile fetchByNumberOfRoommates(Double numberOfRoommates);

    Profile fetchBySleepSchedule(String sleepSchedule);

    Profile fetchByWorkSchedule(String workSchedule);

    Profile fetchByProfileDescription(String Description);

    Profile fetchByProfilePicture(String profilePicture);

    Profile fetchByName(String name);

    Profile fetchByAge(int age);

    List<Profile> fetchAll();

    List<Profile> fetchProfiles(String filterQuery) throws IOException;
}
