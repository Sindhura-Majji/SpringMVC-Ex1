package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/")
    public String message( Model model)
    {
        User user = new User();

        model.addAttribute("result",user.message);

        return "index";

    }
}
