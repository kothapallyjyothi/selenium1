package javaPrograms;

import java.util.Scanner;

public class RightReversePratice {

	//program for rightreverse
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n ;
		System.out.println("input the no of rows");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		//outer loop work for rows
		for(int i=0;i<n;i++)
		{
			//inner loop work for space
			for(int j=2*(n-i);j>=0;j--)
			{
				//print space btw two numbers
				System.out.print(" ");
			}
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
		
		
	}
		

}
