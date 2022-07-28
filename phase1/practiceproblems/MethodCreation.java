package phase1.practiceproblems;

public class MethodCreation {
	int value=100;
	int operation(int v){
		value=v*5;
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodCreation m=new MethodCreation();
		System.out.println("The value variable before calling the method is:"+m.value);
		int v=m.operation(6);
		System.out.println("The value variable after calling method through call by value is:"+v);
	}

}
