package com.sed.pms.sdr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sed"})
public class SuplierDetailsApplication {
    protected SuplierDetailsApplication() {

    }

    public static void main(String[] args) {
        SpringApplication.run(SuplierDetailsApplication.class, args);
    }

}
