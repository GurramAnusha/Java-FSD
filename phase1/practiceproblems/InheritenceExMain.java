package phase1.practiceproblems;

 class Product {
	int id=78;
	String name="Amul";
	public void display(){
		System.out.println("id is: "+id+'\n'+"name is: "+name);
		}
 	}
 
 class ProductA extends Product {
		int count=50;
		String category="butter";
		public void display(){
			System.out.println("id is: "+id+'\n'+"name is: "+name+'\n'+"Count is: "+count+'\n'+"category is: "+category);
			}
	}
 
 class ProductB extends Product{
		int count=90;
		String category="Milk";
		public void display(){
			System.out.println("id is: "+id+'\n'+"name is: "+name+'\n'+"Count is: "+count+'\n'+"category is: "+category);
			}
	}
 
 class Productc extends Product{
		
		int count=56;
		String category="choco";
		public void display(){
			System.out.println("id is: "+id+'\n'+"name is: "+name+'\n'+"Count is: "+count+'\n'+"category is: "+category);
			}
	}
 
 class SubProductA extends ProductA{
		int tp=0;
		int price=30;
		public void show(){
			tp=count*price;
			System.out.println("id is: "+id+'\n'+"name is: "+name+'\n'+"total price is: "+tp+'\n'+"category is: "+category);
		}
 }
 class SubProductB extends ProductB{
		int price=10;
		int tp=0;
		public void show(){
			tp=count*price;
			System.out.println("id is: "+id+'\n'+"name is: "+name+'\n'+"total price is: "+tp+'\n'+"category is: "+category);
		}
 }	
public class InheritenceExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubProductA sp1=new SubProductA();
		sp1.show();
		SubProductB sp2=new SubProductB();
		sp2.show();
		
		
	}

}
