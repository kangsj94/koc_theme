package com.koc.themeServer.course;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CourseRepository extends JpaRepository<CourseEntity, Long> {
    Optional<CourseEntity> findByCourseName(String CourseName);
}
