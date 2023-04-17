package com.py.demo.oauth.controller;

import com.py.demo.oauth.domain.User;
import com.py.demo.oauth.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    public ResponseEntity<List<User>> findAll() {

        return new ResponseEntity<>(userService.findAll(), HttpStatus.OK);
    }
}
