package com.university.repository;

import com.university.entities.Course;
import com.university.entities.Student;
import com.university.entities.Teacher;

import java.util.List;

public class RegistrationSystem {
    private final TeacherRepo teacherRepository;
    private final StudentRepo studentRepository;
    private final CourseRepo courseRepository;

    public RegistrationSystem() {
        this.teacherRepository = new TeacherRepo();
        this.studentRepository = new StudentRepo();
        this.courseRepository = new CourseRepo();
    }

    public StudentRepo getStudentRepository() {
        return studentRepository;
    }

    public TeacherRepo getTeacherRepository() {
        return teacherRepository;
    }

    public CourseRepo getCourseRepository() {
        return courseRepository;
    }

    /**
     *
     * @return toate elementele din CourseRepository
     */
    public List<Course> getAllCourses() {
        return courseRepository.getAll();
    }

    /**
     *
     * @return toate elementele din TeacherRepository
     */
    public List<Teacher> getAllTeachers() {
        return teacherRepository.getAll();
    }

    /**
     *
     * @return toate elementele din StudentRepository
     */
    public List<Student> getAllStudents() {
        return studentRepository.getAll();
    }

    /**
     * Inscrie un student la un curs
     *
     * @param course {@code course} to which the registration is made
     * @param student {@code student} for which the registration is made
     * @return TRUE daca studentul a fost inscris la curs
     */
    public boolean register(Course course, Student student) {
        return true;
    }

    /**
     *
     * @return o lista cu toate cursurile unde mai sunt locuri libere
     */
    public List<Course> retrieveCoursesWithFreePlaces() {
        return null;
    }

    /**
     * Retrieve the students enrolled in a course
     *
     * @param course {@code course} in care sunt inscrisi studentii
     */
    public void retrieveStudentsEnrolledForACourse(Course course) {
    }

}
