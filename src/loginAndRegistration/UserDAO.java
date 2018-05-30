package loginAndRegistration;

public interface UserDAO {

	public int insertUser(User user);
	public User getUser(String sUserId, String sPassword);

}
