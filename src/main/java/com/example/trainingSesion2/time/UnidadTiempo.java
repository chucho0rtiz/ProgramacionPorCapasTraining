package com.example.trainingSesion2.time;

import com.example.trainingSesion2.preconditions.Preconditions;
import lombok.Value;

@Value(staticConstructor = "of")
public class UnidadTiempo {
    String value;

    private UnidadTiempo(String value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value.equals("Milisegundos") || value.equals("Segundos") ||
                value.equals("Minutos") || value.equals("Horas"));
        this.value = value;
    }
}
