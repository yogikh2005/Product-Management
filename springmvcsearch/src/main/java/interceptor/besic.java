package interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class besic {
	
	@RequestMapping("/besic")
	public String besic()
	{
		return "besic";
	}
	
	@RequestMapping(path="/infoX")//,method = RequestMethod.POST)
	public String infoX(@RequestParam("user") String name,Model model)
	{
		model.addAttribute("name", name);
		return "info";
	}

}
