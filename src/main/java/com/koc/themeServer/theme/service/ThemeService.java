package com.koc.themeServer.theme.service;

import com.koc.themeServer.theme.dto.ThemeDto;
import com.koc.themeServer.theme.entity.ThemeEntity;
import com.koc.themeServer.theme.mapper.ThemeLikeMapper;
import com.koc.themeServer.theme.mapper.ThemeMapper;
import com.koc.themeServer.theme.repository.ThemeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ThemeService {
    private final ThemeRepository themeRepository;
    private final ThemeMapper themeMapper;

    private final ThemeLikeMapper themeLikeMapper;


    public void save(ThemeDto themeDto) {
        themeRepository.save(themeMapper.dtoToEntity(themeDto));
    }

    public void deleteById(Long id) {
        themeRepository.deleteById(id);
    }

    public void update(ThemeDto themeDto) {
        themeRepository.save(themeMapper.dtoToEntity(themeDto));
    }

    public ThemeDto findById(long id) {
        return themeMapper.entityToDto(themeRepository.findById(id).orElseThrow());
    }

    public List<ThemeDto> findAll() {
        return themeRepository.findAll().stream().map(themeMapper::entityToDto).toList();
    }

    public Optional<ThemeEntity> findbyName(String themeName) {
        return themeRepository.findByThemeName(themeName);
    }


}
