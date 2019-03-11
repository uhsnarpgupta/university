package com.example.university.repo;

import com.example.university.domain.Course;

import java.util.List;

// Restricted Repository that can only read courses
public interface CourseQueryRepository extends ReadOnlyRepository<Course, Integer> {
    //Put query methods here
    Course findByName(String name);

    List<Course> findByDepartmentChairMemberLastName(String chair);
}
