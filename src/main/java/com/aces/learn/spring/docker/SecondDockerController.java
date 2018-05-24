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
        //This a new Comment
        return "Hi World from Second Docker Controller";
    }
}
