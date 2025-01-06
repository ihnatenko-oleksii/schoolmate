package com.ihnatenko.schoolmate.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("header_action_link","home");
        return "index";
    }
}
