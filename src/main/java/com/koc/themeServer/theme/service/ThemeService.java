package com.koc.themeServer.theme.service;

import com.koc.themeServer.theme.dto.ThemeDto;
import com.koc.themeServer.theme.dto.ThemeLikeDto;
import com.koc.themeServer.theme.entity.ThemeEntity;
import com.koc.themeServer.theme.entity.ThemeLikeEntity;
import com.koc.themeServer.theme.mapper.ThemeLikeMapper;
import com.koc.themeServer.theme.mapper.ThemeMapper;
import com.koc.themeServer.theme.repository.ThemeLikeRepository;
import com.koc.themeServer.theme.repository.ThemeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ThemeService {
    private final ThemeRepository themeRepository;

    private final ThemeLikeRepository themeLikeRepository;
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
        return themeMapper.entityToDto(themeRepository.findById(id).get());
    }

    public Optional<ThemeEntity> findbyName(String themeName) {
        return themeRepository.findByThemeName(themeName);
    }

    public ThemeLikeEntity like(ThemeLikeDto dto){
        ThemeLikeEntity themeLike =themeLikeRepository.findByUserIdAndThemeId(dto.getUserId(),dto.getThemeId())
                .map(ThemeLikeEntity::switchLike)
                .orElse(themeLikeMapper.dtoToEntity(dto));

        return themeLikeRepository.save(themeLike);
    }
}
