 package springmvc.controller;
import java.io.IOException;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {


	//-----------------------------------------------------------
	// 1.Redirect using redirect
	//-----------------------------------------------------------
	@RequestMapping("/one")
	public String one()
	{
		
		System.out.println("one");
		return "redirect:/two";
	}
	
	//-----------------------------------------------------------
	// 2.Redirect using RedirectView
	//-----------------------------------------------------------
	
	@RequestMapping("/two")
	public RedirectView two()
	{
		System.out.println("three");
		
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("three");
		return redirectView;
		
	}
	
	//-----------------------------------------------------------
	// 3.Redirect using HttpServletResponse
	//-----------------------------------------------------------
		
		@RequestMapping("/three")
		public void three(HttpServletResponse httpServletResponse) throws IOException
		{
			System.out.println("three");
			httpServletResponse.sendRedirect("four");
			
			
		}
		
	
	
	@RequestMapping("four")
	public String four()
	{
		
		System.out.println("four");
		return "contact";
		
	}
	
	
	
}
