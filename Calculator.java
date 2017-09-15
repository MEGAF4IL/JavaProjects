/*
	This program acts as a calculator
*/

public class Calculator
{
	public static void main(String [] args)
	{
		EasyScanner scanner = new EasyScanner();
		
		//Declare & Initialize variables.
		char	asmd = 'x';
		char	loop = 'x';		
		
		//Intro part 1/2
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("This is a calculator program. ");
		
		//Begin loop.
		do{
			
			//Declare & initialize the rest of the variables.
			double 	input = 0.00;
			double	input2 = 0.00;
			double	answer = 0.00;
			loop = 'x';
			
			//Intro part 2/2
			System.out.println("Choose which process you would like to do. ");
			System.out.println("A = Add, S = Subtract, M = Multiply, D = Divide ");
			asmd = scanner.nextChar();
			System.out.println(" ");
			
			//Ask for numbers to calculate.
			System.out.println("Enter the first number you want to calculate. ");
			input = scanner.nextDouble();
			
			System.out.println(" ");
			System.out.println("Enter the second number you want to calculate. ");
			input2 = scanner.nextDouble();
	
	
			//Begin calculations.
			if(asmd == 'A' || asmd == 'a')
			{
				answer = input + input2;
				
				System.out.println(" ");
				System.out.println("The answer is: " + answer);
			}
		
			else if(asmd == 'S' || asmd == 's')
			{
				answer = input - input2;
				
				System.out.println(" ");
				System.out.println("The answer is: " + answer);
			}
			
			else if(asmd == 'M' || asmd == 'm')
			{
				answer = input * input2;
				
				System.out.println(" ");
				System.out.println("The answer is: " + answer);
			}
			
			else if(asmd == 'D' || asmd == 'd')
			{
				answer = input / input2;
				
				System.out.println(" ");
				System.out.println("The answer is: " + answer);
			}
			
			
			System.out.println(" ");
			System.out.println("Would you like to go again?");
			System.out.println("Y = Yes, N = No ");
			loop = scanner.nextChar();
			
		}
		while(loop == 'Y' || loop == 'y');
		
		
		
		System.out.println(" ");
		System.out.println("Program terminated successfully. ");
		System.out.println(" ");
		System.exit(0);
	}
}