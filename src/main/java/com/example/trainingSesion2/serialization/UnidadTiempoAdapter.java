package com.example.trainingSesion2.serialization;

import com.example.trainingSesion2.time.UnidadTiempo;
import com.google.gson.*;

import java.lang.reflect.Type;

public class UnidadTiempoAdapter implements JsonDeserializer<UnidadTiempo>, JsonSerializer<UnidadTiempo> {
    @Override
    public UnidadTiempo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        String value = jsonElement.getAsString();
        return UnidadTiempo.valueOf(value);
    }

    @Override
    public JsonElement serialize(UnidadTiempo unidadTiempo, Type type, JsonSerializationContext jsonSerializationContext) {
        String value = unidadTiempo.name();
        return new JsonPrimitive(value);
    }
}
