package com.example.trainingSesion2.time;

import lombok.Value;

@Value(staticConstructor = "of")
public class DayTimeCreated {
    Hora hora;
    IntegerGeneric minuto;
    IntegerGeneric segundo;
    Long id;
}
