package phase1.practiceproblems;

public class ConstructorEx {
	String name;
	int age;
	char section;
	char gender;
	int sub1=0;
	int sub2,sub3;
	float total;
	float p;
	ConstructorEx(String n,int a,char s,char g,int sub1,int sub2,int sub3){
		name=n;
		age=a;
		section=s;
		gender=g;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	ConstructorEx(String n,int a,char s,char g,int sub2,int sub3){
		name=n;
		age=a;
		section=s;
		gender=g;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	public void display(String n,int a,char s,char g,int sub1,int sub2,int sub3){
		System.out.println("The class variables are:");
		total=sub1+sub2+sub3;
		p=(total/150)*100;
		System.out.println(n+'\n'+a+'\n'+s+'\n'+g+'\n'+sub1+'\n'+sub2+'\n'+sub3+'\n'+total+'\n'+p+'\n');
	}
	public static void main(String args[]){
		ConstructorEx s1=new ConstructorEx("Anusha",21,'A','F',47,42,48);
		s1.display("Anusha",21,'A','F',47,42,48);
		ConstructorEx s2=new ConstructorEx("Anitha",22,'B','F',45,42);
		s1.display("Anitha",22,'B','F',0,45,42);
		ConstructorEx s3=new ConstructorEx("Akhil",24,'B','M',43,49);
		s1.display("Akhil",24,'B','M',0,43,49);
		ConstructorEx s4=new ConstructorEx("Anand",23,'A','M',43,45,46);
		s1.display("Anand",23,'A','M',43,45,46);
	}
	

}
