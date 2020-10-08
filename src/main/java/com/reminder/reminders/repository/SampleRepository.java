package com.reminder.reminders.repository;

import com.reminder.reminders.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SampleRepository extends JpaRepository<Person, Integer> {
    List<Person> findAll();
    Person  saveAndFlush(Person person);
    Person findById(long id);
    Integer deleteById(long id);
    void delete(Person id);

}
