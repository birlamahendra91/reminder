package com.reminder.reminders.contoller;

import com.reminder.reminders.ErrorHandler.NoRecordFound;
import com.reminder.reminders.model.Person;
import com.reminder.reminders.model.SampleReponse;
import com.reminder.reminders.model.SuccessResponse;
import com.reminder.reminders.services.PersonServices;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SampleController {

@Autowired
PersonServices services;
@GetMapping("/ping")
    public String hello(){
    return SampleReponse.response();
}
@GetMapping("/hi")
    public ResponseEntity<SuccessResponse> helloEntity(){
        return ResponseEntity.accepted().body(new SuccessResponse("Hello"));
    }

    @GetMapping("/all")
    public ResponseEntity<SuccessResponse> getAllPersons(){
        return ResponseEntity.accepted().body(new SuccessResponse(services.response()));
    }
    @PostMapping("/update")
    public ResponseEntity<SuccessResponse> updatePersons(@RequestBody Person person){
        services.create(person);
        return ResponseEntity.accepted().body(new SuccessResponse("Done!!!!!!!!"));
    }
    @GetMapping("/getById/{person_id}")
    public ResponseEntity<SuccessResponse> getPersonById(@NonNull  @PathVariable long person_id){
        return ResponseEntity.accepted().body(new SuccessResponse( services.getById(person_id)));
    }
    @GetMapping("/remove/{person_id}")
    public ResponseEntity<SuccessResponse> deletePerson(@NonNull @PathVariable long person_id){
        services.deleteById(person_id);
        return ResponseEntity.accepted().body(new SuccessResponse("Done!!!!!!!!"));
    }
}
