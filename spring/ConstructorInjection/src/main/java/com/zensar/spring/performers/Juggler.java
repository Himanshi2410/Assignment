package com.zensar.spring.performers;


/*Author: Himanshi Kumrawat
 *Creation date: 27/07/2019
 *Modified Date: 27/07/2019
 *Version:1.0
 *Copyright: zensar technologies.All rights reserved.
 *Description:It represents a performer juggler of zensar idol competition.
 *juggler gets bean bags using constuctor injection. 
 */
public class Juggler implements Performer {
	
	private int beanBags;
public Juggler() {
	// TODO Auto-generated constructor stub
	System.out.println("no-arg constructor");
}
	
	
	
	
	
	public Juggler(int beanBags) {
	super();
	this.beanBags = beanBags;
	System.out.println("Pram constructor of juggler");
}
	




//business logic method of performer
	public void perform() {
		// TODO Auto-generated method stub
		System.out.println("juggler juggling beanbages" +beanBags);

	}

}
