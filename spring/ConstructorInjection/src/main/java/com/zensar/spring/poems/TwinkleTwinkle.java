package com.zensar.spring.poems;

/*Author: Himanshi Kumrawat
 *Creation date: 27/07/2019
 *Modified Date: 27/07/2019
 *Version:1.0
 *Copyright: zensar technologies.All rights reserved.
 *Description:It represents a Twinkkle Twinkle poem
 */

public class TwinkleTwinkle implements Poem {
	
	private final static String LINES[]={
			"Twinkle Twinkle Little Star",
			"How I wonder what you are",
			"Up above the world so High",
			"Like A Dimond In the Sky"
	};

	public void recite() {
		// TODO Auto-generated method stub

		for(String line:LINES)
			System.out.println(line);
	}

}
