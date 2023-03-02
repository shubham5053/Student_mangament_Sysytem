 package com.cafe.excepction;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND )
public class excepction extends RuntimeException {
    private static final long serialVersionUID =1l;
    
    public excepction(String message) {
    	super(message);
    }
}
