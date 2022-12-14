package com.koc.themeServer.theme.entity;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ThemeService {
    private final ThemeRepository repository;
    private final ThemeMapper themeMapper;

    public void save(ThemeDto themeDto) {
        System.out.println(themeDto.toString());
        repository.save(themeMapper.dtoToEntity(themeDto));
    }

    public ThemeDto findById(long id) {
        return themeMapper.entityToDto(repository.findById(id).get());
    }
}
