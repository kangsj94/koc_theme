package com.koc.tema_back.tema.entity;

import org.springframework.stereotype.Component;

@Component
public class TemaMapper {
    public TemaDto entityToDto(TemaEntity temaEntity) {
        return TemaDto.builder()
                .id(temaEntity.getId())
                .temaNm(temaEntity.getTemaName())
                .iconUrl(temaEntity.getIconUrl())
                .build();
    }

    public TemaEntity dtoToEntity(TemaDto temaDto) {
        return TemaEntity.builder()
                .id(temaDto.getId())
                .temaName(temaDto.getTemaNm())
                .iconUrl(temaDto.getIconUrl())
                .build();
    }
}
