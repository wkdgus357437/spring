package user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import user.bean.UserDTO;
import user.service.UserService;
import user.service.UserServiceImpl;

@Component
@RequestMapping(value = "user") // 하면 아래 @RequestMapping에서 value값에 user안줘도됨
public class UserController { // 요청과 응답만 하자

	@Autowired
	private UserService userService;

	@GetMapping(value = "writeForm")
	public String writeForm() {

		return "user/writeForm";
	}

	@PostMapping(value = "write")
	@ResponseBody
	public void write(@ModelAttribute UserDTO userDTO) { // void 있으니, @ResponseBody를 쓰고 dispatcer로 가지못하게,,
		userService.write(userDTO);

	}

	@GetMapping(value = "list") // 데이터는 동적으로 끌고 올거임
	public String list() {

		return "user/list";
	}

	@PostMapping(value = "getUserList")
	@ResponseBody // 알아서 json으로 바꿔줌
	public List<UserDTO> getUserList() { // DTO 여러개를 다 가져와야 하니 list에 담아온다.
		return userService.getUserList();
	}

	@PostMapping(value = "isExistId")
	@ResponseBody
	public String isExistId(@RequestParam String id) {
		return userService.isExistId(id);

	}

	@GetMapping(value = "updateForm")
	public String updateForm() {

		return "user/updateForm";
	}

	@PostMapping(value = "getUser")
	@ResponseBody
	public UserDTO getUser(@RequestParam String id) {
		return userService.getUser(id);
	}
	
	@PostMapping(value = "update")
	@ResponseBody
	public void update(@ModelAttribute UserDTO userDTO) { // void 있으니, @ResponseBody를 쓰고 dispatcer로 가지못하게,,
		userService.update(userDTO);

	}
	
	@GetMapping(value = "deleteForm")
	public String deleteForm() {

		return "user/deleteForm";
	}
	
	@PostMapping(value = "delete")
	@ResponseBody
	public void delete(@RequestParam String id) { // void 있으니, @ResponseBody를 쓰고 dispatcer로 가지못하게,,
		userService.delete(id);

	}
	
}
//@ResponseBody로 dispatcher로 가는걸 막는다. 그래야 다시 $,ajx로 다시 돌아간다
