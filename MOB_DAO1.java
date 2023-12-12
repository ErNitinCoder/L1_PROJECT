package DAO;

import POJO.MOBILE;

public interface MOB_DAO1 {
	boolean viewmob1(MOBILE m);
	
	boolean search1(double Price);
	
	boolean search2(String Name);
	
	boolean buyMobile(int Srno, int quantityToBuy);
}
