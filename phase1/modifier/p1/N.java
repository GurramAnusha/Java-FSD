package phase1.modifier.p1;

public class N {
	protected long l2=64753L;
	public int i2=56;
	double d1=586.2d;
	
	public void nPublic(){
		System.out.println("In method of type Public in class N");
		nProtected();
		nDefault();
		nPrivate();
	}
	void nDefault(){
		System.out.println("In method of type default in class N");
	}
	private void nPrivate(){
		System.out.println("In method of type private in class N");
	}
	protected void nProtected(){
		System.out.println("In method of type protected in class N");
	}

}
