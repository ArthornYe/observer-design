package com.souche.observer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 创建一个事件监听器（观察者 observer）
 * listener defination
 */
@Service("myApplicationListener")
public class MyApplicationListener implements ApplicationListener {


    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println(applicationEvent.getClass());
        if(applicationEvent instanceof  MyTestEvent){
            System.out.println("get to MyApplicationEvent");
        }
    }
}
