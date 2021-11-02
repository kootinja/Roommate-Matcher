package com.roommatematcher.enterprise;

import org.springframework.stereotype.Controller;
import com.roommatematcher.enterprise.dto.Profile;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RoomMateController {
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
}
