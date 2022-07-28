package phase1.practiceproblems;

public class StringBufferEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("Started Java ");
		sb.append("Phase1");
		System.out.println(sb);
		
		sb.delete(2, 5);
		System.out.println(sb);
		
		sb.replace(5, 9,"Python");
		System.out.println(sb);
		
		sb.insert(5, "language ");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
		System.out.println(sb.charAt(9));
		

	}

}
