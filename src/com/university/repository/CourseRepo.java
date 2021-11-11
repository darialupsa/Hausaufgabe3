package com.university.repository;

import com.university.entities.Course;
import com.university.entities.Person;

import java.util.List;

public class CourseRepo extends InMemoryRepo<Course>{
    public CourseRepo() {
        super();
    }

    @Override
    public Course update(Course obj) {
        Course courseToUpdate = this.repoList.stream()
                .filter(course -> course.getName() == obj.getName())
                .findFirst()
                .orElseThrow();

        courseToUpdate.setTeacher(obj.getTeacher());
        courseToUpdate.setCredits(obj.getCredits());
        courseToUpdate.setMaxEnrollment(obj.getMaxEnrollment());
        courseToUpdate.setStudentsEnrolled(obj.getStudentsEnrolled());
        return courseToUpdate;
    }
}
