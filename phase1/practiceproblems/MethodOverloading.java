package phase1.practiceproblems;

public class MethodOverloading {
	
	public int calculate(int a,int b){
		return a+b;
	}
	public int calculate(float r){
		return (int)(3.14*r*r);
	}
	public int calculate(int b1,int h){
		return b1*h;
	}
	public int calulate(int r1){
		return r1*r1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading m=new MethodOverloading();
		System.out.println(m.calculate(3,4));
		System.out.println(m.calculate(45.2f));
		System.out.println(m.calculate(5,4));
		System.out.println(m.calculate(4));
		
	}

}
