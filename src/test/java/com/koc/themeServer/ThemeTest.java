package com.koc.themeServer;

import com.koc.themeServer.theme.domain.ThemeDomainService;
import com.koc.themeServer.theme.dto.ThemeDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ThemeTest {
    @Autowired
    private ThemeDomainService themeDomainService;

    @Test
    void 생성테스트() {

        ThemeDto themeDto = ThemeDto.builder().themeName("test").build();
        themeDomainService.save(themeDto);
    }

    @Test
    void id조회() {
        ThemeDto themeDto = ThemeDto.builder().themeName("test").build();
        themeDomainService.save(themeDto);
        assertThat(themeDomainService.findById(1L).getThemeName()).isEqualTo("test");
    }

    @Test
    void 수정() {
        ThemeDto themeDto = ThemeDto.builder().themeName("test").build();
        themeDomainService.save(themeDto);
        themeDto = themeDomainService.findById(1L);
        themeDto.setThemeName("mod");
        themeDomainService.update(themeDto);
        themeDto = themeDomainService.findById(1L);
        assertThat(themeDto.getThemeName()).isEqualTo("mod");
    }
}
