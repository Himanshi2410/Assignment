package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.performers.Performer;

/**
 * Hello world!
 *
 */
public class ZensarIdol
{
    public static void main( String[] args )
    {
       ApplicationContext ctx =new ClassPathXmlApplicationContext("performers.xml");
       Performer p=ctx.getBean("sakshi",Performer.class);
       p.perform();
       
       Performer p1 = ctx.getBean("mishel",Performer.class);
        p1.perform();
    }
}
