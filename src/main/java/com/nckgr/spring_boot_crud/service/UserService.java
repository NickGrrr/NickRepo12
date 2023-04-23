package com.nckgr.spring_boot_crud.service;






import com.nckgr.spring_boot_crud.entity.User;

import java.util.List;


public interface UserService {
    public List <User> getAllUsers();
    public void saveUser(User user);


    public User getUser(int id);

    public void deleteUser(int id);
}
