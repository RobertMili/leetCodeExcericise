package shuffleString;

import java.util.HashMap;
import java.util.Map;

public class Main {


}

class Solution {
	public String restoreString(String s, int [] indices) {

		Map<Integer,Character> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			map.put(indices[i],s.charAt(i));
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			sb.append(map.get(i));
		}

		return sb.toString();
	}
	/*
testing something
 asd
 asd
asdasdasdasdsadsa
assdsada
...
sadsa
 */

}
