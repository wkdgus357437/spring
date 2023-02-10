package user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import user.bean.UserDTO;
import user.dao.UserDAO;

@Service
public class UserSelectService implements UserService {
	@Autowired
	private UserDAO userDAO;

	@Override
	public void execute() {
		System.out.println();
		//DB
		List<UserDTO> list =userDAO.getUserList();
		
		//응답
		System.out.println("이름\t아이디\t비밀번호");
		for(UserDTO userDTO: list) {
			System.out.println(userDTO.getName()+"\t"
								+ userDTO.getId()+"\t"
								+ userDTO.getPwd());
			
		}

	}

}
