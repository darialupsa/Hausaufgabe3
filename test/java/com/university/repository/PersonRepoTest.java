package com.university.repository;

import com.university.entities.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonRepoTest {
    @Test
    void update(){
        Person person1 = new Person("Daria", "Lupsa");
        Person person2 = new Person("Daria", "Marginean");

        PersonRepo personRepository = new PersonRepo();

        personRepository.create(person1);
        personRepository.update(person2);

        assertEquals(person1.getFirstName(), person2.getFirstName());
        assertEquals(person1.getLastName(), person2.getLastName());
    }

}