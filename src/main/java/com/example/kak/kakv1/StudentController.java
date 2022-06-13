package com.example.kak.kakv1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/Student")
public class StudentController {
        @Value("${message}")
        private String message;

        @GetMapping("msg")
        public String getMessage(){
                return "student";
        }


}
