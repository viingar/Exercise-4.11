package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public interface Operation {
    double getResult (double a, double b);
}
