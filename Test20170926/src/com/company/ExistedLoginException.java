package com.company;

public class ExistedLoginException extends Exception {
    @Override
    public String getMessage() {
       return  "Login already exist";
    }


}
