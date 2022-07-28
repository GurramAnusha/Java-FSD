package phase1.practiceproblems;
import java.util.*;
public class CustomExceptionEx extends Exception{
	CustomExceptionEx(String msg){
		super(msg);
	}
	
	static void checkSalary(int s)throws CustomExceptionEx{
		if(s<2100)
			throw new CustomExceptionEx("you need to work hard");
		if(s>2100 && s<5000)
			throw new CustomExceptionEx("your salary is somehow good");
		if(s>5100 && s<9000)
			throw new CustomExceptionEx("Your salary is very good");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your salary:");
		int sal=sc.nextInt();
		try{
			checkSalary(sal);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
