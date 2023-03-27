package com.koc.themeServer.theme.domain;

import com.koc.themeServer.theme.dto.ThemeDto;
import com.koc.themeServer.theme.service.ThemeService;
import com.koc.themeServer.theme.validation.ThemeValidation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ThemeDomainService {
    private final ThemeService themeService;
    private final ThemeValidation themeValidation;

    public ThemeDto findById(Long id) {
        return themeService.findById(id);
    }

    public void save(ThemeDto themeDto) {
        themeValidation.isAreadyExistName(themeDto);
        themeService.save(themeDto);
    }

    public void update(ThemeDto themeDto) {
        themeValidation.isAreadyExistName(themeDto);
        themeService.save(themeDto);
    }

    public List<ThemeDto> getRecomendedThemeList() {
        return themeService.findAll().stream().
                sorted((o1, o2) -> o2.getThemeLikeDtos().size() - o1.getThemeLikeDtos().size())
                .limit(3)
                .toList();
    }

    public void deleteById(Long id) {
        themeService.deleteById(id);
    }
}
