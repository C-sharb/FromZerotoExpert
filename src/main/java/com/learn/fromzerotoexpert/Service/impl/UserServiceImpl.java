package com.learn.fromzerotoexpert.Service.impl;

import com.learn.fromzerotoexpert.Service.UserService;
import com.learn.fromzerotoexpert.exception.FZEException;
import com.learn.fromzerotoexpert.exception.FZEExceptionEnum;
import com.learn.fromzerotoexpert.model.dao.UserMapper;
import com.learn.fromzerotoexpert.model.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService  {

    @Autowired
    UserMapper userMapper;

    @Override
    public void register(String userName, String password) throws FZEException {
        User userOld = userMapper.selectByName(userName);
        if(userOld != null){
            throw new FZEException(FZEExceptionEnum.USER_EXISTED);
        }
        User user = new User();
        user.setUsername(userName);
        user.setPassword(password);
        int count = userMapper.insertSelective(user);
        if(count == 0){
            throw new FZEException(FZEExceptionEnum.INSERT_FAILED);
        }

    }
}
