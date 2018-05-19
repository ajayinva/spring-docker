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
		return "Hello World from Docker";
	}
}
