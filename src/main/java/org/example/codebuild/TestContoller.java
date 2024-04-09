package org.example.codebuild;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/")
public class TestContoller {

    @GetMapping("/test")
    public String test(){
        log.info("Test Complete !!");
        return "OK";
    }
}
