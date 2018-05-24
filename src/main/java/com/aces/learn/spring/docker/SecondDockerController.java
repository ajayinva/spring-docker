package com.aces.learn.spring.docker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondDockerController {
    /**
     *
     * @return
     */
    @RequestMapping("/sayHi")
    public String sayHi(){
        // Comment 1
		// Comment 2
		// Comment 3
        //A Comment Locally
        return "Hi World from Second Docker Controller";
    }
}
