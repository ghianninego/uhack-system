package uhac.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import uhac.beanHelper.BeanInterface;
import uhac.databaseHelper.SQLOperations;


public class TransactionBean implements BeanInterface{


	private UserInfoBean customer;
	private UserInfoBean rider;
	private String[] medicine;
	private int quantity;
	private String orderTime;
	private String dateOrder;
	private double priceToPay;
	private double deliveryCharge;
	private boolean enqueue;
	private boolean active;
	private boolean delivered;
	
	//methods
	
	
	public boolean isDelivered() {
		return delivered;
	}

	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}

	public UserInfoBean getCustomer() {
		return customer;
	}
	
	public void setCustomer(UserInfoBean costumer) {
		this.customer = costumer;
	}
	
	public UserInfoBean getRider() {
		return rider;
	}
	
	public void setRider(UserInfoBean rider) {
		this.rider = rider;
	}
	
	public String[] getMedicine() {
		return medicine;
	}
	
	public void setMedicine(String[] medicine) {
		this.medicine = medicine;
	}
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getOrderTime() {
		return orderTime;
	}
	
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	

	
	public String getDateOrder() {
		return dateOrder;
	}
	public void setDateOrder(String dateOrder) {
		this.dateOrder = dateOrder;
	}
	
	public double getPriceToPay() {
		return priceToPay;
	}
	
	public void setPriceToPay(double priceToPay) {
		this.priceToPay = priceToPay;
	}
	
	public double getDeliveryCharge() {
		return deliveryCharge;
	}
	
	public void setDeliveryCharge(double deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	
	public boolean isEnqueue() {
		return enqueue;
	}
	
	public void setEnqueue(boolean enqueue) {
		this.enqueue = enqueue;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public void getBeanType() {
		System.out.println("Transaction Bean");
		
	}

	@Override
	public int storeToDatabase(Connection connection) {
		PreparedStatement ps = SQLOperations.AddNewPreTransaction(connection);
		
		try
		{
			ps.setInt(1,getCustomer().getID());
			ps.setInt(2,getRider().getID());
			ResultSet preTransactionID = SQLOperations.SelectOnePreTransaction(connection).executeQuery();
			preTransactionID.last();
			preTransactionID.previous();
			if (ps.executeUpdate() > 0)
			{
				for(int i = 0; i < getMedicine().length;i++){
					PreparedStatement ps2 = SQLOperations.AddNewTransaction(connection);
					ps2.setInt(1, preTransactionID.getInt("preTransactionID"));
					ps2.setInt(2,Integer.parseInt(getMedicine()[i]));
					ps2.setInt(2,getQuantity());
					ps2.setString(3,new SimpleDateFormat("HH:MM:SS").format(new java.util.Date()));
					ps2.setString(4,new java.util.Date().toString());
					ps2.setDouble(5,getPriceToPay());
					ps2.setDouble(6,getDeliveryCharge());
					ps2.setBoolean(7,isEnqueue());
					ps2.setBoolean(8,isDelivered());
					ps2.setBoolean(9,true);
						if(i==getMedicine().length && ps2.executeUpdate()>0){
							connection.commit();
							return 1;
						}
					}
				
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return 0;
	}

	
}
