package UdemyCodingRound2025;

import java.util.HashMap;
import java.util.Map;

public class MaxQuantity {
	public static void main(String[] args) {
		String a[] = { "xyz 9", "abc 20", "pqr 96", "xyz 211" };
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		for (String s : a) {
			String data[] = s.split(" ");
			String name = data[0];
			int quantity = Integer.parseInt(data[1]);
			// System.out.println(name + " " + quantity);
			hmap.put(name, hmap.getOrDefault(name, 0) + quantity);
		}
		for (String x : hmap.keySet()) {
			System.out.println(x + "   " + hmap.get(x));
		}
//for HashMap we need to find the product whose quantity is Max
		int maxQuantity = 0;
		String product = " ";
		for (Map.Entry<String, Integer> entrySet : hmap.entrySet()) {
			if (entrySet.getValue() > maxQuantity) {
				maxQuantity = entrySet.getValue();
				product = entrySet.getKey();
			}
		}
		System.out.println(product + "   " + maxQuantity);
	}
}
