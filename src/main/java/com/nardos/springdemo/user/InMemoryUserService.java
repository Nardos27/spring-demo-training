package com.nardos.springdemo.user;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InMemoryUserService implements Userservice{

    private final InMemoryUserDao dao;

    public InMemoryUserService(InMemoryUserDao dao) {
        this.dao = dao;
    }

    @Override
    public User save(User s) {
        return this.dao.save(s);
    }

    @Override
    public List<User> findAllusers() {
        return dao.findAllusers();
    }

    @Override
    public User findById(Long Id) {

        return dao.findById(Id);
    }

    @Override
    public User update(User s) {

        return dao.update(s);
    }

    @Override
    public void delete(Long id) {

    }

    public void delet(Long Id) {

        dao.delet(Id);
    }
}
