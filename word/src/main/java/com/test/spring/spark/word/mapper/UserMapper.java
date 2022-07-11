package com.test.spring.spark.word.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
@Repository
public interface UserMapper {

     ArrayList<HashMap<String, Object>> findAll();
}