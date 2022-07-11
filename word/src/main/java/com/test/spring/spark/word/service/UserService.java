package com.test.spring.spark.word.service;


import com.test.spring.spark.word.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class UserService {

    
    UserMapper userMapper;

    public ArrayList<HashMap<String, Object>> findAll() {
        return userMapper.findAll();
    }
}