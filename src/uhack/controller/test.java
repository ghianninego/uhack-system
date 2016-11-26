package uhack.controller;
import uhack.utilities.databaseUtilities.*;

import java.io.IOException;
import java.sql.*;
import javax.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import uhack.utilities.databaseUtilities.DatabaseDataSource;




/**
 * Servlet implementation class test
 */
@WebServlet("/test")
public class test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Connection connection;
	//private HttpSession session = null;

	public void init() throws ServletException {
		//super.init(config);
		connection = DatabaseDataSource.getConnection();
		getServletContext().setAttribute("connectionDAO", connection);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			ResultSet rs = null;
			rs = SQLOperations.SelectRole(connection).executeQuery();
		//	connection.commit();
			System.out.print(rs.next());
			System.out.print(rs.getString("medicineName")+rs.getInt("medicineID"));
		
		}catch(Exception E){
			
		}
		
		
	}

}
