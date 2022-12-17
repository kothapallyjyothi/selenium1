package javaPrograms;

public class TriangleAbstract extends shape {

	int l ,b; 
	TriangleAbstract(int l,int b)
	{
		this.l=l;
		this.b=b;
	}
	@Override
	void area() {
		System.out.println("the area of triangle");

	}
	
	

}