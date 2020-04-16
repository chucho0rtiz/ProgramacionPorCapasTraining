package com.example.trainingSesion2.configuration;

import com.example.trainingSesion2.time.UnidadTiempo;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "unidadtiempo")
@RequiredArgsConstructor
@Data
public class UniTime {
    private UnidadTiempo tiempo;
}
