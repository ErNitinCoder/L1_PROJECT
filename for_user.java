package TEST;
import IMP.MobileDAaoImpl1;
import java.util.*;
import POJO.MOBILE;

public class for_user {
	
		public static void main(String[] args) {
			
			MobileDAaoImpl1 mdao1=new MobileDAaoImpl1();		
	    MOBILE m=new MOBILE();
	    Scanner sc=new Scanner(System.in);
	    
	    
	   
		
	 while(true) {   
		 
	
	System.out.println("1.View all mobile stored in data base !! ");
	System.out.println("2.View Mobile by price !!");
	System.out.println("3.buy mobiles");	
	
	System.out.println("Enter your choice");
	System.out.println(".............................................. ");

	int choice =sc.nextInt();
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
	}
		}
		
			
			
			
		}
	}
	


