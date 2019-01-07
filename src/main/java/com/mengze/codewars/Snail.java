package com.mengze.codewars;

import java.util.Arrays;

public class Snail {

    public static int[] snail(int[][] array) {
        if (array.length == 0 || (array.length > 0 && array[0].length == 0))
            return new int[0];
        int level = 0;
        int vertical = 0;
        int left = 0;
        int right = array.length - 1;
        int top = 0;
        int bottom = array.length - 1;
        int direction = 0;
        int[] result = new int[array.length * array.length];
        for (int i=0; i<result.length; i++) {
            result[i] = array[level][vertical];
            if (direction == 0) {//向右
                if (vertical == right) {
                    direction = 1;
                    top++;
                    level++;
                    continue;
                }
                vertical++;
            }
            if (direction == 1) {//向下
                if (level == bottom) {
                    direction = 2;
                    right--;
                    vertical--;
                    continue;
                }
                level++;
            }
            if (direction == 2) {//向左
                if (vertical == left) {
                    direction = 3;
                    bottom--;
                    level--;
                    continue;
                }
                vertical--;
            }
            if (direction == 3) {//向上
                if (level == top) {
                    direction = 0;
                    left++;
                    vertical++;
                    continue;
                }
                level--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[][] array = {{1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}};
        int[][] array = new int[0][1];
        Arrays.stream(snail(array)).forEach(System.out::println);
    }
}
