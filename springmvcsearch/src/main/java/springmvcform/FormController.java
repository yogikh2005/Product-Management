package springmvcform;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import entity.Student;

@Controller
public class FormController {
	
	@RequestMapping("/form")
	public String home()
	{
		return "form";
		
	}
	
	
	
	@RequestMapping(path="/handleform",method =RequestMethod.POST)
	public ModelAndView handleForm(@ModelAttribute("student") Student student,BindingResult bindingResult) 
	{
		ModelAndView modelAndView=new ModelAndView();
		if(bindingResult.hasErrors())
		{
			modelAndView.setViewName("form");
			return modelAndView;
		}
		System.out.println(student);
		 
		modelAndView.addObject(student);
		modelAndView.setViewName("success");
		return modelAndView;
	}
	
	@RequestMapping("/user/{userid}/{username}")
	public String geturl(@PathVariable("userid")int id,@PathVariable("username")String name)
	{
		System.out.println(id);

		System.out.println(name);
		return "form";
		
	}

			
}


