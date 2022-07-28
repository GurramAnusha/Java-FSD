package phase1.practiceproblems;

public class ConstructorOverloadingShape {
 static int a,b,h,b1,h1;
 static float r,d1,d2;
 
 public ConstructorOverloadingShape(){
	 b1=32;
	 h1=12;
	 d1=2.3f;
	 d2=4.3f;
 }
 public ConstructorOverloadingShape(int x){
	 a=x;
 }
 public ConstructorOverloadingShape(int y,int z){
	 b=y;
	 h=z;
 }
 public ConstructorOverloadingShape(float w){
	 r=w;
 }
 public void square(int x){
	 System.out.println("Area of square is:"+(x*x));
 }
 public void rectangle(int y,int z){
	 System.out.println("Area of rectangle is:"+(b*h));
 }
 public void circle(float w){
	 System.out.println("Area of circle is:"+(3.14*w*w));
 }

 public void area(int b,int h){
	 System.out.println("Area of triangle is:"+((b*h)/2));
 }
 public void area(float m, float n){
	 System.out.println("Area of rhombus  is:"+((m*n)/2));
 }
 public static void main(String args[]){
	 ConstructorOverloadingShape c1=new ConstructorOverloadingShape(2);
	 ConstructorOverloadingShape c2=new ConstructorOverloadingShape(4,5);
	 ConstructorOverloadingShape c3=new ConstructorOverloadingShape(3.2f);
	 c1.square(a);
	 c2.rectangle(b, h);
	 c3.circle(r);
	 ConstructorOverloadingShape c4=new ConstructorOverloadingShape();
	 c4.area(b1,h1);
	 c4.area(d1, d2);
	 
 }
}
