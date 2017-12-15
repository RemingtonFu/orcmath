package mystuff;

import java.util.ArrayList;

public class KeyCatalog {

	private ArrayList<Keys> keys;
	
	public KeyCatalog() {
		ArrayList<Keys> keys = new ArrayList<Keys>();
		keys.add(new Keys("Household Mortice Key", "HouseMKey.png","rectangle"));
		keys.add(new Keys("Household Cylinder Key", "HouseCKey.png","triangle"));
		keys.add(new Keys("Safe Key", "SafeKey.png","square"));
	}
	
	public static void main(String[] args) {
		KeyCatalog catalog = new KeyCatalog();
		System.out.println(catalog.getCSVContent());
		
	}
	
	public String getCSVContent() {
		String data = "";
		for(Keys k : keys) {
			data += "\n";
		}
		return data;
	}
}
