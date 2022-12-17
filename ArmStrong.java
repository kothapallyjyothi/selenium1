package javaPrograms;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
	
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		
		int orgNum = num, remain, res=0;
		while(orgNum!=0)
		{
			remain =orgNum%10;
			res +=Math.pow(remain, 3);
			orgNum /=10;
		}
		if(res==num)
			System.out.println("the given number is an armstrong "+num);
		else
			System.out.println("the given number is not an armstrong "+num);

		

	}

}
