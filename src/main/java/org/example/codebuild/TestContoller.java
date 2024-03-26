package org.example.codebuild;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestContoller {

    @GetMapping("/test")
    public String test(){
        return "OK";
    }
}