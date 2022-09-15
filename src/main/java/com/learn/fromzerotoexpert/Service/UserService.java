package com.learn.fromzerotoexpert.Service;

import com.learn.fromzerotoexpert.exception.FZEException;
import com.learn.fromzerotoexpert.model.pojo.User;

public interface UserService {
    void register(String userName,String password) throws FZEException;
}
