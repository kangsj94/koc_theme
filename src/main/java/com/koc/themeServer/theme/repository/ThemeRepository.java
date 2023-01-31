package com.koc.themeServer.theme.repository;

import com.koc.themeServer.theme.entity.ThemeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ThemeRepository extends JpaRepository<ThemeEntity, Long> {
    Optional<ThemeEntity> findByThemeName(String themeName);


}
