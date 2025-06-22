package springmvcsearch;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String Home()
	{
		//String string=null;
		//Integer.parseInt(string);
	//	System.out.println(string.length());
		return "home";
	}
	
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("text") String query)
	{
		String urlString="https://www.google.com/search?q="+query;
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(urlString);
		return redirectView;
	}
	
	
}
