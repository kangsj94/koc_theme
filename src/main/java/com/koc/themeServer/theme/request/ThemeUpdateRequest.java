package com.koc.themeServer.theme.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.koc.themeServer.theme.dto.ThemeDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ThemeUpdateRequest {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("themeName")
    private String themeName;
    @JsonProperty("emoji")
    private String emoji;

    public ThemeDto requestToDto() {
        return ThemeDto.builder()
                .id(this.id)
                .themeName(this.themeName)
                .emoji(this.emoji)
                .build();
    }
}
