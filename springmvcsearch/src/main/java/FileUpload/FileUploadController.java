package FileUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping("/File")
	public String FileForm()
	{
		//String string=null;
		//System.out.println(string.charAt(0));
	return "FileForm";
	}
	@RequestMapping(value = "/uploadfile", method = RequestMethod.POST)
	public String uploadFile(@RequestParam("demo") CommonsMultipartFile file,HttpSession session) throws IOException {
	    System.out.println("File Name: " + file.getOriginalFilename());
	    System.out.println("File Size: " + file.getSize());
	    byte data[]=file.getBytes();
	    
	    String path=session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"resource"+File.separator+"Data"+File.separator+file.getOriginalFilename();
	    
	    System.out.println(path);
	    
	    FileOutputStream fileOutputStream=new FileOutputStream(path);
	    fileOutputStream.write(data);
	    fileOutputStream.close();
	    
	    return "filesuccess";
	}

}
