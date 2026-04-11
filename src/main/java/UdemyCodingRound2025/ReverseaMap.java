package UdemyCodingRound2025;

import java.util.HashMap;
import java.util.Map;

public class ReverseaMap {

	public static void main(String[] args) {
		Map<String, Integer> ogMap = new HashMap<String, Integer>();
		ogMap.put("A", 1);
		ogMap.put("B", 2);
		ogMap.put("C", 3);
		ogMap.put("D", 4);
		ogMap.put("E", 5);
		System.out.println(ogMap);
		Map<Integer, String> reverseMap = new HashMap<Integer, String>();
		for (Map.Entry<String, Integer> data : ogMap.entrySet()) {
			reverseMap.put(data.getValue(), data.getKey());

		}
		System.out.println(reverseMap);
	}

}
