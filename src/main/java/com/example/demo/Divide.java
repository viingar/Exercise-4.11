package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Divide implements Operation {
    @Override
    public double getResult(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: division by 0 ");
        }
        return 0.0;
    }
}
