package javaPrograms;

import java.util.ArrayList;
import java.util.Collections;

class Mobile
{
	String model;
	int price;
	int year;
	Mobile(String model,int price,int year)
	{
	this.model=model;
	this.price=price;
	this.year=year;
	
	}
}
public class LambdaSortFilter {

	public static void main(String[] args) 
	{
	ArrayList<Mobile> al =new ArrayList<Mobile>();
	al.add(new Mobile("iphone",2000010,2022));
	al.add(new Mobile("mi",20000,2021));
	al.add(new Mobile("POCO",18000,2021));
	al.add(new Mobile("RealME",25000,2020));
	al.add(new Mobile("Vivo",30000,2021));
	al.add(new Mobile("Oppo",19000,2021));
	al.add(new Mobile("Samsung",25400,2022));
	al.add(new Mobile("Pixel",24710,2022));
	al.add(new Mobile("oneplus ",40000,2022));
	al.add(new Mobile("Note ",14500,2021));
	al.add(new Mobile("CoolPad ",14510,2020));

	System.out.println("********* Before sort **********");
	al.forEach( l->System.out.println(l.year+" "+l.model+" "+l.price));
	Collections.sort(al, (m1,m2)->{
		return m1.model.compareTo(m2.model);
		
	});
	System.out.println("****************After Sorting****************");
	al.forEach(l->System.out.println(l.model+" "+l.price+" "+l.year));
	
	//	al.forEach(l -> System.out.println(l.model+" "+l.price+" "+l.year));
	
	//task movie name and release year in collections 
	//print 2022
	//task mobile -->name ,price ,year 10 minimum-->sort mobile data 
	//task store your name in string print repeat characters name
	//s= "Jyothi Kothapally"
		
	}
}
