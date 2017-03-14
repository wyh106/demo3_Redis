package com.app.controller;

import com.app.domain.DemoInfo;
import com.app.service.DemoInfoService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lenovo on 2017/3/13.
 * 测试redis缓存
 */
@RestController
public class DemoInfo_EHCacheController {
    @Autowired
    DemoInfoService demoInfoService;

    @RequestMapping("/testEHCache")
    public String test(){
        //存入两条数据.
        DemoInfo demoInfo = new DemoInfo();
        demoInfo.setName("张三");
        demoInfo.setPwd("123456");
        DemoInfo demoInfo2 = demoInfoService.save(demoInfo);
        //不走缓存.
        System.out.println(demoInfoService.findById(demoInfo2.getId()));
        //走缓存.
        System.out.println(demoInfoService.findById(demoInfo2.getId()));
        demoInfo = new DemoInfo();
        demoInfo.setName("李四");
        demoInfo.setPwd("123456");
        DemoInfo demoInfo3 = demoInfoService.save(demoInfo);
        //不走缓存.
        System.out.println(demoInfoService.findById(demoInfo3.getId()));
        //走缓存.
        System.out.println(demoInfoService.findById(demoInfo3.getId()));
        System.out.println("============修改数据=====================");
        //修改数据.
        DemoInfo updated = new DemoInfo();
        updated.setName("李四-updated");
        updated.setPwd("123456");
        updated.setId(demoInfo3.getId());
        try {
            System.out.println(demoInfoService.update(updated));
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        //不走缓存.
        System.out.println(demoInfoService.findById(updated.getId()));
        return "ok";
    }
}
