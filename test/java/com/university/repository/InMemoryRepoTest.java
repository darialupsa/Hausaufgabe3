package com.university.repository;

import com.university.entities.Course;
import com.university.entities.Teacher;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryRepoTest {
    private final TeacherRepo teacherRepo = new TeacherRepo();
    private final List<Course> courseList = new ArrayList<>();
    private final Teacher teacher = new Teacher("Mada", "Dicu", courseList);

    @Test
    void create() {
        assertEquals(teacher, teacherRepo.create(teacher));
    }

    @Test
    void getAll() {
        teacherRepo.create(teacher);
        assertEquals(1, teacherRepo.getAll().size());
    }

    @Test
    void delete() {
        teacherRepo.create(teacher);
        assertEquals(1, teacherRepo.getAll().size());
        teacherRepo.delete(teacher);
        assertEquals(0, teacherRepo.getAll().size());
    }
}