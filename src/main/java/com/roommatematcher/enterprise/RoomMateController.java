package com.roommatematcher.enterprise;

import com.roommatematcher.enterprise.dto.Location;
import com.roommatematcher.enterprise.dto.Profile;
import com.roommatematcher.enterprise.service.ILocationService;
import com.roommatematcher.enterprise.service.IProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Profiles;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RoomMateController {
     /**
     * Handles the root (/) endpoint and start a start page
     * @return
     **/
     @Autowired
     IProfileService profileService;
     ILocationService locationService;

    @RequestMapping("/")
    public String index(){
        return "start";
    }

    @GetMapping("/profile")
    @ResponseBody
    public List<Profile> fetchAllProfiles(){

        return profileService.fetchAll();
    }

    @GetMapping("/profile/{id}/")
    public ResponseEntity fetchProfiles(@PathVariable("id") String id) {
        Profile profiles = profileService.fetchByProfileDescription(Integer.parseInt(id));
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(profiles, headers, HttpStatus.OK);
    }

    @GetMapping("/location/{id}/")
    public ResponseEntity fetchLocations(@PathVariable("id") String id) {
        Location location = locationService.fetchByAddress(String.parseInt(id));
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(location, headers, HttpStatus.OK);
    }
    @PostMapping(value="/location", consumes="application/json", produces="application/json")
    public Profile createProfiles(@RequestBody Profile profile) throws Exception {

        Profile newProfile = null;
        try{
            newProfile = profileService.save(profile);
        } catch (Exception e) {
            //TODO ADD LOGGING
            log.error("profile :" + e);

        }
        return profile;
    }

    @DeleteMapping("/profile/{id}/")
    public ResponseEntity deleteMealItem(@PathVariable("id") String id) {
        try {
            profileService.delete(Integer.parseInt(id));
            return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }



    }


}




