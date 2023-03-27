package com.koc.themeServer.theme.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ThemeDto {
    private long id;
    private String themeName;
    private String emoji;

    private List<ThemeLikeDto> themeLikeDtos;
}
