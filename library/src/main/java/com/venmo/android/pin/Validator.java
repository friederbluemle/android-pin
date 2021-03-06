package com.venmo.android.pin;

/**
 * Interface for clients to notify whether or not a String matches an expected output
 */
public interface Validator {
    public boolean isValid(String input);
}