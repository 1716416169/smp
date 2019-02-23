package com.smp.smp.Service.impl;

import com.smp.smp.Dao.User_repository;
import com.smp.smp.Entity.User;
import com.smp.smp.Service.UserService;
import net.bytebuddy.description.type.TypeDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class UserServiceImp implements UserService
{

    @Autowired
    User_repository user_repository;
    @Override
    public Page<User> selectUser(Integer page,Integer size) {
        page-=1;
        Sort orders = new Sort(Sort.Direction.ASC,"number");
        Pageable of = PageRequest.of(page, size,orders);
        Page<User> all = user_repository.findAll(of);
        return all;
    }

    @Override
    public User insertUser(User user) {
        User save = user_repository.save(user);
        return save;
    }

    @Override
    public User updataUser(User user,Integer id) {
        user.setId(id);
        User save = user_repository.save(user);
        return save;
    }

    @Override
    public User deleteUser(Integer id) {
        Optional<User> byId = user_repository.findById(id);
        User user = byId.get();
        user_repository.deleteById(id);
        return user;
    }
}
