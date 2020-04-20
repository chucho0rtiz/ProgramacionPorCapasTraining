package com.example.trainingSesion2.time;

import lombok.Value;

@Value(staticConstructor = "of")
public class CreateTimeRequest {
    Hora hora;
    IntegerGeneric minuto;
    IntegerGeneric segundo;
}
