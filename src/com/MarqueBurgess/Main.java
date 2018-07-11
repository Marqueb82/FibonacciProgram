package com.MarqueBurgess;

public class Main {

    public static void main(String[] args) {
	// Fibonacci count for 20 values
        int FibCount = 20;
        int[] FibNumbers = new int[FibCount];

        FibNumbers[0] = 0;  // set values for index
        FibNumbers[1] = 1;  // set value for index

        for(int i = 2; i < FibCount; i++){
            FibNumbers[i] = FibNumbers[i-1] + FibNumbers[i-2];  // for loop adds values to create Fibonacci series
        }

        for (int i = 0; i < FibCount; i++){
            System.out.print(FibNumbers[i] + " ");  // print out values in array
        }
    }
}
