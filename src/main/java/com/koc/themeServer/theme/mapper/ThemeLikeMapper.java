package com.koc.themeServer.theme.mapper;

import com.koc.themeServer.theme.dto.ThemeLikeDto;
import com.koc.themeServer.theme.entity.ThemeEntity;
import com.koc.themeServer.theme.entity.ThemeLikeEntity;
import org.springframework.stereotype.Component;

@Component
public class ThemeLikeMapper {

  public ThemeLikeEntity dtoToEntity(ThemeLikeDto dto){
    return ThemeLikeEntity.builder()
            .id(dto.getId())
            .userId(dto.getUserId())
            .themeId(dto.getThemeId())
            .isLiked(dto.isLiked())
            .build();

  }
}
