package uhac.controller;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import uhac.databaseHelper.DatabaseDataSource;
import uhac.helperClasses.*;
import uhac.model.UserInfoBean;


/**
 * Servlet implementation class dbcontrol
 */
@WebServlet("/dbcontrol")
public class dbcontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private Connection connection;
	private HttpSession session = null;
	
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
		String requestType = request.getParameter("requestType");
		session = request.getSession(true);

		
		if (connection == null)
		{
			connection = (Connection)getServletContext().getAttribute("connectionDAO");
		}
		if(requestType.equals("login")){
			try {
				UserInfoBean login = UserClass.getLogin(request,connection);
				session.setAttribute("user", login);
				session.setAttribute("records",TransactionClass.getAllTransaction(connection, login));
				 requestType ="home";
				 System.out.print(requestType+login.getRole());
				 
				 
				 session.setAttribute("medicineALL",TransactionClass.getAllMedicine(connection));
				 session.setAttribute("userALL",UserClass.getUsers(request, connection));
			}
			catch(NullPointerException e){
				response.sendRedirect("index.jsp");	
			}
		}
		
		UserInfoBean user = (UserInfoBean)session.getAttribute("user");
		
		switch(requestType){
		case "home":
			
			if(user.getRole()==1){
				response.sendRedirect("jsp/admin/adminProfile.jsp");
			}else if(user.getRole()==2){
				response.sendRedirect("jsp/courier/courierProfile.jsp");
			}else if(user.getRole()==3){
				response.sendRedirect("jsp/customer/customerProfile.jsp");
			}
			break;
		
		
		
		
		}
	}

}
