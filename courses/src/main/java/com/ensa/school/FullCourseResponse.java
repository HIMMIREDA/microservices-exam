package com.ensa.school;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullCourseResponse {

    private String name;
    private String email;
    List<Student> students;
}
