package com.ar.exception;

class InvalidAgeException extends Exception{
    //Parameterized construco
    public InvalidAgeException(String message) {
       super(message);
    }
}
public class AgeValidator {

    public static void validate (int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Age must be 18 or older...");
        } else {
            System.out.println("Age is above 18....");
        }
    }
    public static void main(String[] args) {
        try {
            validate(05);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
