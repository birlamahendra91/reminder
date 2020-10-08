package com.reminder.reminders.services;


import com.reminder.reminders.ErrorHandler.NoRecordFound;
import com.reminder.reminders.model.Person;
import com.reminder.reminders.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class PersonServices {
    @Autowired
    SampleRepository repository;

    public Object response(){
        return repository.findAll()
                .stream().collect(Collectors.toList());
    }
    @Transactional
    public void create(Person person){
       try {
           repository.saveAndFlush(person);
       }
       catch(Exception ex) {
           throw ex;
       }
    }
    public Person getById(long personId){
        try {
            return repository.findById(personId);
        }
        catch(Exception ex) {
            throw ex;
        }
    }
    @Transactional
    public void deleteById(long personId){
        try {
            Optional.ofNullable(repository.findById(personId)).orElseThrow(() -> new NoRecordFound("NO Data Exist"));
            repository.deleteById(personId);
        }
        catch(Exception ex) {
            throw ex;
        }
    }
}
