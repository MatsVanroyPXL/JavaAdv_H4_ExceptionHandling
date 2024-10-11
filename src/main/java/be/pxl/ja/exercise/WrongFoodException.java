package be.pxl.ja.exercise;

public class WrongFoodException extends RuntimeException { //uncecked exception

    public WrongFoodException(String message) {
        super(message);
    }
}
