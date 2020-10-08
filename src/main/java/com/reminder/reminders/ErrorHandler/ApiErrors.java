package com.reminder.reminders.ErrorHandler;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
@ResponseBody
public class ApiErrors {
    private int code;
    private String message;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Date time;
    private ApiErrors(int code, String message, Date time) {
        this.code = code;
        this.message = message;
        this.time = time;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }


    private ApiErrors() {
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public ApiErrors build() {
        return new ApiErrors(code,message,time);
    }
    public static  ApiErrors newBuilder(){
        return new ApiErrors();
    }
}




