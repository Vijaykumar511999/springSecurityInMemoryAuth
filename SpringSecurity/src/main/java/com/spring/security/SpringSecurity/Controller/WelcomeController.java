package com.spring.security.SpringSecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String getMsg(){
        String msg="welcome to the spring security..";
        return msg;
    }

    @GetMapping("/balance")
    public String getBalance(){
        String msg = "Your balance is 222.. PLease note.";
        return msg;
    }

    @GetMapping("/statement")
    public String getStstement(){
        String msg = "Your statement is downloaded please check..";
        return msg;
    }

    @GetMapping("/myloan")
    public String myLoan(){
        String msg = "My loans are Bike Loan and Home Loan and Personal Loan..";
        return msg;
    }

    @GetMapping("/contact")
    public String getContact(){
        String msg = "Thanks for using our Application we will get back back to you please wait.. ";
        return msg;
    }
}

