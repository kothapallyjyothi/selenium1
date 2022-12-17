package javaPrograms;

import java.util.Scanner;

public class Forloop {

	public static void main(String[] args) {
		
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		//right triangle 
		
		for (int i = 1; i <=n; i++) {            //1----i
			                                      // 1<1==j
			//
			for (int j = 1; j <=i; j++) {
				
				System.out.print(" "+j);
			}
			//next line
			System.out.println( );
			
		}

	}

}
