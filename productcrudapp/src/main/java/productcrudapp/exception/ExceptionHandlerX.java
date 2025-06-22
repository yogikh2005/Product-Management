package productcrudapp.exception;

import org.springframework.http.HttpStatus;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerX {
	
	@ResponseStatus(value =HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String NullPointerExceptionX(Model model)
	{
		model.addAttribute("msg", "NullPointerException is genrated!!");
		return "exception";
	}
	
	@ExceptionHandler(value=NumberFormatException.class)
	public String NumberFormatExceptionX(Model model)
	{
		model.addAttribute("msg", "NumberFormatException is genrated!!");
		return "exception";
	}
	
	@ExceptionHandler(value=Exception.class)
	public String GenricException(Model model)
	{
		model.addAttribute("msg", "Exception is genrated!!");
		return "exception";
	}
}