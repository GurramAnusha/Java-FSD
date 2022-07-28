package phase1.practiceproblems;
import java.io.*;
import java.util.*;
public class CheckedExceptionEx {
	
	int display(int l,int b)throws IOException{
		if(l>b)
			throw new IOException("Length is greater than breadth");
		else{
			return (l*b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth values:");
		int length=sc.nextInt();
		int breadth=sc.nextInt();
		CheckedExceptionEx c=new CheckedExceptionEx();
		try{
		int area=c.display(length, breadth);
		System.out.println("Area of rectangle is:"+area);
		}
		catch(Exception e){
			System.out.println("Exception Handled");
			System.out.println(e.getMessage());
		}

	}

}
