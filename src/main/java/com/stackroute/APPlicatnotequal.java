package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class APPlicatnotequal {
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Movie BEAN1=context.getBean("MovieA", Movie.class);

        Movie BEAN2=context.getBean("MovieB", Movie.class);

        System.out.println(BEAN1==BEAN2);



    }
}
