package TEST;

import IMP.MobileDAaoImpl;
import IMP.MobileDAaoImpl1;
import IMP.impl_password;

import java.util.*;


import POJO.MOBILE;




public class MOBILE_TEST {
	

	public static void main(String[] args) {
		int choice;
		MobileDAaoImpl mdao=new MobileDAaoImpl();	
		MobileDAaoImpl1 mdao1=new MobileDAaoImpl1();	
		impl_password AU=new impl_password();
		
       MOBILE m=new MOBILE();
     // UserAdmin ad=new UserAdmin();
   
    
    Scanner sc=new Scanner(System.in);
   
    boolean exit=true;
    	while(exit) {
    System.out.println("1.for Admin");
	System.out.println("2.for user");	
	System.out.println("3.Exit ");
	System.out.println("Enter your choice");
	int ch =sc.nextInt();
	
	System.out.println("  ");
	switch(ch) {
	
	case 1: 
	
		//////////////////////////////////////////////////////////////////////////////////////////////
//////FOR ADMINNN///////////////////////////////////////////////////////////////////////////////////////		
		 System.out.print("Enter user Admin Name: ");
         String Adminname = sc.next();
         System.out.print("Enter Admin password: ");
         String AdminPassword = sc.next();
    	if(AU.loginAdmin(Adminname,AdminPassword)){
    		System.out.println("  ");
boolean logN= true;
		 
while(logN) {  
	
	System.out.println("select any option");
System.out.println("1.Add Mobile to database");
System.out.println("2.Update Mobile");
System.out.println("3.Delete");
System.out.println("4.View all mobile");
System.out.println("5.Search mobile by Srno");
System.out.println("6.Back to menu");
System.out.println("Enter your choice");
System.out.println(".............................................. ");

 choice =sc.nextInt();
sc.nextLine();
System.out.println(".............................................. ");
switch(choice) {

case 1:
	System.out.println("Enter Serial Number");
	int Srno=sc.nextInt();
	System.out.println("Enter Name of Mobile");
	String Name=sc.next();
	System.out.println("Enter colour");
	String Colour=sc.next();
	System.out.println("Enter Ram");
	int Ram=sc.nextInt();
	System.out.println("Enter your Storage");
	int Storage=sc.nextInt();
	System.out.println("Enter price");
double price=sc.nextInt();
System.out.println("Enter your quantity");
   int quantity=sc.nextInt();

MOBILE m1=new MOBILE(Srno,Name,Colour,Ram,Storage,price,quantity );
boolean b=mdao.addmob(m1);

if(b) {
	System.out.println("added");
}else {
	System.out.println("not addded");
}
System.out.println("************************************************************");
break;

case 2:		
	System.out.println("ENTER SRNO you want to update");
	Srno=sc.nextInt();
	
	System.out.println("ENTER NAME");
	 Name=sc.next();		
	System.out.println("ENTER colour");
	Colour=sc.next();
	System.out.println("ENTER Ram");
    Ram=sc.nextInt();
	System.out.println("ENTER Storage");
	Storage=sc.nextInt();
	System.out.println("ENTER Price");
	price=sc.nextDouble();
	System.out.println("ENTER quantity");
	quantity=sc.nextInt();

	
	m1=new MOBILE(Srno,Name,Colour,Ram,Storage,price,quantity );
	boolean b1=mdao.updatemob(m1);
	if(b1)
	{
		System.out.println("Updated Successfully");
	}
	else
	{
		System.out.println("Problem occured while updating");
	} 	
	System.out.println("************************************************************");
	break;
case 3:
	System.out.println("Delete mobile");		
	System.out.println("ENTER SRNO you want to delete");
	 Srno=sc.nextInt();
		
	 boolean b2=mdao.deletemob(Srno);

		if(b2) {
			System.out.println("Deleted");
		}else {
			System.out.println("not deleted");
		}
		System.out.println("************************************************************");
	break;
	
case 4:
	System.out.println("View all mobile");
	mdao.viewmob(m);
	System.out.println("************************************************************");
	break;
	
case 5:
	System.out.println("Search mobile");
	System.out.println("Enter mobile serial number:");
	Srno=sc.nextInt();
	mdao.search(Srno);
	System.out.println("************************************************************");
	break;
case 6:
	logN=false;
	System.out.println("************************************************************");
    break;
default:
    System.out.println("Invalid choice. Please try again.");
}
}
	}else {
		System.out.println("Invalid admin credentials. Please try again.");
	}
    	
	break;

   
 /////////////////////////////////////////////////////////////////////////////////////////////
 ////////// FOR USERS//////////////////////////////////////////////////////////////////////////////////
 
 
    case 2:
    	 System.out.println("1.Create user Account: ");
    	 System.out.println("2.login to user Account: ");
    	 System.out.println("Enter your choice");
    		System.out.println("___________________________________________________________________ ");

    		 choice =sc.nextInt();
    		 switch(choice) {
    		 case 1:
    			 //....... Customer registration
    		        System.out.println("**** Customer Registration ****");
    		        System.out.println("Enter a new customer username:");
    		        String newCustomerUsername = sc.next();
    		        System.out.println("Enter a new customer password:");
    		        String newCustomerPassword = sc.next();

    		        if (AU.AddLoginUser(newCustomerUsername, newCustomerPassword)) {
    		            System.out.println("Customer registered successfully.");
    		        } else {
    		            System.out.println("Customer registration failed. Please try again.");
    		        }
    			 break;
    			 //..........login user account.....................
    		 case 2:
    	 System.out.print("Enter user username: ");
         String username = sc.next();
         System.out.print("Enter user password: ");
         String userPassword = sc.next();
    	if(AU.loginUser(username,userPassword)){
    		System.out.println("  ");    	   	
    boolean logUserr=true;   					   	    	    	   		
	 while(logUserr) {   
		 System.out.println("..WELCOME TO MOBILE DATABASE SYSTEM... ");
		 System.out.println("         OPTION AVAILABLE FOR USER");
	System.out.println("1.View all mobile stored in data base ");
	System.out.println("2.search Mobile....");
	System.out.println("3.buy mobiles");	
	System.out.println("4.back to menu");	
	
	System.out.println("Enter your choice");
	System.out.println(".............................................. ");

	 choice =sc.nextInt();
	sc.nextLine();
	System.out.println(".............................................. ");
	switch(choice) {
	
		
	case 1:
		System.out.println("View all mobile");
		mdao1.viewmob1(m);	
		break;
		
	case 2:
		System.out.println("Search mobile by..");
		System.out.println("1.Mobile Price:");
		System.out.println("2.Mobile Name :");
		System.out.println("Enter your choice");
		int choiceX =sc.nextInt();
		switch(choiceX) {
		case 1:
		System.out.println("1.Enter mobile Price Range you want to buy:");
		double Price=sc.nextInt();
		mdao1.search1(Price);
		break;
		case 2:
			System.out.println("1.Enter mobile Name  you want to buy:");
			String Name=sc.next();
			boolean n=mdao1.search2(Name);
			
			if(n) {
				System.out.println("available");
			}else {
				System.out.println("No mobile is available");
			}
			break;			
		}
		break;
	case 3:
		 System.out.println("Enter the Srno of the mobile you want to buy: ");
         int Srno = sc.nextInt();
         System.out.println("Enter the quantity you want to buy: ");
         int quantityToBuy = sc.nextInt();
         System.out.println(".....................");
         mdao1.buyMobile(Srno, quantityToBuy);     
         System.out.println(" ");
		break;
	case 4:
		logUserr= false;
	    break;
	 default:
         System.out.println("Invalid choice. Please try again.");
	}    
	}
	 }else {
         System.out.println("Invalid admin credentials. Please try again.");
     }
    	break;	 
	}	
	break;
    //.......................................main..........
	case 3:		
		exit=false;
		break;
	default:
        System.out.println("Invalid choice. Please try again.");
	       }	
    	
}	
}

	
	}


