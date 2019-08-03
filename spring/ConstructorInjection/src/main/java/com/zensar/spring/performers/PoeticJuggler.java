package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

/*Author: Himanshi Kumrawat
 *Creation date: 27/07/2019
 *Modified Date: 27/07/2019
 *Version:1.0
 *Copyright: zensar technologies.All rights reserved.
 *Description:More skiled juggler who juggles
 *while receiting a poem.
 *poem is injected into poeticJuglar 
 *using constructor Injector
 */
public class PoeticJuggler extends Juggler {
	
	
	//Dependancy Object referancee
	private Poem poem;
	
	public PoeticJuggler() {
		// TODO Auto-generated constructor stub
		System.out.println("no-Arg constructor of poeticJuggler");
	}
     	   
	
	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
		System.out.println("Parm construtor of poectic juggler");
	}


	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("while receiting a poem....");
		poem.recite();
	}
	

}
