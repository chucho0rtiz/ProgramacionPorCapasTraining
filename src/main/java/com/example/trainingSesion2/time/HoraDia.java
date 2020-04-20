package com.example.trainingSesion2.time;

import com.example.trainingSesion2.configuration.UniTime;
import com.example.trainingSesion2.preconditions.Preconditions;
import lombok.Value;

@Value(staticConstructor = "from")
public class HoraDia {
    Hora hora;
    IntegerGeneric minuto;
    IntegerGeneric segundo;
    Long unidadTiempo;

    public HoraDia(Hora hora, IntegerGeneric minuto, IntegerGeneric segundo, Long unidadTiempo) {
        Preconditions.checkNotNull(hora);
        Preconditions.checkNotNull(minuto);
        Preconditions.checkNotNull(segundo);
        Preconditions.checkNotNull(unidadTiempo);

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
        this.unidadTiempo = unidadTiempo;
    }
}
