package com.example.trainingSesion2.configuration;

import com.example.trainingSesion2.serialization.*;
import com.example.trainingSesion2.time.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GsonConfigure {

    @Bean
    public Gson gson(){
        return new GsonBuilder()
                .registerTypeAdapter(Hora.class, new HoraAdapter())
                .registerTypeAdapter(IntegerGeneric.class, new IntegerValueAdapter<>(IntegerGeneric::of))
                .registerTypeAdapter(UnidadTiempo.class, new UnidadTiempoAdapter())
                .create();
    }
}
