package com.smp.smp.Service;

import com.smp.smp.Entity.User;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;


public interface UserService {
    public Page<User> selectUser(Integer page,Integer size);
    public User insertUser(User user);
    public User updataUser(User user,Integer id);
    public User deleteUser(Integer id);

}
