package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceimple2 implements EmpleadoService {

    @Override
    public String Hello(){
        return "Hola desde ClienteB";
    }
}
