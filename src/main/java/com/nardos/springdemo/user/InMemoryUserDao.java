package com.nardos.springdemo.user;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryUserDao {

    private List<User> USERS= new ArrayList<>();

    public User save(User s){
         USERS.add(s);
        return s;
    }
    public List<User> findAllusers() {
        return USERS;
    }

    public User findById(Long Id) {

        return USERS.stream()
                .filter(s-> Id.equals(s.getID()))
                .findFirst()
                .orElse( null);
    }

    public User update(User s) {
        var UserIndex = IntStream.range(0, USERS.size())
                .filter(index -> USERS.get(index).getId().equals(s.getID()))
                .findFirst()
                .orElse(-1);
        if(UserIndex > -1){
            USERS.set(UserIndex, s);
            return s;
        }
        return null;
    }

    public Void delet(Long Id) {
        var User = findById(Id);
        if (User != null) {
            USERS.remove(User);
        }
        return null;
    }
}
