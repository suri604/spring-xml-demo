package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class XmlBeanFac {
    public static void main(String[] args) {
        XmlBeanFactory context = new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie mov = context.getBean("Tees", Movie.class);
        mov.getAkki();
    }
}