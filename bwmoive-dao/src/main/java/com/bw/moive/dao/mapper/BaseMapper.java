package com.bw.moive.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseMapper {

    public <T> int insert(T t);

    public <T> T queryById(int id);

    public <T> List<T> queryAll();

    public <T> List<T> queryForPage(@Param("begin") int begin, @Param("end") int end);

    public <T> void deleteById(int id);

    public <T> void update(T t);

    public int count();

}
