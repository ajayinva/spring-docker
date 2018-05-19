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
public class DockerController {
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/sayHello")
	public String sayHello(){
		//Test Comments1234
		//Test Comments1234567
		return "Hello World from Docker";
	}
}
