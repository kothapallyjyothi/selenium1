package javaPrograms;

import java.util.ArrayList;

public class LambaForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("d");
		for(String s:al)
		{
			System.out.println(s);
		}
	}

}
