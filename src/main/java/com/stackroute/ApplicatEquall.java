package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicatEquall {
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie BEAN1=context.getBean("movie", Movie.class);

        Movie BEAN2=context.getBean("movie", Movie.class);

        System.out.println(BEAN1==BEAN2);



    }
}
