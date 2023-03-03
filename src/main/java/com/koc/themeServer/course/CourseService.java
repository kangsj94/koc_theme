package com.koc.themeServer.course;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository repository;
    private final CourseMapper courseMapper;

    public void save(CourseDto courseDto) {
        repository.save(courseMapper.dtoToEntity(courseDto));
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public void update(CourseDto courseDto) {
        repository.save(courseMapper.dtoToEntity(courseDto));
    }

    public CourseDto findById(long id) {
        return courseMapper.entityToDto(repository.findById(id).get());
    }

    public Optional<CourseEntity> findbyName(String courseName) {
        return repository.findByCourseName(courseName);
    }

}
