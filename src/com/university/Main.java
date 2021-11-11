package com.university;

import com.university.entities.Course;
import com.university.entities.Person;
import com.university.entities.Student;
import com.university.entities.Teacher;
import com.university.repository.CourseRepo;
import com.university.repository.RegistrationSystem;
import com.university.repository.StudentRepo;
import com.university.repository.TeacherRepo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Course> listOfCourses = new ArrayList<>();
        List<Course> teacherList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();
        Student student = new Student("Daria", "Lupsa", 12, 29, listOfCourses);
        Teacher teacher = new Teacher("Dorel", "Pop", teacherList);
        Course course = new Course("ASC", teacher, 45, studentList, 5);

        TeacherRepo teacherRepo = new TeacherRepo();
        StudentRepo studentRepo = new StudentRepo();
        CourseRepo courseRepo = new CourseRepo();

        RegistrationSystem registrationSystem = new RegistrationSystem();
        registrationSystem.getStudentRepository().create(student);
        registrationSystem.getTeacherRepository().create(teacher);
        registrationSystem.getCourseRepository().create(course);

        System.out.println("Students: ");
        for(Student s : registrationSystem.getStudentRepository().getAll())
            System.out.println(s);
    }
}
