package RFPlayground;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyCatalog {

	private static ArrayList<Keys> keys;
	
	public KeyCatalog() {
		ArrayList<Keys> keys = new ArrayList<Keys>();
		keys.add(new Keys("Household Mortice Key", "HouseMKey.png","rectangle"));
		keys.add(new Keys("Household Cylinder Key", "HouseCKey.png","triangle"));
		keys.add(new Keys("Safe Key", "SafeKey.png","square"));
	}
	
	public static void main(String[] args) {
		KeyCatalog catalog = new KeyCatalog();
		System.out.println(catalog.getCSVContent());
		System.out.println("Please add a key.");
		String name = in.nextLine();
		System.out.println("Please add a material.");
		String material = in.nextLine();
		System.out.println("Please add a shape.");
		String shape = in.nextLine();
		Keys newKey = Keys(name,material,shape);
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
	}
	
	private static void addEntry(String model, String material, String shape) {
		keys.add(new Keys(model, material, shape));
		System.out.println("The key is now added!");
	}
	
	public String getCSVContent() {
		String data = "";
		for(Keys k : keys) {
			data += "\n";
		}
		return data;
	}
}
