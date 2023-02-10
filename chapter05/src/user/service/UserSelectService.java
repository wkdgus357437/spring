package user.service;

import java.util.List;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;

@Setter
public class UserSelectService implements UserService {
	private UserDAO userDAO;
	
//	public void setUserDAO(UserDAO userDAO) {
//		this.userDAO = userDAO;
//	} // lombok으로 처리

	@Override
	public void execute() {
		System.out.println();
		//DB
		List<UserDTO> list =userDAO.getUserList();
		
		//응답
		for(UserDTO userDTO: list) {
			System.out.println(userDTO.getName()+"\t"
								+ userDTO.getId()+"\t"
								+ userDTO.getPwd());
			
		}

	}

}
