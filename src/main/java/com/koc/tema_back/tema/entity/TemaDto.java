package com.koc.tema_back.tema.entity;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class TemaDto {
    private long id;
    private String temaNm;
    private String iconUrl;
}
