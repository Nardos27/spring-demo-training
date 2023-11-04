package com.nardos.springdemo.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class Usercontroller {

    @GetMapping
    public List<String> findAllusers(){
        return List.of(
                "nardos",
                "hello world"
        );
    }
}
