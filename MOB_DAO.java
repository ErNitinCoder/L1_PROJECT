package DAO;

import POJO.MOBILE;

public interface MOB_DAO {
	boolean addmob(MOBILE m);

	boolean updatemob(MOBILE m);

	boolean deletemob(int Srno);

	boolean viewmob(MOBILE m);
	boolean search(int Srno);


	

}
