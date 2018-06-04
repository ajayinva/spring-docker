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
public class NewControllerInDevelopBranch {
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/sayHello")
	public String sayHello(){
		//Some Changes in the Develop Branch which are not in the Feature Branch
		return "I am a change in the Master Branch";
	}
}
