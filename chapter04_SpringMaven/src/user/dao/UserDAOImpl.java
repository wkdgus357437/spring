package user.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.collections4.map.HashedMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import user.bean.UserDTO;

@Component
//public class UserDAOImpl extends JdbcDaoSupport implements UserDAO {
public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO {
	
	@Autowired
	public void setDs(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	@Override
	public void write(UserDTO userDTO) {
		//String sql = "insert into usertable values(?,?,?)";
		//getJdbcTemplate().update(sql, userDTO.getName(), userDTO.getId(), userDTO.getPwd());
		 
		
		String sql="insert into usertable values(:name,:id,:pwd)";
		Map<String,String> map = new HashedMap<String, String>();
		map.put("name",userDTO.getName());
		map.put("id",userDTO.getId());
		map.put("pwd",userDTO.getPwd());
		
		getNamedParameterJdbcTemplate().update(sql,map);
	}

	@Override
	public List<UserDTO> getUserList() {
		String sql = "select * from usertable";
		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
		// BeanPropertyRowMapper => 한 줄당 rs 값을 DTO와 매칭시켜주겠다. //UserDTO 타입으로 맵핑해주세요
	}

	@Override
	public UserDTO getUser(String id) {
		String sql = "select * from usertable where id=?";
		try {
			return getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class), id);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	@Override
	public void update(Map<String, String> map) {
		//String sql = "update usertable set name=?, pwd=? where id=?";
		//getJdbcTemplate().update(sql,map.get("name"),map.get("pwd"),map.get("id"));
		String sql ="update usertable set name=:name, pwd=:pwd where id=:id";
		getNamedParameterJdbcTemplate().update(sql, map);
	}

	@Override
	public void delete(String id) {
		String sql = "delete from usertable where id=:id";
		getJdbcTemplate().update(sql,id);
		
	}
}
