package RFPlayground;

import java.util.ArrayList;
import java.util.Scanner;

import jenny.CatalogMaker;
import jenny.Person;

public class KeyCatalog {

	private static ArrayList<Keys> keys;
	private static Scanner in;
	
	public KeyCatalog() {
		ArrayList<Keys> keys = new ArrayList<Keys>();
		keys.add(new Keys("Household Mortice Key", "HouseMKey.png","rectangle"));
		keys.add(new Keys("Household Cylinder Key", "HouseCKey.png","triangle"));
		keys.add(new Keys("Safe Key", "SafeKey.png","square"));
	}
	
	public static void main(String[] args) {
		in = new Scanner(System.in);
		KeyCatalog maker = new KeyCatalog();
		boolean add = true;

		System.out.println("Do you want to open a saved file? ('yes' or 'no')");
		String s = in.nextLine();
		if(s.equals("yes")) {
			/*
			String[] data = line.split(",");
			catalog.add(new Bread(data[0], data[1], data[2]));
			*/
		}else {
			while(add) {
				maker.addEntry();
				System.out.println("Type 'no' to stop adding people!");
				s = in.nextLine();
				if(s.equals("no")) {
					add = false;
					System.out.println("Would you like to save? ('yes' or 'no')");
				}
			}
		}

		System.out.println(maker.getCSVContent());
	}

	public void addEntry() {
		String[] test = {"Age", "Name"};
		String[] thing = new String[Keys.length()];

		for(int i = 0; i < Keys.length(); i++) {
			if(i == 2)
				System.out.println("Please input type of Key");
			else
				System.out.println("Please input: " + test[i]);
			String s = in.nextLine();
			thing[i] = s;
		}
		Keys.add(new Key(Integer.parseInt(thing[0]), thing[1], thing[2]));
	}

}
