package org.example;

public class CorrectFixedPasswordGenrator implements PasswordGenerator{
    @Override
    public String generatePassword() {
        return "abcdefgh";
    }
}
