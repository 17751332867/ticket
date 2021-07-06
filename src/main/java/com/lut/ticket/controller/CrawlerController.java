package com.lut.ticket.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lut.ticket.entity.Crawler;
import com.lut.ticket.service.CrawlerService;

@RestController
@RequestMapping("Crawler")
public class CrawlerController {

    @Autowired
    private CrawlerService crawlerService;

    /**
     * ??????
     *
     * @return ??????????List
     */
    @RequestMapping("list")
    public List<Crawler> listAll() {
        return crawlerService.listAll();
    }


    /**
     * ??????
     *
     * @param id ??
     * @return ?????????null
     */
    @RequestMapping("getById")
    public Crawler getById(Integer id) {
        return crawlerService.getById(id);
    }
    
    /**
     * ?????????
     *
     * @param crawler ?????
     * @return ??????
     */
    @RequestMapping("insert")
    public int insert(@RequestBody Crawler crawler) {
        return crawlerService.insert(crawler);
    }
    
    /**
     * ?????null??
     *
     * @param crawler ?????
     * @return ??????
     */
    @RequestMapping("insertIgnoreNull")
    public int insertIgnoreNull(@RequestBody Crawler crawler) {
        return crawlerService.insertIgnoreNull(crawler);
    }
    
    /**
     * ?????????
     *
     * @param crawler ?????
     * @return ??????
     */
    @RequestMapping("update")
    public int update(@RequestBody Crawler crawler) {
        return crawlerService.update(crawler);
    }
    
    /**
     * ?????null??
     *
     * @param crawler ?????
     * @return ??????
     */
    @RequestMapping("updateIgnoreNull")
    public int updateIgnoreNull(@RequestBody Crawler crawler) {
        return crawlerService.updateIgnoreNull(crawler);
    }
    
    /**
     * ????
     *
     * @param crawler ??????
     * @return ??????
     */
    @RequestMapping("delete")
    public int delete(@RequestBody Crawler crawler) {
        return crawlerService.delete(crawler);
    }
    
}