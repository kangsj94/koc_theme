package com.koc.themeServer.theme.mapper;

import com.koc.themeServer.theme.dto.ThemeDto;
import com.koc.themeServer.theme.entity.ThemeEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ThemeMapper {
    private final ThemeLikeMapper themeLikeMapper;

    public ThemeDto entityToDto(ThemeEntity themeEntity) {
        return ThemeDto.builder()
                .id(themeEntity.getId())
                .themeName(themeEntity.getThemeName())
                //.themeLikeDtos(themeEntity.getThemeLikes().stream().map(themeLikeMapper::entityToDto).filter(ThemeLikeDto::isLiked).toList())
                .emoji(themeEntity.getEmoji())
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
