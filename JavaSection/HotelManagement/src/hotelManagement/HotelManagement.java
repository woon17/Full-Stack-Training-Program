package hotelManagement;

import java.util.ArrayList;
import java.util.Scanner;

class Menu {
	static ArrayList<Item> menuList = new ArrayList<>();

	static {
		menuList.add(new MenuItem(1, "water", 10));
		menuList.add(new MenuItem(2, "coke", 20));
		menuList.add(new MenuItem(3, "pizza", 100));
		menuList.add(new MenuItem(4, "burger", 150));
		menuList.add(new MenuItem(5, "fries", 75));
	}

	public static Item getItemById(int id) {
		return menuList.get(id - 1);
	}

	public String toString() {
		String header = String.format("%8s%16s%16s", "itemID", "itemName", "itemPrice") + "\n";
		String body = "";
		String line = "------------------------------------------\n";

		for (Item i : menuList) {
			body += i + "\n";
		}

		return line + header + line + body + line;
	}
}

class Item {
	int itemID;
	String itemName;
	int itemPrice;

	Item(int itemID, String itemName, int itemPrice) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
	}

	Item(Item item) {
		this.itemID = item.itemID;
		this.itemName = item.itemName;
		this.itemPrice = item.itemPrice;
	}

	public String toString() {
		return String.format("%8s%16s%16s", itemID, itemName, itemPrice);
	}

}

class MenuItem extends Item {
	MenuItem(int itemID, String itemName, int itemPrice) {
		super(itemID, itemName, itemPrice);
	}
}

class BillItem extends Item {
	int itemQuantity;
	int subTotal;

	BillItem(Item item, int itemQuantity) {
		super(item);
		this.itemQuantity = itemQuantity;
		this.subTotal = item.itemPrice * itemQuantity;
	}

	public String toString() {
		return String.format("%8s%16s%16s", this.itemName, this.itemQuantity, this.subTotal);
	}
}

class Bill {
	ArrayList<BillItem> billList = new ArrayList<>();

	void add(BillItem item) {
		billList.add(item);
	}

	public String toString() {
		String header = String.format("%8s%16s%16s", "itemName", "itemPrice", "subtotal") + "\n";
		String body = "";
		String line = "------------------------------------------\n";
		int total = 0;
		for (BillItem i : billList) {
			body += i + "\n";
			total += i.subTotal;
		}
		return line + header + line + body + line + "total: " + total;
	}
}

public class HotelManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String visitorName = "";
		int itemID = 0;
		int itemQuantity = 0;
		boolean con = true;
		String choice = "";

		System.out.println("Welcome to Hotel Paw Patrol");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name:");
		visitorName = sc.next();
		System.out.println("You can check the menu bellow to Bill your food");
		Menu menu = new Menu();
		System.out.println(menu);
		Bill bill = new Bill();

		while (con) {
			System.out.println("Enter the ItemID:");
			itemID = sc.nextInt();
			System.out.println("Enter the quantity:");
			itemQuantity = sc.nextInt();
			Item item = Menu.getItemById(itemID);
			BillItem billItem = new BillItem(item, itemQuantity);
			System.out.println(billItem);
			System.out.println("Would you like to add some more items(y/n)");
			choice = sc.next().substring(0, 1).toLowerCase();
			if (choice.equals("y")) {
				con = true;
				System.out.println("Bellow is the menu");
				System.out.println(menu);
			} else if (choice.equals("n")) {
				con = false;
			} else {
				System.out.println("Invaid choice and produce bill");
				con = false;
			}
			bill.add(billItem);
		}
		System.out.println("Customer name is " + visitorName);
		System.out.println(bill);
	}
}
