/* Jennifer Lennick 
 * 0627839
 * Program: Fibonacci Program
 * User will enter a number an the program will 
 * print the series up until the user entered value.
 * 
 */
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		int userInput = 0; 
		int fibSeries = 0; 
		
		
			// Welcome the user
			System.out.println("Welcome to the Fibonacci Sequence Program");
			
			//acquire userInput
			System.out.println("Please Enter a number less than 50 =>");
			userInput = reader.nextInt();
			reader.close();
			System.out.println("UserInput:" + userInput);
			
			//loops start at 0
			userInput-= 1;
			
			do {
				fibSeries = fiboSeriesRec(userInput);
				System.out.println(fibSeries);
				userInput--;
				
			}while(userInput!=-1);
			
			
	}
		// fiboSeriesRec a recursive function
		
		public static int fiboSeriesRec(int x){
			
			if (x == 0) 
				return 0;
			else if (x == 1)
				return 1;
			else
				return (fiboSeriesRec(x - 1) + fiboSeriesRec(x - 2)); 
			
			
		}
}
		//fiboSeriesIte
		
