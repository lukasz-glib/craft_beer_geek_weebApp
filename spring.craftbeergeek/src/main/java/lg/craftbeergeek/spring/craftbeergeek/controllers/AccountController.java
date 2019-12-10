package lg.craftbeergeek.spring.craftbeergeek.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
@RequestMapping("/user")
public class AccountController {

    @GetMapping
    public String prepareAccountPage(Principal principal) {
        String username = principal.getName();
     return "user/account";
    }

}