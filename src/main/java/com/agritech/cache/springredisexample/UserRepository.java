package com.agritech.cache.springredisexample;

import java.util.Map;

import com.agritech.cache.springredisexample.model.User;

public interface UserRepository {

    void save(User user);
    Map<String, User> findAll();
    User findById(String id);
    void update(User user);
    void delete(String id);
}
