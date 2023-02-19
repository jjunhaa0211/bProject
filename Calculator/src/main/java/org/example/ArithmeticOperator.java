package org.example;

import java.util.Arrays;

public enum ArithmeticOperator {
    ADDIRION("+") {
        @Override
        public int arithemticCalculate(int operand1, int operand2) {
            return operand1 + operand2;
        }
    }, SUBTRACTION("-") {
        @Override
        public int arithemticCalculate(int operand1, int operand2) {
            return operand1 - operand2;
        }
    }, MULTIPLICATION("*") {
        @Override
        public int arithemticCalculate(int operand1, int operand2) {
            return operand1 * operand2;
        }
    }, DIVISION("/") {
        @Override
        public int arithemticCalculate(int operand1, int operand2) {
            return operand1 / operand2;
        }
    };

    private final String operator;

    ArithmeticOperator(String operator) {
        this.operator = operator;
    }

    public abstract int arithemticCalculate(final int operand1, final int operand2);

    public static int calculate(int operand1, String operand, int operand2) {
        ArithmeticOperator arithmeticOperator = Arrays.stream(values())
                .filter(v -> v.operator.equals(operand))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바르지 않은 사칙연산입니다"));

        return arithmeticOperator.arithemticCalculate(operand1, operand2);
    }
}
