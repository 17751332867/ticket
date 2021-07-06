package com.lut.ticket.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lut.ticket.entity.User;
import com.lut.ticket.service.UserService;

@RestController
@RequestMapping("User")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * ??????
     *
     * @return ??????????List
     */
    @RequestMapping("list")
    public List<User> listAll() {
        return userService.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    @RequestMapping("getById")
    public User getById(Integer id) {
        return userService.getById(id);
    }
    
    /**
     * ?????????
     *
     * @param user ?????
     * @return ??????
     */
    @RequestMapping("insert")
    public int insert(@RequestBody User user) {
        return userService.insert(user);
    }
    
    /**
     * ?????null??
     *
     * @param user ?????
     * @return ??????
     */
    @RequestMapping("insertIgnoreNull")
    public int insertIgnoreNull(@RequestBody User user) {
        return userService.insertIgnoreNull(user);
    }
    
    /**
     * ?????????
     *
     * @param user ?????
     * @return ??????
     */
    @RequestMapping("update")
    public int update(@RequestBody User user) {
        return userService.update(user);
    }
    
    /**
     * ?????null??
     *
     * @param user ?????
     * @return ??????
     */
    @RequestMapping("updateIgnoreNull")
    public int updateIgnoreNull(@RequestBody User user) {
        return userService.updateIgnoreNull(user);
    }
    
    /**
     * ????
     *
     * @param user ??????
     * @return ??????
     */
    @RequestMapping("delete")
    public int delete(@RequestBody User user) {
        return userService.delete(user);
    }
    
}