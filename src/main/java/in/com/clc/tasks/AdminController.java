package in.com.clc.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@RequestMapping(value = "/reg/", method = RequestMethod.GET)
	public String listPersons(Model model) {
		 System.out.println("this is registration handler mapping");
		
		return "regform";
	}

	
	@RequestMapping(value = "/logins/", method = RequestMethod.GET)
	public String loginpage(Model model) {
		 System.out.println("this is registration handler mapping");
		
		return "login";
	}
	@RequestMapping(value = "/admin/", method = RequestMethod.GET)
	public String checking()
	{
		System.out.println("this is hello handler mapping");
		return "adminlogin";
	}
	
	@RequestMapping(value = "/checklogin/", method = RequestMethod.POST)
	public String logindetails(@ModelAttribute("empob") AdminBean p) {
		System.out.println("inside controller...." +p);
		 
			if(this.service.getEmp(p.getEmpEmailId()) != null )
			{ 
				System.out.println("MEssage :login successfully");
				
			}
			else
			{
				System.out.println(" MEssage :check email id");	
			     
			}
			return "homepage";
		 
		
		
	}
    
    
}
