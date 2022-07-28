package phase1.practiceproblems;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// float to long//
		float f=12.4f;
		long l=(long)f; //Explicit
		System.out.println("Long value is: "+l);
		
		// double ->long --> int --> char
		
		double d=16548828.9918781d;
		long l1=(long)d; //implicit
		int i=(int)l1;//explicit
		char c=(char)i; //explicit
		System.out.println("Long value is:"+l1);
		System.out.println("Integer value is:"+i);
		System.out.println("Character value is:"+c);
		
		//long-->byte
		
		long l2=172615281l;
		byte b=(byte)l2;//explicit
		System.out.println("byte value is:"+b);
		
		//int--> double -->long
		
		int i1=32;
		double d1=i1; //implicit
		long l3=(long)d1; //implicit
		System.out.println("double value is:"+d1);
		System.out.println("long value is:"+l3);
	}

}
