package javaPrograms;


abstract class shape
{
	abstract void area();
	public void show() {
		System.out.println("show method");

	}	
}

class Rectangle extends shape
{
	int l, b;
	Rectangle(int l,int  b){
		this.l=l;
		this.b=b;
		System.out.println(" ");
		
	}
	@Override
	void area() {
		System.out.println("area of rectangle:"+(l*b));
	}
	
}
public class AbstractPratice {
	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle(10,20);
		r.area();
		
//		TriangleAbstract rw= new TriangleAbstract(20,10);
	
	}
}