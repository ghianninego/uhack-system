package uhac.helperClasses;

import java.sql.Connection;

import javax.servlet.http.HttpServletRequest;

import uhac.beanHelper.BeanFactory;
import uhac.model.UserInfoBean;

public class UserClass {

	static int addUser(HttpServletRequest request,Connection connection){
		 int ID = Integer.parseInt(request.getParameter("ID"));
		 String firstName = request.getParameter("firstName");
		 String middleName = request.getParameter("middleName");
		 String lastName = request.getParameter("lastName");
		 String address = request.getParameter("address");
		 String userPassword = request.getParameter("userPassword");
		 String email = request.getParameter("email");
		 String cellphoneNumber = request.getParameter("cellphoneNumber");
		 String telephoneNumber = request.getParameter("telephoneNumber");
		 int role = Integer.parseInt(request.getParameter("role"));
		 String birthDay = request.getParameter("birthDay");
		
		 UserInfoBean user =(UserInfoBean) BeanFactory.getUserBean(
				 ID, 
				 firstName, 
				 middleName, 
				 lastName, 
				 address,
				 userPassword, 
				 email, 
				 cellphoneNumber, 
				 telephoneNumber, 
				 role, 
				 birthDay);

		 return user.storeToDatabase(connection);
	}
	
	static int deleteUsers(HttpServletRequest request,Connection connection){
		 return new UserInfoBean().deleteAllUsers(connection);
	}
	
	static int deleteUser(HttpServletRequest request,Connection connection){
		 int ID = Integer.parseInt(request.getParameter("ID"));
		
		 UserInfoBean user = new UserInfoBean();
		 user.setID(ID);

		 return user.deleteUser(connection);
	}
	
	static ResultSet getUsers(HttpServletRequest request,Connection connection) {
		return new UserInfoBean().getUsers(connection);
	}
	
	static ResultSet getUser(HttpServletRequest request,Connection connection){
		 String email = Integer.parseInt(request.getParameter("email"));
		
		 UserInfoBean user = new UserInfoBean();
		 user.setEmail(email);

		 return user.getUser(connection);
	}
	
	static int addUser(HttpServletRequest request,Connection connection){
		 int ID = Integer.parseInt(request.getParameter("ID"));
		 String firstName = request.getParameter("firstName");
		 String middleName = request.getParameter("middleName");
		 String lastName = request.getParameter("lastName");
		 String userPassword = request.getParameter("userPassword");
		 String email = request.getParameter("email");
		 String cellphoneNumber = request.getParameter("cellphoneNumber");
		 String telephoneNumber = request.getParameter("telephoneNumber");
		
		 UserInfoBean user =(UserInfoBean) BeanFactory.getUserBean(
				 ID, 
				 firstName, 
				 middleName, 
				 lastName, 
				 userPassword, 
				 email, 
				 cellphoneNumber, 
				 telephoneNumber, 
				 0, 
				 "");

		 return user.updateDatabase(connection);
	}
	
	public UserInfoBean getLogin(Connection connection) {
		String userPassword = request.getParameter("userPassword");
		String email = request.getParameter("email");
		
		UserInfoBean user = new UserInfoBean();
		user.setUserPassword(userPassword);
		user.setEmail(email);
		
		return user.checkIfValidUser(connection);
	}
	//pa add delete, update,select user
	
}
