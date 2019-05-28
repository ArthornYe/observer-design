package com.souche.observer;

import org.springframework.context.ApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

/**
 * 创建一个事件监听器（观察者 observer）
 * listener defination
 */
@Order(2)
@Service("myApplicationListener")
public class MyApplicationListener implements ApplicationListener<MyTestEvent> {


    @Override
    public void onApplicationEvent(MyTestEvent applicationEvent) {
        //System.out.println(applicationEvent.getClass());
        //if(applicationEvent instanceof  MyTestEvent){
            System.out.println("get to MyApplicationListener...");
        //}
    }

}
