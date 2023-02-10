package user.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lombok.Setter;
import user.bean.UserDTO;

@Repository
@Transactional //AOP기능  ->commit,close 기능을 알아서 해준다
public class UserDAOMybatis implements UserDAO {
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public void write(UserDTO userDTO) {
		sqlSession.insert("userSQL.write",userDTO);

	}

	@Override
	public List<UserDTO> getUserList() {
		
		return sqlSession.selectList("userSQL.getList");
	}

	@Override
	public UserDTO getUser(String id) {
	
		return sqlSession.selectOne("userSQL.getUser",id);
	}

	@Override
	public void update(Map<String, String> map) {
		sqlSession.update("userSQL.update",map);

	}

	@Override
	public void delete(String id) {
		sqlSession.delete("userSQL.delete",id);

	}

}
