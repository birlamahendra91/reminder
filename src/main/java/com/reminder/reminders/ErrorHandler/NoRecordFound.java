package com.reminder.reminders.ErrorHandler;

public class NoRecordFound  extends RuntimeException{
    public NoRecordFound(String message) {
        super(message);
    }
}
