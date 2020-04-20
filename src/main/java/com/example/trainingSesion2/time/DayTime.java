package com.example.trainingSesion2.time;

import lombok.Value;

import java.time.LocalDate;
import java.time.LocalTime;

@Value(staticConstructor = "of")
public class DayTime {
    Hora hora;
    IntegerGeneric minuto;
    IntegerGeneric segundo;

}
