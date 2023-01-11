package com.nestdigital.xyzbackendapp.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @PostMapping("/studentEntry")
    public String studentEntry(){
        return "test";
    }
}
