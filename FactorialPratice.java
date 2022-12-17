package javaPrograms;

import java.util.Scanner;

public class FactorialPratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the factorial number");
		Scanner sc= new Scanner(System.in);
		int num =sc.nextInt();
		
		int fact= 1;
		//here we can increment after all expressions are independent
		//loop execute the 
		for (int i=1;i<=num;++i)
		{
			fact=fact*i;
		}
		System.out.println("factorial of " +num+ " is " +fact);

	}

}
