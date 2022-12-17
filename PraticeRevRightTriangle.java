package javaPrograms;

import java.util.Scanner;

public class PraticeRevRightTriangle {

	public static void main(String[] args) {
		
		System.out.println("enter the  number of rows required");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		//inner loop
		for (int i=n;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print(" "+j);
			}
			System.out.println();
			
		}
		
		
		
		
	}
	
	

}
