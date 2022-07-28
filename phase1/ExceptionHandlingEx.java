package phase1.practiceproblems;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		num1=20;
		num2=0;
		try{
			num3=num1/num2;
			System.out.println("Result is: "+num3);
		}
		
		catch(ArithmeticException ae){
			System.out.println("Numbers cannot be divided by zero");
			System.out.println(ae.getMessage());
		}
		
		
		//If we donot know the exact name of the exception then use the parent class name Exception
		catch(Exception ae){
			System.out.println(ae.getMessage());
		}
		finally{
			num3=num1+num2;
			System.out.println("Result after addition is: "+num3);
			System.out.println("This block will always execute");
		}
	}

}
