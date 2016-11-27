package uhac.beanHelper;

//import uhac.beanHelper.*;
import uhac.model.*;


public class BeanFactory {


	public static BeanInterface getUserBean(
	int _ID ,String _firstName ,String _middleName , String _lastName ,
	String _userPassword , String _email, String _cellphoneNumber,
	String _telephoneNumber, int _role , String _birthDay
			)
	{
		UserInfoBean user = new UserInfoBean();
		user.setID(_ID);
		user.setFirstName(_firstName);
		user.setMiddleName(_middleName);
		user.setLastName(_lastName);
		user.setUserPassword(_userPassword);
		user.setEmail(_email);
		user.setCellphoneNumber(_cellphoneNumber);
		user.setTelephoneNumber(_telephoneNumber);
		user.setRole(_role);
		user.setBirthDay(_birthDay);
		
		
		return user;
	}
	
	
	
	
	public static BeanInterface getTransactionBean(
			 UserInfoBean customer,
			 UserInfoBean rider,
			 String[] medicine,
			 int quantity,
			 String orderTime,
			 String dateOrder,
			 double priceToPay,
			 double deliveryCharge,
			 boolean enqueue,
			 boolean active,
			 boolean delivered
			){
		TransactionBean transact = new TransactionBean();
		transact.setCustomer(customer);
		transact.setRider(rider);
		transact.setMedicine(medicine);
		transact.setQuantity(quantity);
		transact.setOrderTime(orderTime);
		transact.setDateOrder(dateOrder);
		transact.setPriceToPay(priceToPay);
		transact.setDeliveryCharge(deliveryCharge);
		transact.setEnqueue(enqueue);
		transact.setActive(active);
		transact.setDelivered(delivered);
		
		
		return transact;
	
	}
	
}
