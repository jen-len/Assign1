/* Jennifer Lennick 
 * 0627839
 * Program: Fibonacci Program
 * User will enter a number an the program will 
 * print the series up until the user entered value.
 * 
 */
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		int userInput = 0; 
		int fibSeries = 0; 
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		long timeElapsed = endTime- startTime;
		
			// Welcome the user
			System.out.println("Welcome to the Fibonacci Sequence Program");
			
			//acquire userInput
			System.out.println("Please Enter a number less than 50 =>");
			userInput = reader.nextInt();
			reader.close();
			System.out.println("UserInput=>" + userInput);
			
			//loops start at 0
			
			for(int i = 0; i < userInput;i++ ) {
				fibSeries = fiboSeriesRec(i);
				System.out.print(fibSeries+" ");
			}
			 System.out.println("\n\nElapsed time in nanoseconds is: " + timeElapsed);	
			 
			
	}
		// fiboSeriesRec a recursive function that calls itself
		
		public static int fiboSeriesRec(int x){
			
			if (x == 0) 
				return 0;
			else if (x == 1)
				return 1;
			else
				return (fiboSeriesRec(x - 1) + fiboSeriesRec(x - 2)); 
			
			
		}
		
		//fiboSeriesIte: iterative function that uses a for loop
		public static int fiboSeriesIte(int x){
			int fib1 = 0;
			for (int i = 0; i < x; i++) {
				
			}
			
		}

}
		
		

