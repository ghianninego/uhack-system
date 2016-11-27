package uhac.helperClasses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.*;

import uhac.beanHelper.BeanFactory;
import uhac.model.TransactionBean;
import uhac.model.UserInfoBean;
import uhac.databaseHelper.*;

public class TransactionClass {

	public static int AddTransactions(HttpServletRequest request , Connection connection, UserInfoBean login){
		 UserInfoBean customer = login;
		 UserInfoBean rider = null;
		 String[] medicine = null;
		 int quantity = Integer.parseInt(request.getParameter("quantity"));
		 String orderTime = request.getParameter("orderTime");
		 String dateOrder = request.getParameter("dateOrder");
		 double deliveryCharge = 0;
		 double priceToPay = 0;
		 boolean enqueue = request.getParameter("enqueue").equals("true")? true:false;
		 
		 boolean active =true;
		 boolean delivered=false;
		 
		 TransactionBean trans =(TransactionBean) BeanFactory.getTransactionBean(customer, rider, medicine, quantity, orderTime, dateOrder, priceToPay, deliveryCharge, enqueue, active, delivered);
		
		
		return trans.storeToDatabase(connection);
	}
	
	public static int UpdateTransaction(HttpServletRequest request , Connection connection){
		PreparedStatement ps = SQLOperations.updateTransaction(connection);

		try {
			connection.setAutoCommit(false);
			ps.setBoolean(1,true);
			ps.setInt(2,Integer.parseInt(request.getParameter("priceToPay")));
			ps.setInt(3,Integer.parseInt(request.getParameter("deliveryCharge")));
			ps.setInt(4,Integer.parseInt(request.getParameter("transactionID")));
			
			if(ps.executeUpdate() > 0){
				connection.commit();
				return 1;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;

	}
	
	public static ResultSet getAllTransaction(Connection connection, UserInfoBean user){
		
	PreparedStatement ps = SQLOperations.SelectOneTransaction(connection);
	try {
		ps.setInt(1, user.getID());
		return ps.executeQuery();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	}
	
	public static ResultSet getAllMedicine(Connection connection){
		try{
	return SQLOperations.SelectMedicine(connection).executeQuery();
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return null;
	}

}
