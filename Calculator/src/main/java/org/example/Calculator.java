package org.example;

public class Calculator {
    public static int calculate(int operand1, String operand, int operand2) {
        if("+".equals(operand)) {
            return operand1 + operand2;
        } else if ("-".equals(operand)) {
            return operand1 - operand2;
        }
        return 0;
    }
}
