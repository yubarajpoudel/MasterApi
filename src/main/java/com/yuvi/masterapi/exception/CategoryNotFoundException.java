package com.yuvi.masterapi.exception;

public class CategoryNotFoundException extends RuntimeException{
    public CategoryNotFoundException(int id) {
        super(String.format("Category with id %d not found", id));
    }
}
