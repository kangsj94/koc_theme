package com.koc.themeServer.course;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseUpdateRequest {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("courseName")
    private String courseName;
    @JsonProperty("emoji")
    private String emoji;

    public CourseDto requestToDto() {
        return CourseDto.builder()
                .id(this.id)
                .courseName(this.courseName)
                .emoji(this.emoji)
                .build();
    }
}
