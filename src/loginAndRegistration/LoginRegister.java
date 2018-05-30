package loginAndRegistration;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(description = "This is for Login", urlPatterns = { "/LoginRegister" })
public class LoginRegister extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {

		// Declare the JDBC objects.
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String conURL = null;

		String connectionUrl = "jdbc:sqlserver://localhost:1433;" + "databaseName=TestDB;integratedSecurity=true;";

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			con = DriverManager.getConnection(connectionUrl);

			System.out.println("Connection established");

		} catch (Exception e) {
			e.printStackTrace();
		}

		String sUsername = request.getParameter("userid");

		PrintWriter out = response.getWriter();

		out.println("Hello " + sUsername);

	}
	


}
