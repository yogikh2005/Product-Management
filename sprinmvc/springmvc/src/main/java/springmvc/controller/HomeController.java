package springmvc.controller;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("Inside home");

		return "index";
	}

	@RequestMapping("/about")
	public String about(Model model) {
		
		
		System.out.println("Inside about");
		
		model.addAttribute("name","Yogiraj");
		model.addAttribute("city", "pune");
		model.addAttribute("mono","9096603017");
		
		List<String>fdList=new ArrayList<String>();
		
		fdList.add("sam");
		fdList.add("siddhant");
		fdList.add("mk");
		
		model.addAttribute("fd",fdList);
		return "about";
		
	}
	@RequestMapping("/help")
	public ModelAndView help()
	{
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("help");
		modelAndView.addObject("email","yogikh2018@gmail.com");
		LocalDateTime time=LocalDateTime.now();
		modelAndView.addObject("time",time);
		
		List<Integer>marksIntegers=new ArrayList<Integer>();
		marksIntegers.add(11);
		marksIntegers.add(21);
		marksIntegers.add(51);
		marksIntegers.add(101);
		modelAndView.addObject("mark",marksIntegers);
		return modelAndView;
	}

}
