package com.lut.ticket.service;

import com.lut.ticket.entity.Admin;
import com.lut.ticket.dao.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    /**
     * ??????
     *
     * @return ??????????List
     */
    public List<Admin> listAll() {
    return adminMapper.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    public Admin getById(Integer id) {
    return adminMapper.getById(id);
    }

    /**
     * ?????????
     *
     * @param admin ?????
     * @return ??????
     */
    public int insert(Admin admin) {
    return adminMapper.insert(admin);
    }

    /**
     * ?????null??
     *
     * @param admin ?????
     * @return ??????
     */
    public int insertIgnoreNull(Admin admin) {
    return adminMapper.insertIgnoreNull(admin);
    }

    /**
     * ?????????
     *
     * @param admin ?????
     * @return ??????
     */
    public int update(Admin admin) {
    return adminMapper.update(admin);
    }

    /**
     * ?????null??
     *
     * @param admin ?????
     * @return ??????
     */
    public int updateIgnoreNull(Admin admin) {
    return adminMapper.updateIgnoreNull(admin);
    }

    /**
     * ????
     *
     * @param admin ??????
     * @return ??????
     */
    public int delete(Admin admin) {
    return adminMapper.delete(admin);
    }

}