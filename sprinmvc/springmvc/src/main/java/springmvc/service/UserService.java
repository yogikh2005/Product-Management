package springmvc.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmvc.dao.UserDaoX;
import springmvc.model.User;

@Service
public class UserService {
	
	@Autowired
	private UserDaoX userdao;
	
	public int createUser(User user)
	{
		System.out.println("Inside service");
		return this.userdao.saveUser(user);
		
	}

}
