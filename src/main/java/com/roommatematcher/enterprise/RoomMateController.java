package com.roommatematcher.enterprise;

import com.roommatematcher.enterprise.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.roommatematcher.enterprise.dto.Profile;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoomMateController {

    @Autowired
    IProfileService profileService;


     /**
     * Handles the root (/) endpoint and start a start page
     * @return
     **/
    @RequestMapping("/")
    public String index(Model model){
        Profile profile = new Profile();
        profile.setGender("male");
        profile.setSmokingPreference(false);
        profile.setCleanliness("clean");
        profile.setLocation("cincinnati");
        profile.setNumberOfPeople(2.0);
        profile.setSleepSchedule("night");
        profile.setWorkSchedule("day");
        profile.setDescription("great friend");
        profile.setProfilePicture("B's profile");
        model.addAttribute(profile);
        return "start";
    }

    @PostMapping(value="/profile", consumes="application/json", produces="application/json")
    public Profile createProfile(@RequestBody Profile profile) throws Exception {

        Profile newProfile = null;
        try{
            newProfile = profileService.save(profile);
        } catch (Exception e) {
            //TODO ADD LOGGING
            System.out.println("tried to access methods in business logic but failed");
        }
        return newProfile;
    }
}
