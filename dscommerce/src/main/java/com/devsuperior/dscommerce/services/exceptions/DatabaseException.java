package com.devsuperior.dscommerce.services.exceptions;

import org.springframework.validation.Errors;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String msg){
        super(msg);
    }

}
