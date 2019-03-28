package com.souche.observer;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

/**
 * 创建另一个事件监听器
 * 对于继承了 ApplicationEvent的事件所有入参对应的监听器都会监听到，执行onApplicationEvent方法
 */
@Service("myTestApplictionListener")
public class MyTestApplicationListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println(applicationEvent.getClass());
        if(applicationEvent instanceof MyTestEvent){
            System.out.println("get to MyTestApplicationListener...");
        }
    }
}
