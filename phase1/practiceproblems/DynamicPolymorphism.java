package phase1.practiceproblems;

class Shape{
	public void area(int a,int b){
		System.out.println("In shape class");
	}
}

class Rectangle extends Shape{
	public void area(int l,int b)
	{
	System.out.println("The area of the rectangle is: "+(l*b));	
	}
}

class Triangle extends Shape{
	public void area(int b,int h)
	{
	System.out.println("The area of the triangle is: "+(b*h)/2);	
	}
}

class Square extends Shape{
	public void area(int s,int s1)
	{
	System.out.println("The area of the square is: "+(s*s));	
	}
}

class Rhombus extends Shape{
	public void area(int d1,int d2)
	{
	System.out.println("The area of the rhombus is: "+(d1*d2)/2);	
	}
}


public class DynamicPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s;
		s=new Rectangle();
		s.area(4,5);
		s=new Triangle();
		s.area(4,5);
		s=new Square();
		s.area(4,4);
		s=new Rhombus();
		s.area(4,5);

	}

}
