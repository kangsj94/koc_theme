package com.koc.themeServer.course.repository;

import com.koc.themeServer.course.entity.CourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
    Optional<CourseEntity> findByCourseName(String CourseName);
}
