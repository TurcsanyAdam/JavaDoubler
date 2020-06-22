package com.doubler;

import java.util.Arrays;

public class Main {
    public static int[] numbers = null;

    public static void main(String[] args) {
        doubleResult(2,numbers);
    }

    public static int doubleResult(int b, final int[] numbers) {
        if(numbers == null || numbers.length == 0){
            return b;
        }
        Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == b){
                b = b*2;
            }
        }
        return b;
    }
}

