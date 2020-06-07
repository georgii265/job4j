package ru.job4j.ex;

/**
 * ru.job4j.ex.ElementAbuseException - оно будет возникать, когда найденное слово попадает в запрещенный список.
 */
public class ElementAbuseException extends ElementNotFoundException {
    public ElementAbuseException (String message) {
        super(message);
    }
}

