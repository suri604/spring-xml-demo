package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actor actor;
    private ApplicationContext applicationContext = null;
    private BeanFactory beanFactory=null;
    private String beanName=null;

    public Movie(Actor actor) {
        this.actor = actor;
    }



    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
        System.out.println("Applicatrion context has been set to your object");
    }

    public void Display()
    {
        actor.display();
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
      this.beanFactory=beanFactory;
        System.out.println("Bean factory object has been injected");


    }

    @Override
    public void setBeanName(String s) {
        this.beanName=s;
        System.out.println("Bean name set is : "+this.beanName);
    }
}
