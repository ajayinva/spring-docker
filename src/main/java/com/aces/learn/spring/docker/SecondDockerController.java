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
        return "Hi World from Second Docker Controller in Remote Branch 2 with some changes";
    }
}
