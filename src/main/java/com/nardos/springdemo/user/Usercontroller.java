package com.nardos.springdemo.user;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class Usercontroller {

    private Userservice Service = new Userservice();
    @GetMapping
    public List<User> findAllusers(){
        return null;

    }
}
