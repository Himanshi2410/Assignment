package com.zensar.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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
       ApplicationContext ctx= new ClassPathXmlApplicationContext("performers.xml");
        Performer p= ctx.getBean("harshu", Performer.class);
        p.perform();
        
        ConfigurableApplicationContext cfgctx= (ConfigurableApplicationContext) ctx;
      //shutting down cfgctx container
        cfgctx.close();
    }
    
    
}
