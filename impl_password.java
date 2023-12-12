package IMP;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.MOB_DAOpASS;
import UTILITY.DBMOBILE;

public class impl_password implements MOB_DAOpASS{

	@Override
	public boolean loginUser(String username, String userpassword) {
		 try {
	            Connection con = DBMOBILE.getConnection();
	            String sql = "SELECT * FROM usersetpass WHERE username=? AND userpassword=?";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setString(1, username);
	            ps.setString(2, userpassword);
	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                con.close();
	                return true; 
	            }
	            con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		return false;
	}

	@Override
	public boolean loginAdmin(String adminname, String adminpassword) {
		  try {
	            Connection con = DBMOBILE.getConnection();
	            String sql = "SELECT * FROM adsetpass WHERE adminname=? AND adminpassword=?";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setString(1, adminname);
	            ps.setString(2, adminpassword);
	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                con.close();
	                return true; 
	            }
	            con.close();
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
		return false;
	}

	@Override
	public boolean AddLoginUser(String setusername, String setuserpassword) {
		 try {
	            Connection con = DBMOBILE.getConnection();
	            String sql = "INSERT INTO usersetpass (username, userpassword) VALUES (?, ?)";
	            PreparedStatement ps = con.prepareStatement(sql);
	            ps.setString(1, setusername);
	            ps.setString(2, setuserpassword);
	            int i = ps.executeUpdate();
	            con.close();
	            return i > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
		
		
		return false;
	}

}
