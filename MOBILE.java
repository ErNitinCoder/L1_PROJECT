package POJO;

public class MOBILE {
	private int      Srno;
	private String   Name;
	private String   Colour;
	private int      Ram;
	private int      Storage;
	private double   Price;
	private int      quantity;
	private String username;
	private String userpassword;
	
	public int getSrno() {
		return Srno;
	}
	public void setSrno(int srno) {
		Srno = srno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getColour() {
		return Colour;
	}
	public void setColour(String colour) {
		Colour = colour;
	}
	public int getRam() {
		return Ram;
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	public int getStorage() {
		return Storage;
	}
	public void setStorage(int storage) {
		Storage = storage;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getquantity() {
		return quantity;
	}
	public void setquantity(int Quantity) {
		quantity = Quantity;
	}
	@Override
	public String toString() {
		return "MOBILE [Srno=" + Srno + ",Name=" + Name + ", Colour=" + Colour + ", Ram=" + Ram + ", Storage=" + Storage + ", Price="
				+ Price +",Quantity="+ quantity + " ]";
	}
	public MOBILE( int srno,String name, String colour, int ram, int storage, double price,int Quantity) {
		super();
		
		Srno = srno;
		Name = name;
		Colour = colour;
		Ram = ram;
		Storage = storage;
		Price = price;
		quantity=Quantity;
	}
	public MOBILE() {
		super();
		
	}
	
}
