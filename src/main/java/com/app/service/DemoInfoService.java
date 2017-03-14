package com.app.service;

import com.app.domain.DemoInfo;
import javassist.NotFoundException;

/**
 * Created by lenovo on 2017/3/13.
 */
public interface DemoInfoService {
    /*public DemoInfo findById(long id);
    public void deleteFromCache(long id);
    void test();*/

    /**以下是SpringBoot集成EHCache实现缓存机制案例*/
    void delete(Long id);
    DemoInfo update(DemoInfo updated) throws NotFoundException;
    DemoInfo findById(Long id);
    DemoInfo save(DemoInfo demoInfo);

}
