package com.koc.themeServer.course.entity;

import com.koc.themeServer.course.dto.CourseDto;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {
    public CourseDto entityToDto(CourseEntity courseEntity) {
        return CourseDto.builder()
                .id(courseEntity.getId())
                .courseName(courseEntity.getCourseName())
                .emoji(courseEntity.getEmoji())
                .build();
    }

    public CourseEntity dtoToEntity(CourseDto courseDto) {
        return CourseEntity.builder()
                .id(courseDto.getId())
                .courseName(courseDto.getCourseName())
                .emoji(courseDto.getEmoji())
                .build();
    }
}
