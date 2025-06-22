package productcrudapp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrudapp.dao.ProductDao;
import productcrudapp.model.Product;

@Controller
public class MainController {
	
	@Autowired
	private ProductDao productDao;
	
	
	
	
	//To display product form
	@RequestMapping("/add-product")
	public String addProduct(Model m)
	{
		m.addAttribute("title","Add Product");
		return "addProduct"; 
	}
	
	
	//handle add product form
	@RequestMapping(value="/handle-product",method=RequestMethod.POST )
	public RedirectView handlerform(@ModelAttribute Product product,HttpServletRequest request)
	{
		RedirectView redirectView=new RedirectView();
		productDao.createProduct(product);
		redirectView.setUrl(request.getContextPath()+"/");
	
		return redirectView;
	}
	
	//To dipslay home page get data
	@RequestMapping("/")
	public String home(Model model)
	{ 
		List<Product>products=productDao.getAllProducts();
		model.addAttribute("products",products);
		return "index";
	}
	
	
	//To delete product  
	@RequestMapping("/delete-product/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId")int pid,HttpServletRequest request)
	{
		RedirectView redirectView=new RedirectView();
		productDao.deleteProduct(pid);
		redirectView.setUrl(request.getContextPath()+"/");
	
		return redirectView;
	}
	
	//To update product  
	@RequestMapping("/update-product/{productId}")
	public String updateProduct(@PathVariable("productId")int pid,Model model)
	{
		RedirectView redirectView=new RedirectView();
		Product product=productDao.getProducts(pid);
		model.addAttribute("product",product);
		model.addAttribute("title","Update Product");
		return "updateProduct";
	}
	
	
	
	
}
