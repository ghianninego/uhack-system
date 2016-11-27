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
				 userPassword, 
				 email, 
				 cellphoneNumber, 
				 telephoneNumber, 
				 role, 
				 birthDay);

		 return user.storeToDatabase(connection);
	}
	//pa add delete, update,select user
	
}
