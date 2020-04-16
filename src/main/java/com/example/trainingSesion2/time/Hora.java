package com.example.trainingSesion2.time;

import lombok.Value;
import com.example.trainingSesion2.preconditions.Preconditions;

@Value(staticConstructor = "of")
public class Hora {
    Integer value;

    private Hora(Integer value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value >= 0 && value <= 23);
        this.value = value;
    }
}
