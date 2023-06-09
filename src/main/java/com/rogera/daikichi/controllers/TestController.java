package com.rogera.daikichi.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//thought i had to use random. turns out we dont. 
import java.util.Random;

@RestController
public class TestController {
	
	@RequestMapping("/daikichi/travel/{id}")
	public String travel( @PathVariable("id") String cityID ) {
		return "We regret to inform you that you have been relocated to," + " " + cityID;
	}
	
	@RequestMapping("/daikichi/lotto/{id}")
	public String luckynumber(@PathVariable("id") int eventID) {
			if ( eventID % 2 == 0) {
				return "It is NOT your lucky day. You have gotten an EVEN number:" + " " + eventID;
			}
			else if(eventID == 7) {
				return "7!? you have found the ONE PIECE!";
			}
			
			else {
				return "You are indeed LUCKY. ODDly, it is your lucky day." + " " + eventID;
			}
	}
	
}
