package DAO;

public interface MOB_DAOpASS {
	
boolean loginUser(String username,String userpassword);
boolean loginAdmin(String adminname,String adminpassword);
boolean AddLoginUser(String setusername,String setuserpassword);
}
