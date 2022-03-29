package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.dao.Userdao;

import springmvc.model.User1;
@Service
public class Userservice {
 
	@Autowired
	private Userdao userdao;
	public int  createuser(User1 user)
	{
		int r=this.userdao.saveUser(user);
		return r;
		
	}
}
