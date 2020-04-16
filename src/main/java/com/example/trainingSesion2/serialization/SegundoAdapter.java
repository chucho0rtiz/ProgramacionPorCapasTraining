package com.example.trainingSesion2.serialization;

import com.example.trainingSesion2.time.Segundo;
import com.google.gson.*;

import java.lang.reflect.Type;

public class SegundoAdapter implements JsonDeserializer<Segundo>, JsonSerializer<Segundo> {
    @Override
    public Segundo deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Integer value = jsonElement.getAsInt();
        return Segundo.of(value);
    }

    @Override
    public JsonElement serialize(Segundo segundo, Type type, JsonSerializationContext jsonSerializationContext) {
        Integer value = segundo.getValue();
        return new JsonPrimitive(value);
    }
}
