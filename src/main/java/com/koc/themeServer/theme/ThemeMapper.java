package com.koc.themeServer.theme;

import com.koc.themeServer.theme.entity.ThemeEntity;
import org.springframework.stereotype.Component;

@Component
public class ThemeMapper {
    public ThemeDto entityToDto(ThemeEntity temaEntity) {
        return ThemeDto.builder()
                .id(temaEntity.getId())
                .temaNm(temaEntity.getTemaName())
                .iconUrl(temaEntity.getIconUrl())
                .build();
    }

    public ThemeEntity dtoToEntity(ThemeDto themeDto) {
        return ThemeEntity.builder()
                .id(themeDto.getId())
                .temaName(themeDto.getTemaNm())
                .iconUrl(themeDto.getIconUrl())
                .build();
    }
}
