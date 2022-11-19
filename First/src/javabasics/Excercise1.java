package javabasics;

abstract class Shape {
	public String colors;
	public void setColor(String colors)
	{
		this.colors=colors;
	}
	public String getColor()
	{
		return colors;
	}
	public abstract double getParameter();
	public abstract double getArea();
}

class Rectangle extends Shape {
	int h,w;
	public Rectangle(int h,int w)
	{
		this.h=h;
		this.w=w;
	}
	public double getParameter() 
	{
		return 2*(h+w);
	}
	public double getArea() 
	{
		return h*w;
	}
}

class Circle extends Shape {
	int r;
	public Circle(int r)
	{
		this.r=r;
	}
	public double getParameter() 
	{
		return 2*3.14*r;
	}
	public double getArea() 
	{
		return 3.14*r*r;
	}
}

public class Excercise1 {
	public static void main(String args[])
	{
		Rectangle R=new Rectangle(3,4);
		Circle C=new Circle(3);
		System.out.println(R.getParameter());
		System.out.println(R.getArea());
		System.out.println(C.getParameter());
		System.out.println(C.getArea());
		String s1="Hello world";
		String s2="Hello ";
		s2=s2+"world";
		System.out.println(s1.equals(s2));
	}
}
