package com.example.demo;

import com.example.demo.controler.EmpleadoController;
import  org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

        var empleadorController = context.getBean(EmpleadoController.class);
        System.out.println(empleadorController.hello());



    }
}
