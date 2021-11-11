package com.university.repository;

import com.university.entities.Course;
import com.university.entities.Person;
import com.university.entities.Teacher;

import java.util.List;

public class TeacherRepo extends InMemoryRepo<Teacher>{
    public TeacherRepo() {
        super();
    }

    /**
     * Updateaza obiectul de tip Teacher
     *
     * @param obj
     * @return noul obiect actualizat
     */
    @Override
    public Teacher update(Teacher obj) {
        Teacher teacherToUpdate = this.repoList.stream()
                .filter(teacher -> teacher.getFirstName() == obj.getFirstName())
                .findFirst()
                .orElseThrow();

        teacherToUpdate.setLastName(obj.getLastName());
        teacherToUpdate.setCourses(obj.getCourses());
        return teacherToUpdate;
    }
}
