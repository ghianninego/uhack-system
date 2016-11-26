package uhack.utilities.databaseUtilities;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.*;

import javax.sql.*;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;



public class SQLOperations {
	//----------------------------insert
	private static PreparedStatement addNewUser;
	private static PreparedStatement addNewBank;
	private static PreparedStatement addNewRole;
	private static PreparedStatement addNewDrugStore;
	private static PreparedStatement addNewHospital;
	private static PreparedStatement addNewMedicine;
	private static PreparedStatement addNewPharmacist;
	private static PreparedStatement addNewTotalPrescription;
	private static PreparedStatement addNewPrescription;
	private static PreparedStatement addNewHistory;
	private static PreparedStatement addNewBankAccount;
	private static PreparedStatement addNewTransaction;
	
	
	//------ SELECT
	private static PreparedStatement selectUser;
	private static PreparedStatement selectBank;
	private static PreparedStatement selectRole;
	private static PreparedStatement selectDrugStore;
	private static PreparedStatement selectHospital;
	private static PreparedStatement selectMedicine;
	private static PreparedStatement selectPharmacist;
	private static PreparedStatement selectPrescription;
	private static PreparedStatement selectTotalPrescription;
	private static PreparedStatement selectHistory;
	private static PreparedStatement selectBankAccount;
	private static PreparedStatement selectTransaction;
	
	
	//--------- delete
	private static PreparedStatement deleteUser;
	private static PreparedStatement deleteBank;
	private static PreparedStatement deleteRole;
	private static PreparedStatement deleteDrugStore;
	private static PreparedStatement deleteHospital;
	private static PreparedStatement deleteMedicine;
	private static PreparedStatement deletePharmacist;
	private static PreparedStatement deletePrescription;
	private static PreparedStatement deleteTotalPrescription;
	private static PreparedStatement deleteHistory;
	private static PreparedStatement deleteBankAccount;
	private static PreparedStatement deleteTransaction;
	
	//--------- update
	private static PreparedStatement updateUser;
	//private static PreparedStatement updateBank;
//	private static PreparedStatement updateRole;
	private static PreparedStatement updateDrugStore;
//	private static PreparedStatement updateHospital;
//	private static PreparedStatement updateMedicine;
	private static PreparedStatement updatePharmacist;
	private static PreparedStatement updatePrescription;
//	private static PreparedStatement updateTotalPrescription;
//	private static PreparedStatement updateHistory;
	private static PreparedStatement updateBankAccount;
//	private static PreparedStatement updateTransaction;
	

	public synchronized static PreparedStatement AddNewUser(Connection connection)
	{
		try 
		{
			if (addNewUser == null)
				addNewUser = connection.prepareStatement("INSERT INTO UserInfoTable VALUES (null,?,?,?,?,?,?,?,?,?	)");
		} 
		catch (SQLException e) 
		{
			System.err.println("INSERT UserInfoTable_ERR");
			e.printStackTrace();
		}
		System.out.println("INSERT UserInfoTable");         
		return addNewUser;
	}
	
	
	public synchronized static PreparedStatement AddNewBank(Connection connection)
	{
		try 
		{
			if (addNewBank == null)
				addNewBank = connection.prepareStatement("INSERT INTO BankTable VALUES (NULL,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("INSERT BankTable_ERR");
			e.printStackTrace();
		}
		System.out.println("INSERT BankTable");         
		return addNewBank;
	}
	
	public synchronized static PreparedStatement AddNewRole(Connection connection)
	{
		try 
		{
			if (addNewRole == null)
				addNewRole = connection.prepareStatement("INSERT INTO RoleTable VALUES (NULL,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("INSERT RoleTable_ERR");
			e.printStackTrace();
		}
		System.out.println("INSERT RoleTable");         
		return addNewRole;
	}
	
	public synchronized static PreparedStatement AddNewHospital(Connection connection)
	{
		try 
		{
			if (addNewHospital == null)
				addNewHospital = connection.prepareStatement("INSERT INTO HospitalTable VALUES (NULL,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("INSERT HospitalTable_ERR");
			e.printStackTrace();
		}
		System.out.println("INSERT HospitalTable");         
		return addNewHospital;
	}
	
	public synchronized static PreparedStatement AddNewDrugStore(Connection connection)
	{
		try 
		{
			if (addNewDrugStore == null)
				addNewDrugStore = connection.prepareStatement("INSERT INTO DrugStoreTable VALUES (NULL,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("INSERT DrugStoreTable_ERR");
			e.printStackTrace();
		}
		System.out.println("INSERT DrugStoreTable");         
		return addNewDrugStore;
	}
	
	public synchronized static PreparedStatement AddNewMedicine(Connection connection)
	{
		try 
		{
			if (addNewMedicine == null)
				addNewMedicine = connection.prepareStatement("INSERT INTO MedicineTable VALUES (NULL,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("INSERT MedicineTable_ERR");
			e.printStackTrace();
		}
		System.out.println("INSERT MedicineTable");         
		return addNewMedicine;
	}
	
	public synchronized static PreparedStatement AddNewPharmacist(Connection connection)
	{
		try 
		{
			if (addNewPharmacist == null)
				addNewPharmacist = connection.prepareStatement("INSERT INTO PharmacistTable VALUES (NULL,?,?,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("INSERT PharmacistTable_ERR");
			e.printStackTrace();
		}
		System.out.println("INSERT PharmacistTable");         
		return addNewPharmacist;
	}
	
	public synchronized static PreparedStatement AddNewPrescription(Connection connection)
	{
		try 
		{
			if (addNewPrescription == null)
				addNewPrescription = connection.prepareStatement("INSERT INTO PrescriptionTable VALUES (NULL,?,?	,?,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("INSERT PrescriptionTable_ERR");
			e.printStackTrace();
		}
		System.out.println("INSERT PrescriptionTable");         
		return addNewPrescription;
	}
	
	public synchronized static PreparedStatement AddNewTotalPrescription(Connection connection)
	{
		try 
		{
			if (addNewTotalPrescription == null)
				addNewTotalPrescription = connection.prepareStatement("INSERT INTO TotalPrescriptionTable VALUES (NULL,?,?,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("INSERT PrescriptionTable_ERR");
			e.printStackTrace();
		}
		System.out.println("INSERT PrescriptionTable");         
		return addNewTotalPrescription;
	}
	

	
	public synchronized static PreparedStatement AddNewHistory(Connection connection)
	{
		try 
		{
			if (addNewHistory == null)
				addNewHistory = connection.prepareStatement("INSERT INTO PrescriptionTable VALUES (NULL,?,?,?,?,?,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("INSERT HistoryTable_ERR");
			e.printStackTrace();
		}
		System.out.println("INSERT HistoryTable");         
		return addNewHistory;
	}
	
	public synchronized static PreparedStatement AddNewBankAccount(Connection connection)
	{
		try 
		{
			if (addNewBankAccount == null)
				addNewBankAccount = connection.prepareStatement("INSERT INTO BankAccountTable VALUES (NULL,?,?,?,?,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("INSERT BankAccountTable_ERR");
			e.printStackTrace();
		}
		System.out.println("INSERT BankAccountTable");         
		return addNewBankAccount;
	}
	
	public synchronized static PreparedStatement AddNewTransaction(Connection connection)
	{
		try 
		{
			if (addNewTransaction == null)
				addNewTransaction = connection.prepareStatement("INSERT INTO TransactionTable VALUES (NULL,?,?,?,?,?,?)");
		} 
		catch (SQLException e) 
		{
			System.err.println("INSERT TransactionTable_ERR");
			e.printStackTrace();
		}
		System.out.println("INSERT TransactionTable");         
		return addNewTransaction;
	}
	
/***********************************************************************************************************
 * ***********************************Select*****************************************************
 *********************************************************************************************************/
	
	
	public synchronized static PreparedStatement SelectUser(Connection connection)
	{
		try 
		{
			if (selectUser == null)
				selectUser = connection.prepareStatement("select * from UserInfoTable");
		} 
		catch (SQLException e) 
		{
			System.err.println("SELECT UserInfoTable_ERR");
			e.printStackTrace();
		}
		System.out.println("SELECT UserInfoTable");         
		return selectUser;
	}
	
	
	public synchronized static PreparedStatement SelectBank(Connection connection)
	{
		try 
		{
			if (selectBank == null)
				selectBank = connection.prepareStatement("SELECT * FROM  BankTable");
		} 
		catch (SQLException e) 
		{
			System.err.println("SELECT BankTable_ERR");
			e.printStackTrace();
		}
		System.out.println("SELECT BankTable");         
		return selectBank;
	}
	
	public synchronized static PreparedStatement SelectRole(Connection connection)
	{
		try 
		{
			if (selectRole == null)
				selectRole = connection.prepareStatement("SELECT * FROM  RoleTable");
		} 
		catch (SQLException e) 
		{
			System.err.println("SELECT RoleTable_ERR");
			e.printStackTrace();
		}
		System.out.println("SELECT RoleTable");         
		return selectRole;
	}
	
	public synchronized static PreparedStatement SelectHospital(Connection connection)
	{
		try 
		{
			if (selectHospital == null)
				selectHospital = connection.prepareStatement("SELECT * HospitalTable");
		} 
		catch (SQLException e) 
		{
			System.err.println("SELECT HospitalTable_ERR");
			e.printStackTrace();
		}
		System.out.println("SELECT HospitalTable");         
		return selectHospital;
	}
	
	public synchronized static PreparedStatement SelectDrugStore(Connection connection)
	{
		try 
		{
			if (selectDrugStore == null)
				selectDrugStore = connection.prepareStatement("SELECT * FROM  DrugStoreTable");
		} 
		catch (SQLException e) 
		{
			System.err.println("SELECT DrugStoreTable_ERR");
			e.printStackTrace();
		}
		System.out.println("SELECT DrugStoreTable");         
		return selectDrugStore;
	}
	
	public synchronized static PreparedStatement SelectMedicine(Connection connection)
	{
		try 
		{
			if (selectMedicine == null)
				selectMedicine = connection.prepareStatement("SELECT * FROM  MedicineTable");
		} 
		catch (SQLException e) 
		{
			System.err.println("SELECT MedicineTable_ERR");
			e.printStackTrace();
		}
		System.out.println("SELECT MedicineTable");         
		return selectMedicine;
	}
	
	public synchronized static PreparedStatement SelectPharmacist(Connection connection)
	{
		try 
		{
			if (selectPharmacist == null)
				selectPharmacist = connection.prepareStatement("SELECT * FROM  PharmacistTable");
		} 
		catch (SQLException e) 
		{
			System.err.println("SELECT PharmacistTable_ERR");
			e.printStackTrace();
		}
		System.out.println("SELECT PharmacistTable");         
		return selectPharmacist;
	}
	
	public synchronized static PreparedStatement SelectPrescription(Connection connection)
	{
		try 
		{
			if (selectPrescription == null)
				selectPrescription = connection.prepareStatement("SELECT * FROM  PrescriptionTable");
		} 
		catch (SQLException e) 
		{
			System.err.println("SELECT PrescriptionTable_ERR");
			e.printStackTrace();
		}
		System.out.println("SELECT PrescriptionTable");         
		return selectPrescription;
	}

	public synchronized static PreparedStatement SelectTotalPrescription(Connection connection)
	{
		try 
		{
			if (selectTotalPrescription == null)
				selectTotalPrescription = connection.prepareStatement("SELECT * FROM  TotalPrescriptionTable");
		} 
		catch (SQLException e) 
		{
			System.err.println("SELECT TotalPrescriptionTable_ERR");
			e.printStackTrace();
		}
		System.out.println("SELECT TotalPrescriptionTable");         
		return selectTotalPrescription;
	}
	
	public synchronized static PreparedStatement SelectHistory(Connection connection)
	{
		try 
		{
			if (selectHistory == null)
				selectHistory = connection.prepareStatement("SELECT * FROM  PrescriptionTable");
		} 
		catch (SQLException e) 
		{
			System.err.println("SELECT HistoryTable_ERR");
			e.printStackTrace();
		}
		System.out.println("SELECT HistoryTable");         
		return selectHistory;
	}
	
	public synchronized static PreparedStatement SelectBankAccount(Connection connection)
	{
		try 
		{
			if (selectBankAccount == null)
				selectBankAccount = connection.prepareStatement("SELECT * FROM  BankAccountTable");
		} 
		catch (SQLException e) 
		{
			System.err.println("SELECT BankAccountTable_ERR");
			e.printStackTrace();
		}
		System.out.println("SELECT BankAccountTable");         
		return selectBankAccount;
	}
	
	public synchronized static PreparedStatement SelectTransaction(Connection connection)
	{
		try 
		{
			if (selectTransaction == null)
				selectTransaction = connection.prepareStatement("SELECT * FROM  TransactionTable");
		} 
		catch (SQLException e) 
		{
			System.err.println("SELECT TransactionTable_ERR");
			e.printStackTrace();
		}
		System.out.println("INSERT TransactionTable");         
		return selectTransaction;
	}
	
	
	/***********************************************************************************************************
	 * ***********************************DELETE*****************************************************
	 *********************************************************************************************************/
	
	
	public synchronized static PreparedStatement DeleteUser(Connection connection)
	{
		try 
		{
			if (deleteUser == null)
				deleteUser = connection.prepareStatement("UPDATE UserInfoTable SET Active = 0 WHERE userID = ?");
		} 
		catch (SQLException e) 
		{
			System.err.println("delete UserInfoTable_ERR");
			e.printStackTrace();
		}
		System.out.println("delete UserInfoTable");         
		return deleteUser;
	}
	
	
	public synchronized static PreparedStatement DeleteBank(Connection connection)
	{
		try 
		{
			if (deleteBank == null)
				deleteBank = connection.prepareStatement("UPDATE  BankTable SET Active = 0 WHERE bankID = ?");
		} 
		catch (SQLException e) 
		{
			System.err.println("delete BankTable_ERR");
			e.printStackTrace();
		}
		System.out.println("delete BankTable");         
		return deleteBank;
	}
	
	public synchronized static PreparedStatement DeleteRole(Connection connection)
	{
		try 
		{
			if (deleteRole == null)
				deleteRole = connection.prepareStatement("UPDATE  RoleTable SET Active = 0 WHERE roleID = ? ");
		} 
		catch (SQLException e) 
		{
			System.err.println("delete RoleTable_ERR");
			e.printStackTrace();
		}
		System.out.println("delete RoleTable");         
		return deleteRole;
	}
	
	public synchronized static PreparedStatement DeleteHospital(Connection connection)
	{
		try 
		{
			if (deleteHospital == null)
				deleteHospital = connection.prepareStatement("delete INTO HospitalTable SET Active = 0 WHERE hospitalID = ?");
		} 
		catch (SQLException e) 
		{
			System.err.println("delete HospitalTable_ERR");
			e.printStackTrace();
		}
		System.out.println("delete HospitalTable");         
		return deleteHospital;
	}
	
	public synchronized static PreparedStatement DeleteDrugStore(Connection connection)
	{
		try 
		{
			if (deleteDrugStore == null)
				deleteDrugStore = connection.prepareStatement("UPDATE  DrugStoreTable SET Active = 0 WHERE drugStoreID = ?");
		} 
		catch (SQLException e) 
		{
			System.err.println("delete DrugStoreTable_ERR");
			e.printStackTrace();
		}
		System.out.println("delete DrugStoreTable");         
		return deleteDrugStore;
	}
	
	public synchronized static PreparedStatement DeleteMedicine(Connection connection)
	{
		try 
		{
			if (deleteMedicine == null)
				deleteMedicine = connection.prepareStatement("UPDATE  MedicineTable SET Active = 0 	WHERE medicineID = ?");
		} 
		catch (SQLException e) 
		{
			System.err.println("delete MedicineTable_ERR");
			e.printStackTrace();
		}
		System.out.println("delete MedicineTable");         
		return deleteMedicine;
	}
	
	public synchronized static PreparedStatement DeletePharmacist(Connection connection)
	{
		try 
		{
			if (deletePharmacist == null)
				deletePharmacist = connection.prepareStatement("UPDATE  PharmacistTable SET Active = 0 WHERE pharmacistID = ?");
		} 
		catch (SQLException e) 
		{
			System.err.println("delete PharmacistTable_ERR");
			e.printStackTrace();
		}
		System.out.println("delete PharmacistTable");         
		return deletePharmacist;
	}
	
	public synchronized static PreparedStatement DeletePrescription(Connection connection)
	{
		try 
		{
			if (deletePrescription == null)
				deletePrescription = connection.prepareStatement("UPDATE  PrescriptionTable SET Active = 0 WHERE prescriptionID = ?");
		} 
		catch (SQLException e) 
		{
			System.err.println("delete PrescriptionTable_ERR");
			e.printStackTrace();
		}
		System.out.println("delete PrescriptionTable");         
		return deletePrescription;
	}
	
	public synchronized static PreparedStatement DeleteTotalPrescription(Connection connection)
	{
		try 
		{
			if (deleteTotalPrescription == null)
				deleteTotalPrescription = connection.prepareStatement("UPDATE  TotalPrescriptionTable SET Active = 0 WHERE totalPrescriptionID =?");
		} 
		catch (SQLException e) 
		{
			System.err.println("delete TotalPrescriptionTable_ERR");
			e.printStackTrace();
		}
		System.out.println("delete TotalPrescriptionTable");         
		return deleteTotalPrescription;
	}

	
	public synchronized static PreparedStatement DeleteHistory(Connection connection)
	{
		try 
		{
			if (deleteHistory == null)
				deleteHistory = connection.prepareStatement("UPDATE  HistoryTable SET Active = 0 WHERE historyID =0");
		} 
		catch (SQLException e) 
		{
			System.err.println("delete HistoryTable_ERR");
			e.printStackTrace();
		}
		System.out.println("delete HistoryTable");         
		return deleteHistory;
	}
	
	public synchronized static PreparedStatement DeleteBankAccount(Connection connection)
	{
		try 
		{
			if (deleteBankAccount == null)
				deleteBankAccount = connection.prepareStatement("UPDATE  BankAccountTable SET Active = 0 WHERE bankAccountID = ?");
		} 
		catch (SQLException e) 
		{
			System.err.println("delete BankAccountTable_ERR");
			e.printStackTrace();
		}
		System.out.println("delete BankAccountTable");         
		return deleteBankAccount;
	}
	
	public synchronized static PreparedStatement DeleteTransaction(Connection connection)
	{
		try 
		{
			if (deleteTransaction == null)
				deleteTransaction = connection.prepareStatement("UPDATE  TransactionTable SET Active = 0 WHERE transactionID = ?");
		} 
		catch (SQLException e) 
		{
			System.err.println("delete TransactionTable_ERR");
			e.printStackTrace();
		}
		System.out.println("INSERT TransactionTable");         
		return deleteTransaction;
	}
	
	
	/***********************************************************************************************************
	 * ***********************************Update*****************************************************
	 *********************************************************************************************************/
	
	
	public synchronized static PreparedStatement UpdateUser(Connection connection)
	{
		try 
		{
			if (updateUser == null)
				updateUser = connection.prepareStatement("UPDATE UserInfoTable SET firstName = ? , middleName = ? , "
						+ "lastName = ? , userPassword = ?, email = ? WHERE userID =?  ");
		} 
		catch (SQLException e) 
		{
			System.err.println("update UserInfoTable_ERR");
			e.printStackTrace();
		}
		System.out.println("update UserInfoTable");         
		return updateUser;
	}
	


	
	
	public synchronized static PreparedStatement updateDrugStore(Connection connection)
	{
		try 
		{
			if (updateDrugStore == null)
				updateDrugStore = connection.prepareStatement("UPDATE  DrugStoreTable SET storeName = ? , addess = ? WHERE drugStoreID = ? ");
		} 
		catch (SQLException e) 
		{
			System.err.println("update DrugStoreTable_ERR");
			e.printStackTrace();
		}
		System.out.println("update DrugStoreTable");         
		return updateDrugStore;
	}
	

	
	public synchronized static PreparedStatement updatePharmacist(Connection connection)
	{
		try 
		{
			if (updatePharmacist == null)
				updatePharmacist = connection.prepareStatement("UPDATE PharmacistTable SET drugStoreID = ? , address = ? WHERE pharmacistID = ? ");
		} 
		catch (SQLException e) 
		{
			System.err.println("update PharmacistTable_ERR");
			e.printStackTrace();
		}
		System.out.println("update PharmacistTable");         
		return updatePharmacist;
	}
	
	public synchronized static PreparedStatement updatePrescription(Connection connection)
	{
		try 
		{
			if (updatePrescription == null)
				updatePrescription = connection.prepareStatement("UPDATE  PrescriptionTable SET Active = 0 ");
		} 
		catch (SQLException e) 
		{
			System.err.println("update PrescriptionTable_ERR");
			e.printStackTrace();
		}
		System.out.println("update PrescriptionTable");         
		return updatePrescription;
	}

	
	
	public synchronized static PreparedStatement updateBankAccount(Connection connection)
	{
		try 
		{
			if (updateBankAccount == null)
				updateBankAccount = connection.prepareStatement("UPDATE  BankAccountTable SET bankAccountNo = ? , balance = ? , historyDate = ? WHERE bankAccountID = ? ");
		} 
		catch (SQLException e) 
		{
			System.err.println("update BankAccountTable_ERR");
			e.printStackTrace();
		}
		System.out.println("update BankAccountTable");         
		return updateBankAccount;
	}
	
	
	
}
