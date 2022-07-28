package phase1.practiceproblems;

public class EncapsulationDemo {
	private int securitycode;
	private String branchname;
	private int branchcode;
	private String deptname;
	private int deptcode;

	public int getSecuritycode() {
		return securitycode;
	}
	
	public void setSecuritycode(int securitycode) {
		this.securitycode = securitycode;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public int getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(int branchcode) {
		this.branchcode = branchcode;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public int getDeptcode() {
		return deptcode;
	}

	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo ed=new EncapsulationDemo();
		ed.setSecuritycode(123);
		ed.setBranchname("CSE");
		ed.setBranchcode(5);
		ed.setDeptname("Student");
		ed.setDeptcode(1);
		System.out.println("securitycode:"+ed.getSecuritycode()+'\n'+
				"branchname:"+ed.getBranchname()+'\n'+"branchcode:"+ed.getBranchcode()+'\n'+
				"deptname:"+ed.getDeptname()+'\n'+"deptcode:"+ed.getDeptcode());
		
		

	}

}
