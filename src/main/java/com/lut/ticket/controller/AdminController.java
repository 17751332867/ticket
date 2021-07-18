package com.lut.ticket.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lut.ticket.entity.Admin;
import com.lut.ticket.service.AdminService;

@RestController
@RequestMapping("Admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    /**
     * ??????
     *
     * @return ??????????List
     */
    @RequestMapping("list")
    public List<Admin> listAll() {
        return adminService.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    @RequestMapping("getById")
    public Admin getById(Integer id) {
        return adminService.getById(id);
    }
    
    /**
     * ?????????
     *
     * @param admin ?????
     * @return ??????
     */
    @RequestMapping("insert")
    public int insert(Admin admin) {
        return adminService.insert(admin);
    }
    
    /**
     * ?????null??
     *
     * @param admin ?????
     * @return ??????
     */
    @RequestMapping("insertIgnoreNull")
    public int insertIgnoreNull(@RequestBody Admin admin) {
        return adminService.insertIgnoreNull(admin);
    }
    
    /**
     * ?????????
     *
     * @param admin ?????
     * @return ??????
     */
    @RequestMapping("update")
    public int update( Admin admin) {
        return adminService.update(admin);
    }
    
    /**
     * ?????null??
     *
     * @param admin ?????
     * @return ??????
     */
    @RequestMapping("updateIgnoreNull")
    public int updateIgnoreNull(@RequestBody Admin admin) {
        return adminService.updateIgnoreNull(admin);
    }
    
    /**
     * ????
     *
     * @param admin ??????
     * @return ??????
     */
    @RequestMapping("delete")
    public int delete(Admin admin) {
        return adminService.delete(admin);
    }
    
}