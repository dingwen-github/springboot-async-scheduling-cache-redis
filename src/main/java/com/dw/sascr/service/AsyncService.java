package com.dw.sascr.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @program:
 * @description: SpringBoot 异步
 * @author: dingwen
 * @create: 2020/10/16 15:15
 **/

/*
    异步执行要求：
        1.必须是公共方法 public
        2.必须从外部调用
    @Async 方法返回值：
        1.void
        2.Future<T>
        3.其他类型一律一致返回null
        4.注意：int、double、float、boolean基础类型运行时会抛出AopInvocationException异常
 */
@Service
public class AsyncService {
    @Async
    public void doA(){
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("A任务完成");
                this.cancel();
            }
        },20000);
        System.out.println("doA");
    }

    @Async
    public void doB(){
        System.out.println("doB");
    }

    @Async
    public void doC(){
        System.out.println("doC");
        doA();
        doB();
    }
}
