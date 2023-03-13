package com.koc.themeServer.theme.dto;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ThemeLikeDto {
  private Long id;
  private Long userId;
  private Long themeId;
  private boolean isLiked;
}
