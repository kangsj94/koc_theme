package com.koc.themeServer.theme.controller;

import com.koc.themeServer.theme.domain.ThemeDomainService;
import com.koc.themeServer.theme.domain.ThemeLikeDomainService;
import com.koc.themeServer.theme.dto.ThemeDto;
import com.koc.themeServer.theme.dto.ThemeLikeDto;
import com.koc.themeServer.theme.request.ThemeLikeRequest;
import com.koc.themeServer.theme.request.ThemeSaveRequest;
import com.koc.themeServer.theme.request.ThemeUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ThemeController {
    private final ThemeDomainService themeDomainService;
    private final ThemeLikeDomainService themeLikeDomainService;

    @PostMapping("/theme")
    public void save(@RequestBody ThemeSaveRequest themeSaveRequest) {
        themeDomainService.save(themeSaveRequest.requestToDto());
    }

    @GetMapping("/theme/health-check")
    public Long healthCheck() {
        return System.currentTimeMillis();
    }

    @PostMapping("/theme/like")
    public ThemeLikeDto likeTheme(@RequestBody ThemeLikeRequest themeLikeRequest) {
        return themeLikeDomainService.like(themeLikeRequest.toDto());
    }

    @GetMapping("/theme/{id}")
    public ThemeDto findById(@PathVariable long id) {
        return themeDomainService.findById(id);
    }

    @GetMapping("/theme/recomend")
    public List<ThemeDto> recomend() {
        return null;
    }

    @DeleteMapping("/theme/{id}")
    public void delete(@PathVariable long id) {
        themeDomainService.deleteById(id);
    }

    @PutMapping("/theme")
    public void update(@RequestBody ThemeUpdateRequest themeUpdateRequest) {
        themeDomainService.update(themeUpdateRequest.requestToDto());
    }
}
