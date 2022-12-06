package com.koc.tema_back.tema.entity;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class TemaDto {
    private long id;
    private String TemaNm;
    private String iconUrl;
}
