package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	Date moment;
	OrderStatus status;
	Client client;
	List<OrderItem> orderItem = new ArrayList<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment= moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}
	
	public void addItem(OrderItem item) {
		orderItem.add(item);
	}
	public void removeItem(OrderItem item) {
		orderItem.remove(item);
	}
	public double total () {
		double result = 0;
		for(OrderItem item : orderItem) {
			result += item.subTotal();
		}
		return result;
	}
	
	StringBuilder stBuilder = new StringBuilder();

	@Override
	public String toString() {
		stBuilder.append("Order moment: "+ sdf.format(moment)+"\n");
		stBuilder.append("Order status: "+ status+"\n");
		stBuilder.append("Client: "+client.toString()+"\n");
		stBuilder.append("Order items: \n");
		for( OrderItem item : orderItem) {
			stBuilder.append(item.toString()+"\n");
		}
		stBuilder.append("Total Price: " + total());
		return ""+ stBuilder;
	}
	
}
