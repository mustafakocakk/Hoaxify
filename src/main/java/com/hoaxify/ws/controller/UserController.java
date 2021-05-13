package com.hoaxify.ws.controller;


import com.hoaxify.ws.data.User;
import com.hoaxify.ws.repository.UserRepository;
import com.hoaxify.ws.service.UserService;
import com.hoaxify.ws.shared.GenericResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private  static  final Logger log= LoggerFactory.getLogger(UserController.class);

    @Autowired
    UserService userService;
    
    @PostMapping("/api/1.0/users")
    public GenericResponse createUser(@RequestBody User user){
        userService.save(user);


        return new GenericResponse("User Created");

    }

}
