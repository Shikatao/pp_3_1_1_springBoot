package com.daniilmonin.pp_3_1_1_springboot.service;

import com.daniilmonin.pp_3_1_1_springboot.model.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void saveUser(User user);

    public User getUser(Long id);

    public void deleteUser(Long id);

    public void updateUser(User user);
}
