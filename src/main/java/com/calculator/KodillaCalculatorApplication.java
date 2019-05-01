package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class KodillaCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaCalculatorApplication.class, args);

        Calculator calculator = new Calculator();

        System.out.println(calculator.addSomeNumbers(5, 5));
        System.out.println(calculator.deleteSomeNumbers(5, 5));
    }
}
