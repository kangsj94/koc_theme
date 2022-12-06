package com.koc.tema_back.place.placeClient;

import feign.codec.Decoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PlaceConfig {
    @Bean
    Decoder feignDecoder(){
        return new PlaceDecoder();
    }
}
