package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ServiceThreeController {

    @GetMapping("/pingthree")
    public @ResponseBody String pingtwo() {
        return "ping from service three";
    }

}
