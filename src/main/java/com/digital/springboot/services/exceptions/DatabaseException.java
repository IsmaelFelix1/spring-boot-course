package com.digital.springboot.services.exceptions;

public class DatabaseException extends  RuntimeException{
    private static final long serialVersion = 1L;

    public DatabaseException(String msg){
        super(msg);
    }
}
