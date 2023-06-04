package q242;

import java.util.HashMap;

public class Solution2 {
    public static boolean isAnagram(String s, String t) {
    	//HashMap做法
    	if(s.length() != t.length()) {
    		return false;
    	}
    	
    	HashMap<Character, Integer> map_s = new HashMap<>();
    	HashMap<Character, Integer> map_t = new HashMap<>();
    	
    	for(int i = 0; i < s.length(); i++) {
    		char key = s.charAt(i);
    		map_s.put(key, map_s.getOrDefault(key, 0) + 1);
    	}
    	
    	for(int i = 0; i < t.length(); i++) {
    		char key = t.charAt(i);
    		map_t.put(key, map_t.getOrDefault(key, 0) + 1);
    	}
    	
    	return map_s.equals(map_t);

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdef";
		String t = "bcdfeb";
		System.out.println(isAnagram(s,t));
	}
}
