package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("it is destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties are set");
    }
    public void customDestroy() throws Exception {
        System.out.println("Bean is destroyed or called");
    }
    public void customInit() throws Exception {
        System.out.println("customBean is initialized or called");
    }

}
