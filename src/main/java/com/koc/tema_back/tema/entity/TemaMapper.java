package com.koc.tema_back.tema.entity;

public class TemaMapper {
    public TemaDto entityToDto(TemaEntity temaEntity) {
        return TemaDto.builder()
                .id(temaEntity.getId())
                .TemaNm(temaEntity.getTemaName())
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
