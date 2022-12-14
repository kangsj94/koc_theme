package com.koc.themeServer.theme.entity;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ThemeController {
    private final ThemeService temaService;

    @PostMapping("/tema")
    public void save(@RequestBody ThemeDto themeDto) {
        temaService.save(themeDto);
    }

    @GetMapping("/tema/{id}")
    public ThemeDto findById(@PathVariable long id) {
        return temaService.findById(id);
    }
}
