import java.util.Scanner;

//******************************************************************************************
//Fibonacci.java   Author: William Chirico      Section: 03
//
//Represents the first n integers of the Fibonacci series and prints them then prints the nth number selected by the user
//*****************************************************************************************

public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		long[] series = new long[30];

		// Create first 2 series elements
		series[0] = 0;
		series[1] = 1;
		
		// Fill the array with the Fibonacci numbers
		for (int i = 2; i < 30; i++)
		{
			series[i] = series[i-2] + series[i-1];
		}
		
		// Print the Fibonacci numbers
		System.out.println("The first 30 Fibonacci numbers are as follows:");
		
		for (int i = 0; i < 30; i++)
		{
			System.out.println(i + " : " + series[i]);
		}
		
		// Prompt the user for which number they wish to display
		System.out.println("Which of the Fibonacci numbers would you like to be displayed (1-30)");
		int num = scan.nextInt();
		
		// Input is in the correct format
		if (num >= 1 && num <= 30)
		{
			System.out.println(String.format("The %sth Fibonacci number is %s.", num, series[num - 1]));
		}
		
		// Input is not in the correct format
		else
		{
			System.out.println("The number that you have entered is not a valid number.  It must be between 1 and 30");
		}
	}
}
