package loginAndRegistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOImplement implements UserDAO{

	static Connection con;
	static PreparedStatement ps;
	@Override
	public int insertUser(User user) {
		int status = 0;
		
		try {
			con = MyConnectionProvider.getConnection();
			ps = con.prepareStatement("insert into User values (?,?,?)");
			ps.setString(1, user.getsUserId());
			ps.setString(2, user.getsUsername());
			ps.setString(3, user.getsPassword());
			
			status = ps.executeUpdate();
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
		return status;
	}

	@Override
	public User getUser(String sUserId, String sPassword) {

		User user = new User();
		
		try {
			con = MyConnectionProvider.getConnection();
			ps = con.prepareStatement("select * from User where UserId=? and Password=?");
			ps.setString(1, sUserId);
			ps.setString(2, sPassword);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				user.setsUserId(rs.getString(1));
				user.setsUsername(rs.getString(2));
				user.setsPassword(rs.getString(3));
				
			}
			
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return user;
	}

}
