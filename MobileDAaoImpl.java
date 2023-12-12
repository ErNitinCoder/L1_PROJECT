package IMP;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import DAO.MOB_DAO;
import POJO.MOBILE;
import UTILITY.DBMOBILE;

public   class MobileDAaoImpl implements MOB_DAO{

	@Override
	public boolean addmob(MOBILE m) {
		try {
			Connection con =DBMOBILE.getConnection();
			String sql="insert into mobilep values(?,?,?,?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			
			ps.setInt(1,m.getSrno());
			ps.setString(2,m.getName());
			ps.setString(3,m.getColour()); 
			ps.setInt(4,m.getRam());
			ps.setInt(5,m.getStorage());    
			ps.setDouble(6,m.getPrice());
			ps.setInt(7,m.getquantity());
			
			int i=ps.executeUpdate();
			if(i>0)
				return true;
			else
			   return false;
			
		}catch(Exception e) {
			e.printStackTrace();
		}		
		return false;
	}
	
	
	public boolean updatemob(MOBILE m) {
	try 
	{
		Connection con =DBMOBILE.getConnection();
		String sql="update mobilep SET Name=?,Colour=?,Ram=?,Storage=?,Price=? where Srno=?";
		PreparedStatement ps=con.prepareStatement(sql);
		
				
		//ps.setInt(1,m.getSrno());
		ps.setString(1, m.getName());
		ps.setString(2,m.getColour());		
		ps.setInt(3,m.getRam());
		ps.setInt(4,m.getStorage());
		ps.setDouble(5,m.getPrice());
		ps.setInt(6,m.getSrno());
		
		int i=ps.executeUpdate();
		if(i>0)
			return true;
		else
		   return false;				
		}
	catch(Exception e) {
			e.printStackTrace();
		}
	return false;
	}
	
	
	public boolean deletemob(int Srno) {
	try {
	Connection con =DBMOBILE.getConnection();
	String us="delete from mobilep where Srno=?";
	PreparedStatement ps=con.prepareStatement(us);
	

     ps.setInt(1,Srno);
     int i=ps.executeUpdate();
		if(i>0)
			return true;
		else
		return false;				
		}
	catch(Exception e) {
			e.printStackTrace();
		}

return false;
	
	}
	@Override
	public boolean viewmob(MOBILE m) {
		
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
	public boolean search(int Srno) {
		try 
		{
			Connection con=DBMOBILE.getConnection();
			String sql="Select * from mobilep where Srno=?";
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setInt(1, Srno);
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

}