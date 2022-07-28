package phase1.modifier.p2;

import phase1.modifier.p1.M;
import phase1.modifier.p1.N;

public class Z extends M{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X ob3=new X();
		System.out.println("The variables in class X are:");
		ob3.xPublic();
		System.out.println(ob3.l3);
		System.out.println(ob3.f2);
		System.out.println(ob3.c1);
		N ob4=new N();
		ob4.nPublic();
		Z ob5=new Z();
		ob5.mPublic2();
	}

}
