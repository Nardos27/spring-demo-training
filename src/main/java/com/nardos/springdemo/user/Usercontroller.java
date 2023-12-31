package com.nardos.springdemo.user;

import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class Usercontroller {


    private final Userservice Service;

    public Usercontroller(Userservice service) {
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
