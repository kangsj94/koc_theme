package com.koc.themeServer.theme.repository;

import com.koc.themeServer.theme.entity.ThemeLikeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ThemeLikeRepository extends JpaRepository<ThemeLikeEntity, Long> {
    Optional<ThemeLikeEntity> findByUserIdAndThemeId(Long userId, Long themeId);

}
