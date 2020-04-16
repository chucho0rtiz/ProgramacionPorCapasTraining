package com.example.trainingSesion2.time;

import com.example.trainingSesion2.preconditions.Preconditions;
import lombok.Value;

@Value(staticConstructor = "from")
public class HoraDia {
    Hora hora;
    Minuto minuto;
    Segundo segundo;
    UnidadTiempo unidadTiempo;

    public HoraDia(Hora hora, Minuto minuto, Segundo segundo, UnidadTiempo unidadTiempo) {
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
