package com.gpa;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    
    public CalcService calcService;

    public CalcController(CalcService calcService) {
        this.calcService = calcService;
    }
    
}
