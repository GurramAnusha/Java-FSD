package phase1.modifier.p1;

public class M {
	private int i1=21;
	long l1=21873L;
	protected float f1=54.3f;
	
	public void mPublic(){
		System.out.println("In method of type Public in class M");
		System.out.println("The value of the private variable is:"+i1);
		
	}
	public void mPublic2(){
		System.out.println("In second method of type Public in class M");
		mDefault();
		mPrivate();
		mProtected();
	}
	void mDefault(){
		System.out.println("In method of type default in class M");
	}
	private void mPrivate(){
		System.out.println("In method of type private in class M");
	}
	protected void mProtected(){
		System.out.println("In method of type protected in class M");
	}

}
