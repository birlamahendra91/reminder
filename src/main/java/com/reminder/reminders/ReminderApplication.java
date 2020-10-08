package com.reminder.reminders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
//@EnableAutoConfiguration
//@ComponentScan
// OR
@SpringBootApplication
public class ReminderApplication {
	public static void main(String[] args) {
		SpringApplication.run(ReminderApplication.class, args);
	}

}
