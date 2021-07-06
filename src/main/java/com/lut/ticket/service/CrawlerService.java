package com.lut.ticket.service;

import com.lut.ticket.entity.Crawler;
import com.lut.ticket.dao.CrawlerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrawlerService {

    @Autowired
    private CrawlerMapper crawlerMapper;

    /**
     * ??????
     *
     * @return ??????????List
     */
    public List<Crawler> listAll() {
    return crawlerMapper.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    public Crawler getById(Integer id) {
    return crawlerMapper.getById(id);
    }

    /**
     * ?????????
     *
     * @param crawler ?????
     * @return ??????
     */
    public int insert(Crawler crawler) {
    return crawlerMapper.insert(crawler);
    }

    /**
     * ?????null??
     *
     * @param crawler ?????
     * @return ??????
     */
    public int insertIgnoreNull(Crawler crawler) {
    return crawlerMapper.insertIgnoreNull(crawler);
    }

    /**
     * ?????????
     *
     * @param crawler ?????
     * @return ??????
     */
    public int update(Crawler crawler) {
    return crawlerMapper.update(crawler);
    }

    /**
     * ?????null??
     *
     * @param crawler ?????
     * @return ??????
     */
    public int updateIgnoreNull(Crawler crawler) {
    return crawlerMapper.updateIgnoreNull(crawler);
    }

    /**
     * ????
     *
     * @param crawler ??????
     * @return ??????
     */
    public int delete(Crawler crawler) {
    return crawlerMapper.delete(crawler);
    }

}