package com.masti.jatin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/bui")
public class bui {

    @GetMapping("/display")
    public String display(){
        return "Hello World";
    }

    @GetMapping("/{msg}")
    public String display2(@PathVariable String msg){
        return msg +"pathwala";
    }
}
