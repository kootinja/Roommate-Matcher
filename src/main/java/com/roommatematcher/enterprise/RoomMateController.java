package com.roommatematcher.enterprise;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    /*@GetMapping("profiles")
    public ResponseEntity searchPlants(RequestParam(value="searchTerm", required=false, defaultValue="None") String searchTerm) {
        return new ResponseEntity(HttpStatus.OK);
    }

     */
}
