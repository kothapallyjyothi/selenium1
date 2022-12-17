package javaPrograms;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {

		System.out.println("enter the no of rows");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("The pyramid pattern :");

		//outer loop for rows
		for (int i=1;i<n;i++)
		{
			//inner loop for space
			for(int j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
//				System.out.println(" "+j);
			}
			System.out.println();
		}
	}

}
