package com.koc.themeServer.course.controller;

import com.koc.themeServer.course.dto.CourseDto;
import com.koc.themeServer.course.request.CourseSaveRequest;
import com.koc.themeServer.course.request.CourseUpdateRequest;
import com.koc.themeServer.course.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;

    @PostMapping("/course")
    public void save(@RequestBody CourseSaveRequest courseSaveRequest) {
        courseService.save(courseSaveRequest.requestToDto());
    }

    @GetMapping("/course/health-check")
    public Long healthCheck() {
        return System.currentTimeMillis();
    }

    @GetMapping("/course/{id}")
    public CourseDto findById(@PathVariable long id) {
        return courseService.findById(id);
    }

    @DeleteMapping("/course/{id}")
    public void delete(@PathVariable long id) {
        courseService.deleteById(id);
    }

    @PutMapping("/course")
    public void update(@RequestBody CourseUpdateRequest courseUpdateRequest) {
        courseService.update(courseUpdateRequest.requestToDto());
    }
}
