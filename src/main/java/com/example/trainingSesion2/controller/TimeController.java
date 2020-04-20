package com.example.trainingSesion2.controller;

import com.example.trainingSesion2.services.TimeServices;
import com.example.trainingSesion2.time.DayTime;
import com.example.trainingSesion2.time.DayTimeCreated;
import com.example.trainingSesion2.time.Hora;
import com.example.trainingSesion2.time.IntegerGeneric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.ArrayList;

@RestController
@RequestMapping("/api/v1/times")
public class TimeController {

    private final TimeServices timeServices;

    @Autowired
    public TimeController(TimeServices timeServices) {
        this.timeServices = timeServices;
    }

    @PostMapping
    public DayTimeCreated crear(){
        LocalTime timeNow = LocalTime.now();
        Hora hora = Hora.of(timeNow.getHour());
        IntegerGeneric minuto = IntegerGeneric.of(timeNow.getMinute());
        IntegerGeneric segundo = IntegerGeneric.of(timeNow.getSecond());
        DayTime time = DayTime.of(hora, minuto, segundo);
        return timeServices.createTime(time);
    }

    //@GetMapping("/find/{id}")
    //public TimeCreated findById(@PathVariable Long id){
    //    return timeServices.findById(id);
    //}

    @GetMapping
    public ArrayList findALL(){
        return timeServices.findAll();
    }
}
