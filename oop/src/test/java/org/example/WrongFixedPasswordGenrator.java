package org.example;

public class WrongFixedPasswordGenrator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "ab";
    }
}
