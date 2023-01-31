package com.koc.themeServer.theme.mapper;

import com.koc.themeServer.theme.dto.ThemeDto;
import com.koc.themeServer.theme.entity.ThemeEntity;
import org.springframework.stereotype.Component;

@Component
public class ThemeMapper {
    public ThemeDto entityToDto(ThemeEntity temaEntity) {
        return ThemeDto.builder()
                .id(temaEntity.getId())
                .themeName(temaEntity.getThemeName())
                .emoji(temaEntity.getEmoji())
                .build();
    }

    public ThemeEntity dtoToEntity(ThemeDto themeDto) {
        return ThemeEntity.builder()
                .id(themeDto.getId())
                .themeName(themeDto.getThemeName())
                .emoji(themeDto.getEmoji())
                .build();
    }
}
