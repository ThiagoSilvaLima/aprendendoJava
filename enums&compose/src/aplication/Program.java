package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
		
		System.out.println("Enter Client data: ");
		System.out.print("Name: "); String cName = sc.nextLine();
		System.out.print("Email: "); String email = sc.nextLine();
		System.out.print("Birth date: "); Date bthDate = sdf.parse(sc.next());
		sc.nextLine();
		Client c01 = new Client(cName,email,bthDate);
		
		System.out.println("Enter Order data: ");
		System.out.print("Status: "); OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order= new Order(new Date(),status,c01);
		
		System.out.print("How many items to this order? ");int qItems = sc.nextInt();
		sc.nextLine();
		for(int i =0; i < qItems;i++) {
			System.out.println("Enter #"+i+1+" item data:");
			System.out.print("Product Name: "); String pName = sc.nextLine();
			System.out.print("Product price: "); double price = sc.nextDouble();
			sc.nextLine();
			Product product = new Product(pName,price);
			System.out.print("Quantity: "); int quantity = sc.nextInt();
			sc.nextLine();
			OrderItem orderitem = new OrderItem(quantity,price,product);
			
			order.addItem(orderitem);
		}
		System.out.println("ORDER SUMMARY:");
		System.out.println(""+order.toString());
		
		sc.close();
	}

}
