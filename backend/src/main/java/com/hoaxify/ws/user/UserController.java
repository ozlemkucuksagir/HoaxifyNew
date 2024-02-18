package com.hoaxify.ws.user;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserController {
    @CrossOrigin
    @PostMapping("/api/v1/users")
    void createUser() {
       
    }
    
    
}
