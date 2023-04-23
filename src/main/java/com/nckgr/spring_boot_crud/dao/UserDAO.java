package com.nckgr.spring_boot_crud.dao;






import com.nckgr.spring_boot_crud.entity.User;

import java.util.List;

public interface UserDAO {
    public List <User> getAllUsers();
    public void saveUser(User user);
//    public void updateUser(User user);
    public User getUser(int id);

    public void deleteUser(int id);
}
