package com.koc.themeServer.theme.entity;

import lombok.*;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ThemeDto {
    private long id;
    private String temaNm;
    private String iconUrl;
}
