package com.roommatematcher.enterprise;

import com.roommatematcher.enterprise.dto.Location;
import com.roommatematcher.enterprise.dto.Profile;
import com.roommatematcher.enterprise.service.ILocationService;
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
    private ILocationService locationService;
    private Location location;

    @Test
    void contextLoads() {
    }
// Tests for the Profile class
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
    void fetchRoommatesByCleanliness_returnsStringDescriptionOfCleanliness(){
        givenRoommatesCleanliness();
        whenSearchRoommatesCleanliness();
        thenReturnStringOfRoommateCleanliness();
    }

    private void givenRoommatesCleanliness() {
    }

    private void whenSearchRoommatesCleanliness() {
        profile = profileService.fetchCleanliness("I am clean");

    }
    private void thenReturnStringOfRoommateCleanliness() {
        String cleanliness = profile.getCleanliness();
        assertEquals("I am clean",cleanliness);
    }

    @Test
    void fetchRoommatesByNumberOfPeople_ReturnDoubleNumberOfRoommates(){
            givenRoommatesNumber();
            whenRoommatesNumberIsFour();
            thenReturnDoubleNumberOfPeople();
    }

    private void givenRoommatesNumber() {
    }

    private void whenRoommatesNumberIsFour() {
        profile = profileService.fetchByNumberOfRoommates(4.0);
    }

    private void thenReturnDoubleNumberOfPeople() {
        Double numberOfPeople = profile.getNumberOfPeople();
        assertEquals(4.0,numberOfPeople);
    }
    @Test
    void fetchSleepSchedule_returnProfilesSleepScheduleString(){
        givenRoommatesSleepSchedule();
        whenRoommatesSleepSchedule();
        thenReturnStringOfRoommatesSleepSchedule();

    }

    private void givenRoommatesSleepSchedule() {
    }

    private void whenRoommatesSleepSchedule() {
        profile = profileService.fetchBySleepSchedule("12-8");
    }

    private void thenReturnStringOfRoommatesSleepSchedule() {
        String sleepSchedule = profile.getSleepSchedule();
        assertEquals("12-8",sleepSchedule);
    }

    @Test
    void fetchWorkSchedule_returnProfilesWorkScheduleString(){
        givenRoommatesWorkSchedule();
        whenRoommatesWorkSchedule();
        thenReturnStringOfRoommatesWorkSchedule();

    }

    private void givenRoommatesWorkSchedule() {
    }

    private void whenRoommatesWorkSchedule() {
        profile = profileService.fetchByWorkSchedule("9-5");
    }

    private void thenReturnStringOfRoommatesWorkSchedule() {
        String workSchedule = profile.getWorkSchedule();
        assertEquals("9-5",workSchedule);
    }

    @Test
    void fetchProfileDescription_returnStringProfileDescription(){
        givenRoommateDescription();
        whenRoommatesDescription();
        thenReturnRoommatesDescription();

    }

    private void givenRoommateDescription() {
    }

    private void whenRoommatesDescription() {
        profile = profileService.fetchByProfileDescription("Profile description string here");

    }

    private void thenReturnRoommatesDescription() {
        String description = profile.getDescription();
        assertEquals("Profile description string here",description);

    }

    @Test // not sure about what datatype the profile picture will be after the base64 json conversion
    void fetchRoommateProfilePicture_returnProfilePicture(){
        givenRoommateHasProfilePicture();
        whenRoommateHasProfilePicture();
        thenReturnRoommateProfilePicture();

    }

    private void givenRoommateHasProfilePicture() {
    }

    private void whenRoommateHasProfilePicture() {
        profile = profileService.fetchByProfilePicture("test string for picture");
    }

    private void thenReturnRoommateProfilePicture() {
        String profilePicture = profile.getProfilePicture();
        assertEquals("test string for picture",profilePicture);
    }

    @Test
    void fetchRoommateProfileName_returnRoommateNameString(){
        givenRoommateHasNameRicky();
        whenRoommateSearchNameRicky();
        thenReturnRoommateStringNameRicky();
    }

    private void givenRoommateHasNameRicky() {
    }

    private void whenRoommateSearchNameRicky() {
        profile = profileService.fetchByName("Ricky Bobby");
    }

    private void thenReturnRoommateStringNameRicky() {
        String name = profile.getName();
        assertEquals("Ricky Bobby",name);
    }

    @Test
    void fetchRoommateProfileAge_return(){
        givenRoommateAgeIs30();
        whenRoommateSearchAge30();
        thenReturnRoommateProfileAge30();
    }

    private void givenRoommateAgeIs30() {
    }

    private void whenRoommateSearchAge30() {
        profile = profileService.fetchByAge(30);
    }

    private void thenReturnRoommateProfileAge30() {
        int age = profile.getAge();
        assertEquals(30,age);
    }

//Tests for Location class
    @Test
    void fetchLocationOfResidence_returnStringLivingLocation(){
        givenLocationIsCincinnati();
        whenLocationSearchedIsCincinnati();
        thenReturnLocationIsCincinnati();

    }

    private void givenLocationIsCincinnati() {
    }

    private void whenLocationSearchedIsCincinnati() {
        location = locationService.fetchByAddress("200 warner st. Cincinnati Ohio");
    }

    private void thenReturnLocationIsCincinnati() {
        String address = location.getAddress();
        assertEquals("200 warner st. Cincinnati Ohio",address);

    }
    @Test
    void fetchTotalPriceOfLocation_returnDoubleTotalPrice(){
        givenTotalPriceIs2000();
        whenTotalPriceSearchedAtLocation();
        thenReturnTotalPriceIs2000();
    }

    private void givenTotalPriceIs2000() {
    }

    private void whenTotalPriceSearchedAtLocation() {
        location = locationService.fetchByTotalPrice(2000.0);
    }

    private void thenReturnTotalPriceIs2000() {
        Double totalPrice = location.getTotalPrice();
        assertEquals(2000.0,totalPrice);
    }
/*
    @Test
    void fetchPricePerPerson_returnPricePerPerson333(){
        //price per person = profile.totalPrice / profile.numberOfResidents
        givenLocationHas3PeopleAndTotalPriceOf1000();
        whenPricePerPersonSelected();
        thenPricePerPersonIs333();
    }

    private void givenLocationHas3PeopleAndTotalPriceOf1000() {
    }

    private void whenPricePerPersonSelected() {
        location = locationService.fetchByTotalPrice(1000.0).fetchByNumberOfResidents(3);
    }

    private void thenPricePerPersonIs333() {
        Double k = 1000.0;
        k = k/3;
        Double pricePerPerson = location.getTotalPrice() / location.getNumberOfResidents();
        assertEquals(k,pricePerPerson);
    }
*/
    @Test
    void fetchStringDescription_returnLocationStringDescription(){
        givenLocationDescription();
        whenLocationDescriptionIsGiven();
        thenReturnLocationDescriptionString();
    }

    private void givenLocationDescription() {
    }

    private void whenLocationDescriptionIsGiven() {
        location = locationService.fetchByDescription("House with 5 beds 2 bath");
    }

    private void thenReturnLocationDescriptionString() {
        String description = location.getDescription();
        assertEquals("House with 5 beds 2 bath",description);
    }

    @Test
    void fetchBooleanAllowsSmoking_returnBooleanAllowsSmoking(){
        givenLocationDoesNotAllowSmoking();
        whenLocationSearchedDoesNotAllowSmoking();
        thenReturnBooleanFalseForLocationAllowsSmoking();

    }

    private void givenLocationDoesNotAllowSmoking() {
    }

    private void whenLocationSearchedDoesNotAllowSmoking() {
        location = locationService.fetchByAllowSmoking(false);
    }

    private void thenReturnBooleanFalseForLocationAllowsSmoking() {
        Boolean allowsSmoking = location.getAllowsSmoking();
        assertEquals(false,allowsSmoking);
    }

    @Test
    void fetchIntNumberOfResidents_returnNumberOfResidents(){
        givenLocationHas5Residents();
        whenLocationResidentsIs5();
        thenReturnOfLocationNumberOfResidents5();
    }

    private void givenLocationHas5Residents() {
    }

    private void whenLocationResidentsIs5() {
        location = locationService.fetchByNumberOfResidents(5);
    }

    private void thenReturnOfLocationNumberOfResidents5() {
        int numberOfResidents = location.getNumberOfResidents();
        assertEquals(5,numberOfResidents);
    }
}
