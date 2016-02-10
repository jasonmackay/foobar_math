package foobar_math;

import java.util.Scanner;

public class FoobarMath {
	
	
	public String divisible (int num){
		
		if (num % 15 == 0)
			return "foobar";
		else if (num % 5 == 0)
			return "bar";
		else if (num % 3 == 0)
			return "foo";
		else
			return "none";
	}

	public static void main(String[] args) {
		
		int number = 0;
		FoobarMath calc = new FoobarMath();
		Scanner input = new Scanner(System.in);
		
		while (number != -999){
			System.out.println("Please enter a number (-999 to exit): ");
			
			if (input.hasNextInt()){
				number = input.nextInt();
				if (calc.divisible(number).equals("none"))
					System.out.println(number);
				else
					System.out.println(calc.divisible(number));
			}
			else // preferred this over try/catch of InputMismatchException
			{
				System.out.println("Please enter digits only. Try again.");
				input.nextLine();
			}
			
		}
		System.out.println("Exit");
		input.close();	
	}
}
