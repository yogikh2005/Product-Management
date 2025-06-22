package springmvc.dao;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import springmvc.model.User;

@Repository
public class UserDaoX {
		
		@Autowired
		private HibernateTemplate hibernateTemplate;
		@Transactional
		public int saveUser(User user)
		{
			System.out.println("Inside dao");
			return (int)this.hibernateTemplate.save(user);
		}
		
	

}
