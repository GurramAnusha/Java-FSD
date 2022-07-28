package phase1.practiceproblems;
import java.util.*;
//throw alone can be used for unchecked exception
public class ThrowClauseEx {
	static int add(int num1,int num2){
		if(num1>900){
			throw new ArithmeticException("Num1 is greater than 900 and hence exception is thrown");
		}
		else{
			System.out.println("Both parameters are correct");
		}
		return num1+num2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		try{
			result=add(num1,num2);
		}
		catch(ArithmeticException ae){
			System.out.println(ae.getMessage());
		}
		System.out.println("Result is:"+result);
	}

}
