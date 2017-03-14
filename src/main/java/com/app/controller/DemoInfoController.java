package com.app.controller;

import com.app.domain.DemoInfo;
import com.app.service.DemoInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lenovo on 2017/3/13.
 * 测试redis缓存
 */
@Controller
public class DemoInfoController {
   /* @Autowired
    DemoInfoService demoInfoService;

    @RequestMapping("/test")
    public@ResponseBody
    String test(){
        DemoInfo loaded = demoInfoService.findById(1);
        System.out.println("loaded="+loaded);
        DemoInfo cached = demoInfoService.findById(1);
        System.out.println("cached="+cached);
        loaded = demoInfoService.findById(2);
        System.out.println("loaded2="+loaded);
        return"ok";
    }

    @RequestMapping("/delete")
    public@ResponseBody String delete(long id){
        demoInfoService.deleteFromCache(id);
        return"ok";
    }

    @RequestMapping("/test1")
    public@ResponseBody String test1(){
        demoInfoService.test();
        System.out.println("DemoInfoController.test1()");
        return"ok";
    }*/
}
