package com.mvc.jee;

import org.springframework.stereotype.Service;

@Service
public class UserValidationService {
    public boolean isUserValid(String user,String password){
        return user.equals("shruti@123") && password.equals("1234");
    }
}
