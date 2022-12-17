package javaPrograms;

public class RightTraingleReverse {

	public static void main(String[] args) {

		StringBuffer str1= new StringBuffer("selenium");

		//str1.append(str);

		System.out.println(str1.reverse());

		System.out.println("**************************************************");

		String str="name";
		for(int i=str.length()-1;i>=0;i--) {

			System.out.println(str.charAt(i)+" "+i);
		}
		System.out.println("-------------------------------------------");
		String dup="selennnjium";

		char[] c=dup.toCharArray();
		
//i=1-char.length,
		//print(i)
		

		for (int i = 0; i < c.length; i++) {


			for (int j =i+1; j < c.length; j++) {


				if (c[i]==c[j]) {

					System.out.println(c[j]+" "+j);
					break;
				}

			}

		}
	}

}
