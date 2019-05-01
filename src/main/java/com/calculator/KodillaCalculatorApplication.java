package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class KodillaCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCalculatorApplication.class, args);

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(5, 5));
        System.out.println(calculator.subtract(5, 5));
    }
}
