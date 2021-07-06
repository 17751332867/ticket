package com.lut.ticket.dao;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.lut.ticket.entity.User;
import org.springframework.stereotype.Repository;
@Repository
@Mapper
public interface UserMapper {

/**
     * ??????
     *
     * @return ??????????List
     */
List<User> listAll();


/**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
User getById(Integer id);

/**
     * ?????????
     *
     * @param user ?????
     * @return ??????
     */
int insert(User user);

/**
     * ?????null??
     *
     * @param user ?????
     * @return ??????
     */
int insertIgnoreNull(User user);

/**
     * ?????????
     *
     * @param user ?????
     * @return ??????
     */
int update(User user);

/**
     * ?????null??
     *
     * @param user ?????
     * @return ??????
     */
int updateIgnoreNull(User user);

/**
     * ????
     *
     * @param user ??????
     * @return ??????
     */
int delete(User user);

}