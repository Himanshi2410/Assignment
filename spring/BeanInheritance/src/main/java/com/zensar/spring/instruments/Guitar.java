package com.zensar.spring.instruments;


/*Author: Himanshi Kumrawat
 *Creation date: 29/07/2019 2:40PM IST
 *Modified Date: 29/07/2019 2:40PM IST
 *Version:2.0
 *Copyright: zensar technologies.All rights reserved.
 *Description:It is used to play the tune
 */

public class Guitar implements Instrument {

	public void play() {
		// TODO Auto-generated method stub
 System.out.println("ting ting ting.......");
	}

	public void tune() {
		// TODO Auto-generated method stub
		System.out.println("guitar is tuned");
		
	}

	public void clean() {
		// TODO Auto-generated method stub
		System.out.println("the guitar is cleaned");
	}

}
