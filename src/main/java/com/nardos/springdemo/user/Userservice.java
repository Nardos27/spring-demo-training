package com.nardos.springdemo.user;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class Userservice {
    public List<User> findAllusers(){
        return List.of(
                new User(
                        "nardos",
                        "mulugeta",
                        LocalDate.now(),
                        "female",
                        19
                ),
                new User(
                        "mahlet",
                        "henok",
                        LocalDate.now(),
                        "female",
                        15
                )

        );
    }
}



