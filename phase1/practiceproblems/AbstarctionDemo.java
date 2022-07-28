package phase1.practiceproblems;

abstract class MNC{
	MNC()
	{
		System.out.println("in MNC class");
	}
	abstract void shares();
	abstract void employee();
	void display(){
		System.out.println("In display method of MNC class");
	}
	
}

abstract class Infosys extends MNC{
	void employee(){
		System.out.println("Employee method implementation in Infosys");
	}
}

class Hello extends Infosys{
	void shares(){
		System.out.println("shares method implementation in Hello class");
	}
	void display1(){
		System.out.println("In display1 method of Hello class");
	}
}



public class AbstarctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MNC m=new Hello();
		m.shares();
		m.employee();
		m.display();
		Hello h=new Hello();
		h.display1();
	}

}
