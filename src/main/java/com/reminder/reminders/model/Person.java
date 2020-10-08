package com.reminder.reminders.model;

import jdk.nashorn.internal.ir.annotations.Immutable;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Immutable
public class Person {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;



}
