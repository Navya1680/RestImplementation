package com.caveofprogramming.controller;

import com.caveofprogramming.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentImpl {
    @GetMapping("/std")
    public Student student(){
        return new Student(435,"Sam","sam@gmail.com","Hyderabad");
    }
}
