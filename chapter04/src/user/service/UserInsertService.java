package user.service;

import java.util.Scanner;

import lombok.Setter;
import user.bean.UserDTO;
import user.dao.UserDAO;
import user.dao.UserDAOImpl;

@Setter
public class UserInsertService implements UserService {

	private UserDTO userDTO; //bean생성

	private UserDAO userDAO; //bean생성

//	public void setUserDTO(UserDTO userDTO) { //property로 가져왔음 lombok으로 처리
//	this.userDTO = userDTO;
//}

//	public void setUserDAO(UserDAO userDAO) { lombok으로 처리
//		this.userDAO = userDAO;
//	}

	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);

		// 데이터
		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = scan.next();

		userDTO.setName(name);
		userDTO.setId(id);
		userDTO.setPwd(pwd);

		// DB
		userDAO.write(userDTO);
		
		//응답
		System.out.println(name + "님의 데이터를 DB에 저장하였습니다");
		
	}

}