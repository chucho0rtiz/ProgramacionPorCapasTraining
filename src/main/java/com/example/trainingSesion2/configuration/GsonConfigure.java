package com.example.trainingSesion2.configuration;

import com.example.trainingSesion2.serialization.HoraAdapter;
import com.example.trainingSesion2.serialization.MinutoAdapter;
import com.example.trainingSesion2.serialization.SegundoAdapter;
import com.example.trainingSesion2.serialization.UnidadTiempoAdapter;
import com.example.trainingSesion2.time.Hora;
import com.example.trainingSesion2.time.Minuto;
import com.example.trainingSesion2.time.Segundo;
import com.example.trainingSesion2.time.UnidadTiempo;
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
                .registerTypeAdapter(Minuto.class, new MinutoAdapter())
                .registerTypeAdapter(Segundo.class, new SegundoAdapter())
                .registerTypeAdapter(UnidadTiempo.class, new UnidadTiempoAdapter())
                .create();
    }
}
