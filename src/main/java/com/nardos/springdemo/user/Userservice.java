package com.nardos.springdemo.user;

import java.util.List;

public interface Userservice {

     User save(User s);
     List<User> findAllusers();

     User findById(Long Id);

     User update(User s);

     void delete(Long id);
}



