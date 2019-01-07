package com.mengze.codewars;

import java.math.BigInteger;

public class BooleanOrder {

    private String[] booleans;
    private String[] commands;

    public BooleanOrder(final String operands, final String operators) {
        booleans = operands.split("");
        commands = operators.split("");
    }

    public BigInteger solve() {
        // Your code here
        BigInteger count = BigInteger.ZERO;
        count.add(new BigInteger(new byte[]{1}));
        return count;
    }

    public String operate(String x, String y, String operator) {
        if ("&".equals(operator)) {
            if ("t".equals(x) && "t".equals(y)) {
                return "t";
            }
            return "f";
        }
        if ("|".equals(operator)) {
            if ("f".equals(x) && "f".equals(y)) {
                return "f";
            }
            return "t";
        }
        if ("^".equals(operator)) {
            return x.equals(y) ? "f" : "t";
        }
        return "f";
    }

    public static void main(String[] args) {
        System.out.println(new BooleanOrder("tft","^&").solve());
    }
}
