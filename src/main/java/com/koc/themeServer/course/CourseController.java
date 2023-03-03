package com.koc.themeServer.course;

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
