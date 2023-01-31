package com.koc.themeServer.theme.service;

import com.koc.themeServer.theme.dto.ThemeDto;
import com.koc.themeServer.theme.entity.ThemeEntity;
import com.koc.themeServer.theme.mapper.ThemeMapper;
import com.koc.themeServer.theme.repository.ThemeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ThemeService {
    private final ThemeRepository repository;
    private final ThemeMapper themeMapper;

    public void save(ThemeDto themeDto) {
        repository.save(themeMapper.dtoToEntity(themeDto));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void update(ThemeDto themeDto) {
        repository.save(themeMapper.dtoToEntity(themeDto));
    }

    public ThemeDto findById(long id) {
        return themeMapper.entityToDto(repository.findById(id).get());
    }

    public Optional<ThemeEntity> findbyName(String themeName) {
        return repository.findByThemeName(themeName);
    }
}
