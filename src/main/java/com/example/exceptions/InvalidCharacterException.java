package com.example.exceptions;

import java.lang.reflect.Executable;

public class InvalidCharacterException extends Exception {

    public InvalidCharacterException(){
        super("Character does not Exist");
    }
}
