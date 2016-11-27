package uhac.databaseHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SQLOperations {
	private static PreparedStatement addNewUser;
	private static PreparedStatement addNewMedicine;
	private static PreparedStatement addNewPreTransaction;
	private static PreparedStatement addNewTransaction;
	
	//----------------------------------------------------
	private static PreparedStatement deleteUser;
	private static PreparedStatement deleteOneUser;
	private static PreparedStatement deleteMedicine;
	private static PreparedStatement deletePreTransaction;
	private static PreparedStatement deleteTransaction;
	
	//---------------------------------------------------
	private static PreparedStatement selectUser;
	private static PreparedStatement selectMedicine;
	private static PreparedStatement selectPreTransaction;
	private static PreparedStatement selectTransaction;
	
	//---------------------------------------------------
	private static PreparedStatement selectOneUser;
	private static PreparedStatement selectOneMedicine;
	private static PreparedStatement selectOnePreTransaction;
	private static PreparedStatement selectOneTransaction;
	
	//--------------------------------------------------
	private static PreparedStatement updateUser;
	private static PreparedStatement updateMedicine;
	private static PreparedStatement updatePreTransaction;
	private static PreparedStatement updateTransaction;
	
	
	public synchronized static PreparedStatement AddNewUser(Connection connection)
	{
		try 
		{
			if (addNewUser == null)
				addNewUser = connection.prepareStatement("INSERT INTO UserInfoTable VALUES (null,?,?,?,?,?,?,?,?,?,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("addNewUser_ERR");
			e.printStackTrace();
		}
		System.out.println("addNewUser");         
		return addNewUser;
	}
	
	public synchronized static PreparedStatement AddNewMedicine(Connection connection)
	{
		try 
		{
			if (addNewMedicine== null)
				addNewMedicine = connection.prepareStatement("INSERT INTO MedicineTable VALUES (null,?,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("addNewUser_ERR");
			e.printStackTrace();
		}
		System.out.println("addNewUser");         
		return addNewMedicine;
	}
	
	
	public synchronized static PreparedStatement AddNewPreTransaction(Connection connection)
	{
		try 
		{
			if (addNewPreTransaction== null)
				addNewPreTransaction = connection.prepareStatement("INSERT INTO PreTransactionTable VALUES (null,?,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("addNewPreTransaction_ERR");
			e.printStackTrace();
		}
		System.out.println("addNewPreTransaction");         
		return addNewPreTransaction;
	}
	
	public synchronized static PreparedStatement AddNewTransaction(Connection connection)
	{
		try 
		{
			if (addNewTransaction== null)
				addNewTransaction = connection.prepareStatement("INSERT INTO TransactionTable VALUES (null,?,?,?,?,?,?,?,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("addNewTransaction_ERR");
			e.printStackTrace();
		}
		System.out.println("addNewTransaction");         
		return addNewTransaction;
	}
	
/***********************************************
 * ***************DElETE*******************
 **********************************************/
	
	
	public synchronized static PreparedStatement DeleteUser(Connection connection)
	{
		try 
		{
			if (deleteUser == null)
				deleteUser = connection.prepareStatement("UPDATE UserInfoTable SET active=0)");
		} 
		catch (SQLException e) 
		{
			System.err.println("deleteUser_ERR");
			e.printStackTrace();
		}
		System.out.println("deleteUser");         
		return deleteUser;
	}
	
	public synchronized static PreparedStatement DeleteOneUser(Connection connection)
	{
		try 
		{
			if (deleteUser == null)
				deleteUser = connection.prepareStatement("UPDATE UserInfoTable SET active=0 WHERE userID = ?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("deleteUser_ERR");
			e.printStackTrace();
		}
		System.out.println("deleteUser");         
		return deleteUser;
	}
	
	public synchronized static PreparedStatement DeleteMedicine(Connection connection)
	{
		try 
		{
			if (deleteMedicine== null)
				deleteMedicine = connection.prepareStatement("UPDATE MedicineTable SET active=0");
		} 
		catch (SQLException e) 
		{
			System.err.println("deleteMedicine_ERR");
			e.printStackTrace();
		}
		System.out.println("deleteMedicine");         
		return deleteMedicine;
	}
	
	
	public synchronized static PreparedStatement DeletePreTransaction(Connection connection)
	{
		try 
		{
			if (deletePreTransaction== null)
				deletePreTransaction = connection.prepareStatement("UPDATE PreTransactionTable SET active=0)");
		} 
		catch (SQLException e) 
		{
			System.err.println("deletePreTransaction_ERR");
			e.printStackTrace();
		}
		System.out.println("deletePreTransaction");         
		return deletePreTransaction;
	}
	
	public synchronized static PreparedStatement DeleteTransaction(Connection connection)
	{
		try 
		{
			if (deleteTransaction== null)
				deleteTransaction = connection.prepareStatement("UPDATE TransactionTable SET active=0");
		} 
		catch (SQLException e) 
		{
			System.err.println("deleteTransaction_ERR");
			e.printStackTrace();
		}
		System.out.println("deleteTransaction");         
		return deleteTransaction;
	}
	
	/***********************************************
	 * ***************SELECT*******************
	 **********************************************/

	public synchronized static PreparedStatement SelectUser(Connection connection)
	{
		try 
		{
			if (selectUser == null)
				selectUser = connection.prepareStatement("SELECT * FROM UserInfoTable SET active=1)");
		} 
		catch (SQLException e) 
		{
			System.err.println("selectUser_ERR");
			e.printStackTrace();
		}
		System.out.println("selectUser");         
		return selectUser;
	}
	
	public synchronized static PreparedStatement SelectMedicine(Connection connection)
	{
		try 
		{
			if (selectMedicine== null)
				selectMedicine = connection.prepareStatement("SELECT * FROM MedicineTable WHERE active = 1");
		} 
		catch (SQLException e) 
		{
			System.err.println("selectMedicine_ERR");
			e.printStackTrace();
		}
		System.out.println("selectMedicine");         
		return selectMedicine;
	}
	
	
	public synchronized static PreparedStatement SelectPreTransaction(Connection connection)
	{
		try 
		{
			if (selectPreTransaction== null)
				selectPreTransaction = connection.prepareStatement("SELECT * FROM PreTransactionTable WHERE active = 1)");
		} 
		catch (SQLException e) 
		{
			System.err.println("selectPreTransaction_ERR");
			e.printStackTrace();
		}
		System.out.println("selectPreTransaction");         
		return selectPreTransaction;
	}
	
	public synchronized static PreparedStatement SelectTransaction(Connection connection)
	{
		try 
		{
			if (selectTransaction== null)
				selectTransaction = connection.prepareStatement("SELECT * FROM TransactionTable WHERE active = 1");
		} 
		catch (SQLException e) 
		{
			System.err.println("selectTransaction_ERR");
			e.printStackTrace();
		}
		System.out.println("selectTransaction");         
		return selectTransaction;
	}
	
	/***********************************************
	 * ***************SELECT ONE*******************
	 **********************************************/

	public synchronized static PreparedStatement SelectOneUser(Connection connection)
	{
		try 
		{
			if (selectOneUser == null)
				selectOneUser = connection.prepareStatement("SELECT * FROM UserInfoTable WHERE userID=? AND active =1)");
		} 
		catch (SQLException e) 
		{
			System.err.println("selectOneUser_ERR");
			e.printStackTrace();
		}
		System.out.println("selectOneUser");         
		return selectOneUser;
	}
	
	public synchronized static PreparedStatement SelectOnePreTransaction(Connection connection)
	{
		try 
		{
			if (selectPreTransaction== null)
				selectPreTransaction = connection.prepareStatement("SELECT * FROM PreTransactionTable WHERE active = 1 AND customerID = ? AND riderID = ?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("selectPreTransaction_ERR");
			e.printStackTrace();
		}
		System.out.println("selectPreTransaction");         
		return selectPreTransaction;
	}
	
	
	
	
/***************************************************
 *                UPDATE                             *
 ****************************************************/
	public synchronized static PreparedStatement updateUser(Connection connection)
	{
		try 
		{
			if (updateUser == null)
				updateUser = connection.prepareStatement("UPDATE UserInfoTable SET "
						+ "firstName = ? , middleName = ? , lastName = ? "
						+ "address = ? , userPassword = ? , email = ? "
						+ "cellphoneNumber = ? , TelephoneNumber = ? WHERE userID = ?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("updateUser_ERR");
			e.printStackTrace();
		}
		System.out.println("updateUser");         
		return updateUser;
	}
	
	public synchronized static PreparedStatement updateMedicine(Connection connection)
	{
		try 
		{
			if (updateMedicine== null)
				updateMedicine = connection.prepareStatement("UPDATE MedicineTable SET medicineName=? , brand=? WHERE medicineID=?");
		} 
		catch (SQLException e) 
		{
			System.err.println("updateMedicine_ERR");
			e.printStackTrace();
		}
		System.out.println("updateMedicine");         
		return updateMedicine;
	}
	
	
	public synchronized static PreparedStatement updatePreTransaction(Connection connection)
	{
		try 
		{
			if (updatePreTransaction== null)
				updatePreTransaction = connection.prepareStatement("UPDATE PreTransactionTable SET riderID = ? WHERE USER ID = ?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("updatePreTransaction_ERR");
			e.printStackTrace();
		}
		System.out.println("updatePreTransaction");         
		return updatePreTransaction;
	}
	
	public synchronized static PreparedStatement updateTransaction(Connection connection)
	{
		try 
		{
			if (updateTransaction== null)
				updateTransaction = connection.prepareStatement("UPDATE TransactionTable SET "
						+ "deliveredTime =? , priceToPay = ?, deliveryCharge = ? "
						+ "enqueue = ? , WHERE transactionID = ?");
		} 
		catch (SQLException e) 
		{
			System.err.println("updateTransaction_ERR");
			e.printStackTrace();
		}
		System.out.println("updateTransaction");         
		return updateTransaction;
	}
	
}
