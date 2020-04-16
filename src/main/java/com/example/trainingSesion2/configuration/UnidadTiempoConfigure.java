package com.example.trainingSesion2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class UnidadTiempoConfigure {

    @Bean
    public UniTime unidad(UniTime uniTime){
        System.out.println("prueba:     "+uniTime);
        return uniTime;
    }
}
