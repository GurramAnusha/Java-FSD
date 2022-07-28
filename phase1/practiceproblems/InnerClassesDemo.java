package phase1.practiceproblems;

class Employee{
	
	int salary=1000;
	//Nested Classes
	class PermEmployee{
		String code="PE01";
		float hike=0.45f;
		void new_salary(){
			System.out.println("New salary after hike: "+(salary+(salary*hike)));
		}
		void display(){
			System.out.println("Salary:"+salary+'\n'+"code: "+code+'\n'+"hike: "+hike);
		}
		
	}
	//Nested class
	class TempEmployee{
		String code="TE01";
		float hike=0.30f;
		void new_salary(){
			System.out.println("New salary after hike: "+(salary+(salary*hike)));
		}
		void display(){
			System.out.println("Salary:"+salary+'\n'+"code: "+code+'\n'+"hike: "+hike);
		}
		
	}
	
	void role(){
	// Method Local Inner class
		class ContractEmployee{
			String code="CE01";
			float hike=0.30f;
			void new_salary(){
				System.out.println("New salary after hike: "+(salary+(salary*hike)));
			}
			void display(){
				System.out.println("Salary:"+salary+'\n'+"code: "+code+'\n'+"hike: "+hike);
			}
			
		}
		ContractEmployee ce=new ContractEmployee();
		ce.new_salary();
		ce.display();
		
	}
}

public class InnerClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee();
		
		//nested class objects
		Employee.PermEmployee pe=e.new PermEmployee();
		Employee.TempEmployee te=e.new TempEmployee();
		pe.new_salary();
		pe.display();
		te.new_salary();
		te.display();
		e.role();

	}

}
