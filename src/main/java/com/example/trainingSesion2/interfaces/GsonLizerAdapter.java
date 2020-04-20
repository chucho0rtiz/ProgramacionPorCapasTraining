package com.example.trainingSesion2.interfaces;

import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializer;

public interface GsonLizerAdapter<T> extends JsonDeserializer<T>, JsonSerializer<T> {
}
