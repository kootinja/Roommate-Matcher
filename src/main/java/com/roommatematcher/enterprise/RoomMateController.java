package com.roommatematcher.enterprise;

import com.roommatematcher.enterprise.dto.Profile;
import com.roommatematcher.enterprise.service.IProfileService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
public class RoomMateController {
     /**
     * Handles the root (/) endpoint and start a start page
     * @return
     **/
    @RequestMapping("/")
    public String index(){
        return "start";
    }

    @GetMapping("/profile")
    @ResponseBody
    public List<Profile> fetchProfiles(){

        return IProfileService.fetchAll();
    }

    @GetMapping("/profile/{id}/")
    public ResponseEntity fetchMealItemById(@PathVariable("id") String id) {
        Profile profiles = (Profile) IProfileService.fetchProfiles(Integer.parseInt(id));
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return new ResponseEntity(profiles, headers, HttpStatus.OK);
    }



}
