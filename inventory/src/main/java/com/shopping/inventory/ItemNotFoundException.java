package com.shopping.inventory;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ItemNotFoundException extends Exception{
    public ItemNotFoundException(Long id){
        super(String.format("No item found: %s", id));
    }
}
