package com.vir.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.vir.model.Passenger;
import com.vir.util.DBConnection;

public class PassengerDaoImpl implements PassengerDao {
	@Override
	public Passenger getDetails(int passengerId) {
		Connection con=DBConnection.getConnection();
		Passenger bs=null;

		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			pst=con.prepareStatement("select * from passenger where passengerId=?");
			pst.setInt(1,passengerId);
			rs=pst.executeQuery();

			while(rs.next()) {
				bs=new Passenger();
				bs.setPassengerId(rs.getInt(1));
				bs.setPassengerName(rs.getString(2));
				bs.setAge(rs.getInt(3));
				bs.setSeatNo(rs.getInt(4));
				bs.setFare(rs.getFloat(5));
				/*bs.setMailId(rs.getString(4));
				bs.setMobile(rs.getInt(5));*/
				bs.setGender(rs.getString(6));
				/*bs.setComments(rs.getString(7));*/

			}


		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(pst!=null) {
					pst.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(rs!=null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return bs;

	}

	@Override
	public String insertDetails(Passenger p) {
		int pid=p.getPassengerId();
		String pname = p.getPassengerName();
		int age= p.getAge();
		int seatNo = p.getSeatNo();
		float fare = p.getFare();
		/*int mobile= p.getMobile();
		String mailId = p.getMailId();*/
		String gender= p.getGender();

		Connection con = null;
		PreparedStatement pSt = null;

		try
		{  
			con = DBConnection.getConnection();
			String query = "insert into passenger(passengerId,passengerName,age,seatNo,fare,gender) values(?,?,?,?,?,?)"; //Insert user details into the table 'USERS'
			pSt = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
			pSt.setInt(1, pid);
			pSt.setString(2, pname);
			pSt.setInt(3,age);
			pSt.setInt(4, seatNo);
			pSt.setFloat(5, fare);
			/*preparedStatement.setString(4, mailId);
			preparedStatement.setInt(5, mobile);*/
			pSt.setString(6,gender);
			int i= pSt.executeUpdate();
			if (i!=0)  //Just to ensure data has been inserted into the database
				return "SUCCESS"; 
		}
		catch(SQLException e)
		{
			e.printStackTrace();

		}
		return "Oops.. Something went wrong there..!";
	}

	/*@Override
	public String insertFeedback(Passenger p) {
		int pid=p.getPassengerId();
		String comments = p.getComments();
		Connection con = null;
		PreparedStatement preparedStatement = null;

		try
		{  
			con = DBConnection.getConnection();
			String query = "update passenger set comments=? where passengerId=?"; //Insert user details into the table 'USERS'
			preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data

			preparedStatement.setString(1, comments);
			preparedStatement.setInt(2,pid);
			int i= preparedStatement.executeUpdate();
			if (i!=0)  //Just to ensure data has been inserted into the database
				return "SUCCESS"; 
		}
		catch(SQLException e)
		{
			e.printStackTrace();


		
	}
		return "Oops.. Something went wrong there..!";

	
}*/
}
