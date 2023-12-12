package IMP;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DAO.MOB_DAO1;
import POJO.MOBILE;
import UTILITY.DBMOBILE;

public class MobileDAaoImpl1 implements  MOB_DAO1{

	@Override
	public boolean viewmob1(MOBILE m) {
		try 
		{
			Connection con=DBMOBILE.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from mobilep");
			while(rs.next())
			{
				System.out.println("Srno  :"+rs.getInt(1));
				System.out.println("Name:"+rs.getString(2));
				System.out.println("Colour:"+rs.getString(3));
				System.out.println("Ram:"+rs.getInt(4));
				System.out.println("Storage:"+rs.getInt(5));
				System.out.println("Price:"+rs.getDouble(6));
				System.out.println();
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean search1(double Price) {
		try 
		{
			Connection con=DBMOBILE.getConnection();
			String sql="Select * from mobilep where Price<=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setDouble(1, Price);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Srno  :"+rs.getInt(1));
				System.out.println("Name:"+rs.getString(2));
				System.out.println("Colour:"+rs.getString(3));
				System.out.println("Ram:"+rs.getInt(4));
				System.out.println("Storage:"+rs.getInt(5));
				System.out.println("Price:"+rs.getDouble(6));
				System.out.println();
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		return false;
	}
	@Override
	public boolean search2(String Name) {
		try 
		{
			Connection con=DBMOBILE.getConnection();
			String sql="Select * from mobilep where Name=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, Name);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				System.out.println("Srno  :"+rs.getInt(1));
				System.out.println("Name:"+rs.getString(2));
				System.out.println("Colour:"+rs.getString(3));
				System.out.println("Ram:"+rs.getInt(4));
				System.out.println("Storage:"+rs.getInt(5));
				System.out.println("Price:"+rs.getDouble(6));
				System.out.println();
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return false;
	}

	
				@Override
				public boolean buyMobile(int Srno, int quantityToBuy) {
					try {
						Connection con=DBMOBILE.getConnection();
						 String sql1 = "SELECT * FROM mobilep WHERE Srno = ?";
					     String sql2 = "UPDATE mobilep SET quantity = ? WHERE Srno= ?";
					     
					     PreparedStatement ps1=con.prepareStatement(sql1); 
					     PreparedStatement ps2=con.prepareStatement(sql2);  
					        
					     ps1.setInt(1, Srno);
				         ResultSet rs = ps1.executeQuery();   
					        
				         if (rs.next()) {
				                int availablequantity = rs.getInt("quantity");
				                int price = rs.getInt("Price");
				               

				                if (quantityToBuy <= availablequantity) {
				                   // int remainingQuantity = availablequantity - quantityToBuy;
				                    //ps2.setInt(1, remainingQuantity);
				                   // ps2.setInt(2, Srno);
				                   // ps2.executeUpdate();

				                    int totalCost = quantityToBuy * price;
				                    System.out.println("You bought = " + quantityToBuy + "(q) for $=" + totalCost);
				                } else {
				                    System.out.println("Not enough quantity available for purchase!");
				                }
				            } else {
				                System.out.println("Mobile with Srno " + Srno + " not found!");
				            }  
					        
					}catch(Exception e) {
						e.printStackTrace();
					}
					return false;
				}
			
		    
		
	}


	
	


