package com.koc.themeServer.theme.request;

import com.koc.themeServer.theme.dto.ThemeLikeDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ThemeLikeRequest {
    private Long id;
    private Long userId;
    private Long themeId;
    private boolean isLiked;

    public ThemeLikeDto toDto() {
        return ThemeLikeDto.builder()
                .id(this.id)
                .userId(this.userId)
                .themeId(this.themeId)
                .isLiked(this.isLiked)
                .build();
    }
}
