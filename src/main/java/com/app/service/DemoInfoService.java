package com.app.service;

import com.app.domain.DemoInfo;

/**
 * Created by lenovo on 2017/3/13.
 */
public interface DemoInfoService {
    public DemoInfo findById(long id);
    public void deleteFromCache(long id);
    void test();

}
