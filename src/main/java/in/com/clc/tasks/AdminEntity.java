package in.com.clc.tasks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Info")
public class AdminEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	private String empName;
	private String empEmailId;
	private String mobNo;

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
	
	public AdminEntity(int empId, String empName, String empEmailId, String mobNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmailId = empEmailId;
		this.mobNo = mobNo;
	}
	public AdminEntity() {
		super();
		
	}
	@Override
	public String toString() {
		return "EmpEntity [empId=" + empId + ", empName=" + empName + ", empEmailId=" + empEmailId + ", mobNo=" + mobNo
				+ "]";
	}
	
	
	
	
	

	
	
}
