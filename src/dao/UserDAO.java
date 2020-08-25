package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import model.User;
import utility.ConnectionManager;

public class UserDAO implements UserDaoInterface
{

	@Override
	public int signUp(User user) throws SQLException, Exception {
		// TODO Auto-generated method stub
		String email = user.getEmail();
		String password = user.getPassword();
		Statement stm = ConnectionManager.getConnection().createStatement();
		String sql ="insert into USERSIGNUP(email,password)VALUES(?,?)";
		PreparedStatement st = ConnectionManager.getConnection().prepareStatement(sql);
		st.setString(1,email);
		st.setString(2,password);
		ConnectionManager.getConnection().close();
		return st;
	}

	@Override
	public boolean loginUser(User user) {
		// TODO Auto-generated method stub
		
		return false;
	}
	
}