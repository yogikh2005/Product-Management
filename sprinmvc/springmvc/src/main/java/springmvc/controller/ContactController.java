 package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {


	@Autowired
	private UserService userService; 
	@RequestMapping("/contact")
	public String contact()
	{
		System.out.println("contact");
		return "contact";
	}
	

	@RequestMapping(path="/form",method = RequestMethod.POST)
	public String handelForm(@ModelAttribute User user,Model model)
	{	
		if(user.getPassword().isEmpty())
		{
			System.out.println("Password not empty!!!");
			return "redirect:/contact";
			
		}
		model.addAttribute("user",user);
		
		int id=this.userService.createUser(user);
		model.addAttribute("id",id);
		System.out.println("Inside controller");
		return "infoX";
	}


		@ModelAttribute
		public void comman(Model model)
		{
			System.out.println("comman");
			model.addAttribute("info","Yk Creation");
			
		}
	
	
	
	
	
//------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	    //-----------------------------------------------------------------------------------------	
//	    // 1.For the using HttpServletRequest
//		// get data from view to controller
//		//--------------------------------------------------------------------------------------------
//		
//		
//	@RequestMapping("/contact")
//	public String contact()
//	{
//		return "contact";
//	}
//	
//	@RequestMapping(path="/form",method = RequestMethod.POST)
//	public String handelForm(HttpServletRequest servletRequest,Model model)
//	{
//		String emailString=servletRequest.getParameter("email");
//		String paString=servletRequest.getParameter("password");
//		
//		model.addAttribute("email",emailString);
//		model.addAttribute("password",paString);
//			
//		return "info";
//	}

	
	
    //  -----------------------------------------------------------------------------------------	
	// 2.For the using @RequestParam 
	// get data view to controller
	//--------------------------------------------------------------------------------------------
	
	@RequestMapping("/contactX")
	public String contactX()
	{
		return "contactX";
	}
	
	
	
	@RequestMapping(path="/formX",method = RequestMethod.POST)
	public String handelFormX(
			@RequestParam("email") String emailString,
			@RequestParam("password") String paString,
			Model model
			)
	{
		;
		
		model.addAttribute("email",emailString);
		model.addAttribute("password",paString);
			
		return "info";
	}
	
	
    //-----------------------------------------------------------------------------------------	
	// 3.For the using @RequestParam  but using User class
	// get data view to controller
	//--------------------------------------------------------------------------------------------
	
	@RequestMapping("/contactXX")
	public String contactXX()
	{
		return "contactXX";
	}
	
	
	
	@RequestMapping(path="/formXX",method = RequestMethod.POST)
	public String handelFormXX(
			@RequestParam("email") String emailString,
			@RequestParam("password") String paString,
			Model model
			)
	{
		;
		
		User user=new User();
		
		user.setEmail(emailString);
		user.setPassword(paString);
		
		model.addAttribute("user",user);
		return "infoX";
	}
	
	
	    //-----------------------------------------------------------------------------------------	
		// 4.For the using @ModelAttrinute inside method 
		// get data view to controller
		//--------------------------------------------------------------------------------------------
		
		@RequestMapping("/contactXXX")
		public String contactXXX()
		{
			return "contactXXX";
		}
		
	
		@RequestMapping(path="/formXXX",method = RequestMethod.POST)
		public String handelFormXXX(@ModelAttribute User user,Model model)
		{
			model.addAttribute("user",user);
			return "infoX";
		}
	
	
		        //-----------------------------------------------------------------------------------------	
				// 5.For the using @ModelAttrinute on method
				//  set data to model we can access any where
				//--------------------------------------------------------------------------------------------
				
//			@ModelAttribute
//			public void info(Model model)
//			{
//				model.addAttribute("info","Yk Creation");
//				
//			}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
