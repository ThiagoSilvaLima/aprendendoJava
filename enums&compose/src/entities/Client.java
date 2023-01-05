package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
	
	String name;
	String email;
	Date bitrhDate;
	public Client(String name, String email, Date bitrhDate) {
		this.name = name;
		this.email = email;
		this.bitrhDate = bitrhDate;
	}
	@Override
	public String toString() {
		return "" + name + " " + sdf.format(bitrhDate) + " - " + email + "]";
	}
	
	
}
