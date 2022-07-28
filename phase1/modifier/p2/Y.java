package phase1.modifier.p2;
import phase1.modifier.p1.N;
import phase1.modifier.p1.M;
public class Y extends N{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X ob3=new X();
		System.out.println("The variables in class X are:");
		ob3.xPublic();
		System.out.println(ob3.l3);
		System.out.println(ob3.f2);
		System.out.println(ob3.c1);
		Y ob4=new Y();
		ob4.nPublic();
		M ob5=new M();
		ob5.mPublic2();
		
	}

}
