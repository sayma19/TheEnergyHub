package training.sample.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import training.sample.model.LoginClass;
import training.sample.service.LoginService;

@Controller
public class LoginController {

	@Autowired 
	LoginService Loginservice;
	
	@RequestMapping("/login")
	public ModelAndView viewgrpo()
	{
	   return new ModelAndView("login");
	}
	

	@RequestMapping("/logindone")
	public ModelAndView insertlog(@RequestParam("user") String user,@RequestParam("pass") String pass)
	{
		String msg="";
		LoginClass log=new LoginClass (user,pass);
		
		Loginservice.insertlog(log);
		/*if(i==1)
		{
			msg="record inserted successfully";
			return new ModelAndView("welcomeUser");
		}
		else
		{
			 msg="record not inserted";
			return new ModelAndView("login");
	
		}*/
		return new ModelAndView("login");
	}
	
}
