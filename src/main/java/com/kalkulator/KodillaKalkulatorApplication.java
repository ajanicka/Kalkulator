package com.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaKalkulatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(KodillaKalkulatorApplication.class, args);

        Calculator calculator = new Calculator();

        calculator.addSomeNumbers(5, 5);
        calculator.deleteSomeNumbers(5, 5);
    }
}
