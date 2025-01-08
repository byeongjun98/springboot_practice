package org.example.springboot_practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/sbp")
    @ResponseBody
    public String index() {
        return "spring boot practice";
    }
}
