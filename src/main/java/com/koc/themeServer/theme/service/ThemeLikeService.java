package com.koc.themeServer.theme.service;

import com.koc.themeServer.theme.dto.ThemeLikeDto;
import com.koc.themeServer.theme.mapper.ThemeLikeMapper;
import com.koc.themeServer.theme.repository.ThemeLikeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class ThemeLikeService {
    private final ThemeLikeRepository themeLikeRepository;
    private final ThemeLikeMapper themeLikeMapper;

    public Optional<ThemeLikeDto> findByUserIdAndThemeId(Long userId, Long themeId) {
        // return Optional.of(themeLikeMapper.entityToDto(themeLikeRepository.findByUserIdAndThemeId(userId, themeId).orElseThrow(RuntimeException::new)));
        return null;
    }

    public ThemeLikeDto save(ThemeLikeDto dto) {
        return themeLikeMapper.entityToDto(themeLikeRepository.save(themeLikeMapper.dtoToEntity(dto)));
    }
}
