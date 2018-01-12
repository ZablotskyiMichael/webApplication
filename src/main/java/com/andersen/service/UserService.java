package com.andersen.service;

import com.andersen.model.User;
import com.andersen.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Iterable<User> findAllUsers() {
        return userRepository.findAll();
    }

    public void deleteById(long id){
        userRepository.delete(id);
    }
    public User getById (long id){
        return userRepository.findOne(id);
    }
    public void put ( User user){

            userRepository.save(user);
    }
    public void create ( User user){

        userRepository.save(user);
    }
    }

