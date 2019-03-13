package in.com.clc.tasks;


import java.util.List;

public interface AdminDao {
	public boolean insertEmp(AdminEntity entity);
	public String fetchEmp(String empEmailId);
	
}
