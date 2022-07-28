package phase1.practiceproblems;

public class AreaOfRectangleMethodCreation {
	int rectanglearea(int a, int b){
		return a*b;
	}
	
	public static void main(String[] args){
		AreaOfRectangleMethodCreation in=new AreaOfRectangleMethodCreation();
		int area=in.rectanglearea(7, 7);
		System.out.println("Area of rectangle is:"+area);
		
	}

}
