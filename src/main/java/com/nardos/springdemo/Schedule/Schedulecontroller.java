package com.nardos.springdemo.Schedule;

import com.nardos.springdemo.user.User;
import com.nardos.springdemo.user.Userservice;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class Schedulecontroller {

    private final Scheduleservice Service;

    public Schedulecontroller(Scheduleservice service) {
        Service = service;
    }

    @PostMapping
    public User save(
            @RequestBody User user
    ){
        User User = null;
        return Service.save(User);
    }

    @GetMapping("/{Id}")
    public User findById(
            @PathVariable("Id") Long Id
    ){
        return Service.findById(Id);
    }
    @GetMapping
    public List<User> findAllusers(){
        return Service.findAllusers();

    }
    @PutMapping
    public User updateUser(
            @RequestBody User User
    ){
        return Service.update(User);
    }
    @DeleteMapping("{/Id}")
    public void delete(
            @PathVariable("Id") Long Id
    ){
        Service.delete(Id);
    }
}
