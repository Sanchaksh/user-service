package com.oracle.userservice.service;

import com.oracle.userservice.model.User;
import com.oracle.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User saveUser(User user) { return repository.save(user); }

    public Optional<User> findbyId(Integer id) { return repository.findById(id); }

    public List<User> getUsers() {
        return repository.findAll();
    }

    public String delete(Integer id) { repository.deleteById(id); return "Deleted!!";};

    public User update(Integer id,User user) {
        User user1=repository.findById(id).orElseThrow();
        user1.setName(user.getName());
        user1.setPhoneNo(user.getPhoneNo());
        user1.setMail(user.getMail());
        user1.setState(user.getState());
        user1.setAge(user.getAge());
        return repository.save(user1);
    }
}
