package com.example.trainingSesion2.controller;

import com.example.trainingSesion2.time.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping("/api/v1/date")
public class DateTimeController {

    @GetMapping("/time")
    private HoraDia time(){
        LocalTime time = LocalTime.now();
        Hora hora = Hora.of(time.getHour());
        Minuto minuto = Minuto.of(time.getMinute());
        Segundo segundo = Segundo.of(time.getSecond());
        UnidadTiempo unidadTiempo = UnidadTiempo.of("Horas");

        return HoraDia.from( hora, minuto, segundo, unidadTiempo );
    }
}
