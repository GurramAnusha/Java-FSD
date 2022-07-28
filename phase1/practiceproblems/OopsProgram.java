package phase1.practiceproblems;

abstract class Vehicle{
	abstract void run();
	abstract void stop();
	public void fuel(int a){
		
	}
	public void fuel(float b,String c){
		
	}
	public void fuel(char d,int e){
		
	}
	int speed;
	long distance;
	Vehicle(){
		System.out.println("Default constructor of Vehicle class");
	}
	Vehicle(int s,long d){
		speed=s;
		distance=d;
	}
	
}

class TwoWheeler extends Vehicle{
	void run(){
		System.out.println("run method implementation in twowheeler class");
	}
	void stop(){
		System.out.println("stop method implementation in twowheeler class");
		
	}
	
	TwoWheeler(){
		super(30,40);
		System.out.println("Default constructor in twowheler class");
	}
	
	int speed=100;
	long distance=300;
	int no_of_tyres=2;
	
	void display(){
		System.out.println("Variables in TwoWheeler class are:");
		System.out.println("speed: "+speed+'\n'+"distance: "+distance+'\n'+"no of tyres:"+no_of_tyres);
		System.out.println("Variables in Vehicle class are:");
		System.out.println("speed: "+super.speed+'\n'+"distance: "+super.distance);
	}
	
}



public class OopsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoWheeler v= new TwoWheeler();
		v.display();
		
		

	}

}
