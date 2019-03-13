package in.com.clc.tasks;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("serv")
public class AdminServiceImpl implements AdminService{

	@Autowired
	public AdminDaoImpl empdao;
	
	public void setEmpdao(AdminDaoImpl empdao) {
		this.empdao = empdao;
	}

	public AdminEntity convertBeanToEntity(AdminBean bean){
		AdminEntity entity = new AdminEntity();
		entity.setEmpEmailId(bean.getEmpEmailId());
		entity.setEmpId(bean.getEmpId());
		entity.setEmpName(bean.getEmpName());
		entity.setMobNo(bean.getMobNo());
		return entity;
	}
	
	public List<AdminBean> convertEntitiesToBeans(List<AdminEntity> entities){
		List<AdminBean> beans = new ArrayList<AdminBean>();
		for(AdminEntity entity :entities){
			beans.add(convertEntityToBean(entity));
		}
		return beans;
	}
	
	public AdminBean convertEntityToBean(AdminEntity entity){
		AdminBean bean = new AdminBean();
		bean.setEmpEmailId(entity.getEmpEmailId());
		bean.setEmpId(entity.getEmpId());
		bean.setEmpName(entity.getEmpName());
		bean.setMobNo(entity.getMobNo());
		return bean;
	}
	
	
	
	public boolean addEmp(AdminBean bean) {
		return empdao.insertEmp(convertBeanToEntity(bean));
	}

	public String getEmp(String empEmailId) {
		if(empdao.fetchEmp(empEmailId) != null)
		{
			return "found";
		}
		else
		{
			return "not found";
		}
		
	}


}
