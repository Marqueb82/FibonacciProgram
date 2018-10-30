
package com.MarqueBurgess;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

		
			Scanner userInput = new Scanner(System.in);
			int singleValue, cubed = 0;
			System.out.print("Enter test value:  ");
			int FibCount = userInput.nextInt();
      // Fibonacci count for n values
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
      
      
    
   
	
  
        
