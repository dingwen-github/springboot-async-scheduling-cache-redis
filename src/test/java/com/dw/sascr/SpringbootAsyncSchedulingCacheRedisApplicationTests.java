package com.dw.sascr;

import com.dw.sascr.service.AsyncService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Async;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringbootAsyncSchedulingCacheRedisApplication.class})
class SpringbootAsyncSchedulingCacheRedisApplicationTests {

    @Autowired
    private AsyncService asyncService;

    @Test
    public void asyncTest() {
//        asyncService.doC();
        asyncService.doA();
        asyncService.doB();
    }

}
