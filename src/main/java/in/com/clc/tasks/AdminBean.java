package in.com.clc.tasks;


public class AdminBean {

	private int empId;
	private String empName;
	private String empEmailId;
	private String mobNo;
	private String permissions;

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmailId() {
		return empEmailId;
	}
	public void setEmpEmailId(String empEmailId) {
		this.empEmailId = empEmailId;
	}
	public String getMobNo() {
		return mobNo;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public AdminBean(int empId, String empName, String empEmailId, String mobNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmailId = empEmailId;
		this.mobNo = mobNo;
	}
	public AdminBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmpBean [empId=" + empId + ", empName=" + empName + ", empEmailId=" + empEmailId + ", mobNo=" + mobNo
				+ "]";
	}
	 public void m1(int i){
		 System.out.println("hello");
	 }
	
	
	
	

	

}
