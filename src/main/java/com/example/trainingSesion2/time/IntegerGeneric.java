package com.example.trainingSesion2.time;

import com.example.trainingSesion2.interfaces.IntegerSerializable;
import com.example.trainingSesion2.preconditions.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class IntegerGeneric implements IntegerSerializable {
    Integer value;

    private IntegerGeneric(Integer value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value >= 0 && value <= 59);
        this.value = value;
    }

    @Override
    public Integer valueOf() {
        return value;
    }
}
