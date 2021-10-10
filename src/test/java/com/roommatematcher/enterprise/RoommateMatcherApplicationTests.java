package com.roommatematcher.enterprise;

import com.roommatematcher.enterprise.dto.Profile;
import com.roommatematcher.enterprise.service.IProfileService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RoommateMatcherApplicationTests {

    @Autowired
    private IProfileService profileService; // service that connects/filters all profiles
    private Profile profile; // profile holds all roommate data

    @Test
    void contextLoads() {
    }

    @Test
    void fetchRoommatesByLocation_returnsRoommatesInDallas() {
        givenRoommateInDallas();
        whenSearchRoommatesForDallas();
        thenReturnListRoommatesForDallas();
    }

    private void givenRoommateInDallas() {

    }

    private void whenSearchRoommatesForDallas() {
        profile = profileService.fetchByLocation("Dallas");
    }

    private void thenReturnListRoommatesForDallas() {
        String location = profile.getLocation();
        assertEquals("Dallas", location);
    }

    @Test
    void fetchRoommatesByGender_returnsRoommatesWomen(){
        givenRoommateIsWomen();
        whenSearchRoommatesWomen();
        thenReturnListRoommatesFemale();
    }

    private void givenRoommateIsWomen() {
    }
    private void whenSearchRoommatesWomen() {
        profile = profileService.fetchByGender("Women");
    }
    // assertEquals returns false if women is not the gender associated with a profile.
    private void thenReturnListRoommatesFemale() {
        String gender = profile.getGender();
        assertEquals("Female", gender); //static method in another class- ok to use if imported correctly
    }


    @Test
    void fetchRoommatesOkWithSmoking_returnsRoommatesOkWithSmoking(){
        givenRoommateOkWithSmoking();
        whenSearchRoommatesOkWithSmoking();
        thenReturnListRoommatesOkWithSmoking();
    }

    private void givenRoommateOkWithSmoking() {}
    private void whenSearchRoommatesOkWithSmoking() {
        profile = profileService.fetchBySmokingPreference(true);
    }
    private void thenReturnListRoommatesOkWithSmoking() {
        Boolean smokingPreference = profile.getSmokingPreference();// true if they are ok with smoking and false if they don't want it
        assertEquals(true, smokingPreference);
    }

    @Test
    void fetchRoommatesWithHighCleanliness_returnsRoommatesWithHihCleanliness(){
        givenRoommateWithHighCleanliness();
        whenSearchRoommatesWithHighCleanliness();
        thenReturnListRoommatesWithHighCleanliness();
    }

    private void givenRoommateWithHighCleanliness() {}
    private void whenSearchRoommatesWithHighCleanliness() {
        profile = profileService.fetchByCleanliness(5);
    }
    private void thenReturnListRoommatesWithHighCleanliness() {
        Integer cleanlinessRating = profile.getCleanlinessRating();// true if they have a high cleanliness rating(5)
        assertEquals(5, cleanlinessRating);
    }
}
