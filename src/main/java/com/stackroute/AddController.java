package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {

    @RequestMapping("/")
    public String displayMessage(Model model)
    {
        User user=new User("Welcome to StackRoute");

        model.addAttribute("message",user.getMessage());
        return "index";
    }
}
