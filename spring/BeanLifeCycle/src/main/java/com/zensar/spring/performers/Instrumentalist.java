package com.zensar.spring.performers;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import com.zensar.spring.instruments.Instrument;



/*Author: Himanshi Kumrawat
 *Creation date: 29/07/2019 2:23PM IST
 *Modified Date: 29/07/2019 2:23PM IST
 *Version:2.0
 *Copyright: zensar technologies.All rights reserved.
 *Description:It is performs with the bean life cycle
 *
 */
public class Instrumentalist implements Performer,BeanNameAware,BeanFactoryAware,ApplicationContextAware,InitializingBean,DisposableBean{
	
	private String song;
	private Instrument instrument;
	private String beanName;
	
	

	public String getSong() {
		return song;
	}



	public void setSong(String song) {
		this.song = song;
		System.out.println("song is set");
	}



	public Instrument getInstrument() {
		return instrument;
	}


// for setter injection
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
		System.out.println("instrument is set");
	}


//business logic of instrument
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("instrumentalist "+ beanName +" is playing" +song);
		instrument.play();

	}



public void setBeanName(String name) {
	// TODO Auto-generated method stub
	this.beanName=name;
	System.out.println("bean name is set");
}



public void setBeanFactory(BeanFactory arg0) throws BeansException {
	// TODO Auto-generated method stub
	System.out.println("Spring core IOC container Beanfactory is set");
}



public void setApplicationContext(ApplicationContext arg0) throws BeansException {
	// TODO Auto-generated method stub
	System.out.println("Spring Specialized IOC ApplicationContext is set");
}



public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
  System.out.println("afterPropertiesSet is called");	
}
public void tuneInstrument()
{   
	instrument.tune();
	System.out.println("custom init method");
}



public void destroy() throws Exception {
	// TODO Auto-generated method stub
	
	instrument.clean();
	System.out.println("the destroy method is called");
	
}
public void cleanInstrument()
{
 instrument.clean();
 System.out.println("custom destroy method");

}

}
