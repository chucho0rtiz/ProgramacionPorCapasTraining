package com.example.trainingSesion2.time;

import com.example.trainingSesion2.preconditions.Preconditions;
import lombok.Value;

import java.time.LocalTime;

public enum UnidadTiempo {
    Milisegundos,
    Segundos,
    Minutos,
    Horas;

    public static Long time(UnidadTiempo uni, LocalTime localTime){
        int hora = localTime.getHour();
        int minuto = localTime.getMinute();
        int segundo = localTime.getSecond();
        int milisegundo = localTime.getSecond();
        switch (uni){
            case Horas:
                long value1 = hora;
                return value1;
            case Minutos:
                long value2 = hora*60;
                return value2;
            case Segundos:
                long value3 = ((minuto*60)+((hora*60)*60));
                return value3;
            case Milisegundos:
                long value4 = ((segundo*1000)+((minuto*60)*1000)+(((hora*60)*60)*1000));
                return value4;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

/*@Value(staticConstructor = "of")
public class UnidadTiempo {
    String value;

    private UnidadTiempo(String value){
        Preconditions.checkNotNull(value);
        Preconditions.checkArgument(value.equals("Milisegundos") || value.equals("Segundos") ||
                value.equals("Minutos") || value.equals("Horas"));
        this.value = value;
    }
}*/
