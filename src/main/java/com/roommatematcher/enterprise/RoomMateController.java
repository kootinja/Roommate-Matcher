package com.roommatematcher.enterprise;

import com.roommatematcher.enterprise.dto.Profile;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * The controller for Roommate Matcher REST endpoints and web UI
 * <p>
 *     This class handles the CRUD operations for Roommate Matcher users,
 *     via HTTP actions
 * </p>
 * <p>
 *     This class also serves HTML based web pages,
 *     for UI interactions with user profiles
 * </p>
 * @author <<yournamehere>>
 */
@Controller
public class RoomMateController {
     /**
     * Handles the root (/) endpoint and start a start page
     * @return
      * @author <<yournamehere>>
     **/
    @RequestMapping("/")
    public String index(){
        return "start";
    }
    /**
     * Handles the root (/profile) endpoint and retrieves all user profiles
     * @return ResponseEntity which is a message notifying us of success/failure
     * @author <<yournamehere>>
     **/
    @GetMapping("/profile")
    public ResponseEntity fetchAllProfiles(){
        return new ResponseEntity(HttpStatus.OK);
    }
    /**
     * Handles the root (/profile/id/) GET endpoint and retrieves a single desired profile
     * @return ResponseEntity which is a message notifying us of success/failure
     * @author <<yournamehere>>
     **/
    @GetMapping("/profile/id/")
    public ResponseEntity fetchProfileById(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }
    /**
     * Handles the root (/profile) POST endpoint and creates a single user profile
     * @return ResponseEntity which is a message notifying us of success/failure
     * @author <<yournamehere>>
     **/
    @PostMapping(value="/profile", consumes="application/json", produces="application/json")
    public Profile createProfile(@RequestBody Profile profile){
        return profile;
    }
    /**
     * Handles the root (/profile/id/) DELETE endpoint and deletes a single user profile
     * @return ResponseEntity which is a message notifying us of success/failure
     * @author <<yournamehere>>
     **/
    @DeleteMapping("/profile/id/")
    public ResponseEntity deleteProfile(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }

}
