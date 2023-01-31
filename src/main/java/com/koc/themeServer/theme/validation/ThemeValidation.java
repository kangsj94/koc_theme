package com.koc.themeServer.theme.validation;

import com.koc.themeServer.theme.dto.ThemeDto;
import com.koc.themeServer.theme.service.ThemeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ThemeValidation {
    private final ThemeService themeService;

    public void isAreadyExistName(ThemeDto themeDto) {
        if (themeService.findbyName(themeDto.getThemeName()).isPresent()) {
            throw new IllegalArgumentException("이미 있는 테마명입니다.");
        }
    }
}
