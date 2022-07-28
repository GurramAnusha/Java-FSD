package phase1.practiceproblems;
import java.io.*;
public class ThrowsExample {

	void m()throws IOException{
		throw new IOException("device error");//checked exception
	}
	
	void n() throws IOException{
		m();
	}
	
	void p(){
		try{
			n();
		}
		catch(Exception e){
			System.out.println("Exception Handled");
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println(e.getClass());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowsExample o=new ThrowsExample();
		o.p();
		
		

	}

}
