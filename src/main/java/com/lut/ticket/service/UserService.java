package com.lut.ticket.service;

import com.lut.ticket.entity.User;
import com.lut.ticket.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * ??????
     *
     * @return ??????????List
     */
    public List<User> listAll() {
    return userMapper.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    public User getById(Integer id) {
    return userMapper.getById(id);
    }

    /**
     * ?????????
     *
     * @param user ?????
     * @return ??????
     */
    public int insert(User user) {
    return userMapper.insert(user);
    }

    /**
     * ?????null??
     *
     * @param user ?????
     * @return ??????
     */
    public int insertIgnoreNull(User user) {
    return userMapper.insertIgnoreNull(user);
    }

    /**
     * ?????????
     *
     * @param user ?????
     * @return ??????
     */
    public int update(User user) {
    return userMapper.update(user);
    }

    /**
     * ?????null??
     *
     * @param user ?????
     * @return ??????
     */
    public int updateIgnoreNull(User user) {
    return userMapper.updateIgnoreNull(user);
    }

    /**
     * ????
     *
     * @param user ??????
     * @return ??????
     */
    public int delete(User user) {
    return userMapper.delete(user);
    }

}