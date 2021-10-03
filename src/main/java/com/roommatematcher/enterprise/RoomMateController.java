package com.roommatematcher.enterprise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
