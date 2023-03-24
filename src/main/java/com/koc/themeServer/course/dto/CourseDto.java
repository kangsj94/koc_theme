package com.koc.themeServer.course.dto;

import lombok.*;

@Builder
@ToString
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CourseDto {
    private long id;
    private String courseName;
    private String emoji;
}
