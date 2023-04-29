package org.example;

public class PasswordValidate {

    private static final String WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE = "비밀번호는 최소 8자리이상 12자리 이하여야합니다.";

    public static void validate(String password) {
        int length = password.length();

        if(length < 8 || length > 12) {
            throw new IllegalArgumentException(WRONG_PASSWORD_LENGTH_EXCEPTION_MESSAGE);
        }
    }
}
