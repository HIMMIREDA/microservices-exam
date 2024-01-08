package com.ensa.school;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/schools")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void save(
            @RequestBody Course course
    ) {
        service.saveCourse(course);
    }

    @GetMapping
    public ResponseEntity<List<Course>> findAllCourses() {
        return ResponseEntity.ok(service.findAllCourses());
    }

    @GetMapping("/with-students/{courseId}")
    public ResponseEntity<FullCourseResponse> findAllSchools(
            @PathVariable("courseId") String courseId
    ) {
        return ResponseEntity.ok(service.findCoursesWithStudents(courseId));
    }
}
