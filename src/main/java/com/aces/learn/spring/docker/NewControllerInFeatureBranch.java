/**
 * 
 */
package com.aces.learn.spring.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author aagarwal
 *
 */
@RestController
public class NewControllerInFeatureBranch {
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/sayHelloInFeatureBranch")
	public String sayHello(){
		//Some Changes in the Feature Branch 
		return "I am a change in the Master Branch";
	}
}
