package com.koc.themeServer.theme;

import com.koc.themeServer.theme.entity.ThemeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ThemeRepository extends JpaRepository<ThemeEntity, Long> {
}
