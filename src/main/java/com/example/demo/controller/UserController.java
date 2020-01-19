package com.example.demo.controller;

import com.example.demo.service.UserService;
import com.example.demo.util.ResultList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findById")
    public ResultList findUserById(@RequestParam("uid") String id){

        return userService.findUserById(id);
    }
}
