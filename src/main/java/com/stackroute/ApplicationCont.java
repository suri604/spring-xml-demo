package com.stackroute;


import com.stackroute.domain.Movie;
import com.stackroute.domain.beanConfig;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class ApplicationCont
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(beanConfig.class);
        Movie mov=context.getBean( Movie.class);
        mov.display();

    }
}
