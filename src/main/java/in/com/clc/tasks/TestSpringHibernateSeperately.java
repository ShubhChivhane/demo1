package in.com.clc.tasks;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

public class TestSpringHibernateSeperately {

//before execution of this class.. disable/remove  @EnableWebMvc from SpringBean java file
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringBean.class);
		AdminServiceImpl impl = (AdminServiceImpl) context.getBean("serv");
		System.out.println("EmpDao : "+ impl.empdao);
		System.out.println("SessionFactory : "+ impl.empdao.sfactory);
//		
//	EmpBean info1 = new EmpBean(1, "A", "abc@gmail.com","9503408270");
//	EmpBean info2 = new EmpBean(1, "B", "lmn@gmail.com","7237727277");
//		
//	impl.addEmp(info1);
//	impl.addEmp(info2);
//		
	 
	   
	   System.out.println(impl.getEmp("abc@gmail.com"));
		
	}
	
}
