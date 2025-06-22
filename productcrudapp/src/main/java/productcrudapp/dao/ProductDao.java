	package productcrudapp.dao;
	
	import java.util.ArrayList;
	import java.util.List;
	
	import org.springframework.transaction.annotation.Transactional;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.orm.hibernate5.HibernateTemplate;
	import org.springframework.stereotype.Component;
	
	import productcrudapp.model.Product;
	
	@Component
	public class ProductDao {
		@Autowired
		private HibernateTemplate hibernateTemplate;
		
		
		//Create the new product
		@Transactional
		public void createProduct(Product product)
		{
			this.hibernateTemplate.saveOrUpdate(product);
		}
		
		
		//Get all product
		public List<Product> getAllProducts()
		{
			List<Product>products=this.hibernateTemplate.loadAll(Product.class);
			return products;
		}
		
		
		//Delete the product
		@Transactional
		public void deleteProduct(int pid)
		{
			
			Product product=this.hibernateTemplate.load(Product.class,pid);
			this.hibernateTemplate.delete(product);
		}
		
		  //Get singal product
		 public Product getProducts(int pid)
		 {
			return this.hibernateTemplate.get(Product.class,pid);
				
		 }
			
		
		
	}
