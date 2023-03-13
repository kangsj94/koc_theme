package com.koc.themeServer.theme.controller;

import com.koc.themeServer.theme.domain.ThemeDomainService;
import com.koc.themeServer.theme.dto.ThemeDto;
import com.koc.themeServer.theme.request.ThemeSaveRequest;
import com.koc.themeServer.theme.request.ThemeUpdateRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ThemeController {
    private final ThemeDomainService themeDomainService;

    @PostMapping("/theme")
    public void save(@RequestBody ThemeSaveRequest themeSaveRequest) {
        themeDomainService.save(themeSaveRequest.requestToDto());
    }

    @GetMapping("/theme/health-check")
    public Long healthCheck(){
        return System.currentTimeMillis();
    }

    @PostMapping("/theme/like")
    public void likeTheme(){

    }

    @GetMapping("/theme/{id}")
    public ThemeDto findById(@PathVariable long id) {
        return themeDomainService.findById(id);
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
