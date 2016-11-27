package uhac.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import uhac.beanHelper.BeanInterface;
import uhac.databaseHelper.SQLOperations;

public class UserInfoBean  implements BeanInterface{
	private int ID;
	private String firstName;
	private String middleName;
	private String lastName;
	private String userPassword;
	private String email;
	private String cellphoneNumber;
	private String telephoneNumber;
	private int role;
	private String birthDay;
	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	@Override
	public void getBeanType() {
		// TODO Auto-generated method stub
		System.out.println("UserInfo Bean");
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCellphoneNumber() {
		return cellphoneNumber;
	}
	
	public void setCellphoneNumber(String cellphoneNumber) {
		this.cellphoneNumber = cellphoneNumber;
	}
	
	public String getTelephoneNumber() {
		return telephoneNumber;
	}
	
	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	
	public int getRole() {
		return role;
	}
	
	public void setRole(int role) {
		this.role = role;
	}
	
	public String getBirthDay() {
		return birthDay;
	}
	
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	@Override
	public int storeToDatabase(Connection connection) {
		PreparedStatement ps = SQLOperations.AddNewUser(connection);
		try
		{
			ps.setString(1, getFirstName());
			ps.setString(2, getMiddleName());
			ps.setString(3, getLastName());
			ps.setString(4, getUserPassword());
			ps.setString(5, getEmail());
			ps.setString(6, getCellphoneNumber());
			ps.setString(7, getTelephoneNumber());
			ps.setInt(8, getRole());
			ps.setString(9, getBirthDay());
			ps.setBoolean(10, true);
			if (ps.executeUpdate() > 0)
			{
				connection.commit();
				return 1;
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return 0;
	}
	
	
}
