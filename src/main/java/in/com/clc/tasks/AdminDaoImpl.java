package in.com.clc.tasks;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDaoImpl implements AdminDao{
	@Autowired
	SessionFactory sfactory;

	public void setSfactory(SessionFactory sfactory) {
		this.sfactory = sfactory;
	}

	public boolean insertEmp(AdminEntity entity) {
		System.out.println("insertEmp Info inside DAOimpl" +entity);
		Session session = null;
		Transaction tr=null;
		try{
		session = sfactory.openSession();
		tr = session.beginTransaction();
		session.save(entity);
		cleanup(session,tr);
		return true;
		}catch(Exception e){
			tr.rollback();
			return false;
		}
	}

	private void cleanup(Session session, Transaction tr) {
		if(session!=null){
			if(tr!=null){
				session.flush();
				tr.commit();
			}
			session.close();
		}
	}

	public String fetchEmp(String empEmailId) {
		System.out.println("fetchEmp Info inside DAOimpl" +empEmailId);
		Session session = null;
		try{
			session = sfactory.openSession();
		//	EmpEntity entity =session.get(EmpEntity.class, empEmailId);
		
			Criteria criteria = session.createCriteria(AdminEntity.class);
	        criteria.add(Restrictions.eq("empEmailId", empEmailId));
			AdminEntity employee = (AdminEntity) criteria.uniqueResult();
			if(employee != null )
			{
				cleanup(session,null);
				return "found";
			}
			else
			{
				cleanup(session,null);
				return "not found";
			}
			
			
			
		  
				}catch(Exception e){
							return null;
				}
	}




	
		
	}
	
	

