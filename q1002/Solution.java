package q1002;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static List<String> commonChars(String[] words) {
//    	解法1
//    	List<String> res = new ArrayList<>();
//    	HashMap<Character, Integer> main_map = new HashMap<>();
//    	//对main_map进行初始化
//    	for(int i = 0; i < words[0].length(); i++) {
//    		char ch = words[0].charAt(i);
//    		main_map.put(ch, main_map.getOrDefault(ch, 0) + 1);
//    	}
//    	
//    	for(int i = 1; i < words.length; i++) {
//    		HashMap<Character, Integer> temp_map = new HashMap<>();
//    		for(int j = 0; j < words[i].length(); j++) {
//    			char key = words[i].charAt(j);
//    			temp_map.put(key, temp_map.getOrDefault(key, 0) + 1);
//    		}
//    		
//    		for(int k = 0; k < 26; k++) {
//    			char alpha = (char) ('a' + k);
//    			int min_count_at_main = main_map.getOrDefault(alpha, 0);
//    			int min_count_at_temp = temp_map.getOrDefault(alpha, 0);
//    			main_map.put(alpha, Math.min(min_count_at_main, min_count_at_temp));
//    		}
//    	}
//    	
//    	for(int i = 0; i < 26; i++) {
//    		char alpha = (char) ('a' + i);
//    		int count = main_map.get(alpha);
//    		while(count > 0) {
//    			res.add(alpha+"");
//    			count--;
//    		}
//    	}
//    	
//    	return res;
    	
    	List<String> res = new ArrayList<>();
    	int[] count_letter = new int[26];
    	//初始化
    	for(int i = 0; i < words[0].length(); i++) {
    		char ch = words[0].charAt(i);
    		count_letter[ch - 'a']++;
    	}
    	
    	for(int j = 1; j < words.length; j++) {
    		int[] count_temp = new int[26];
    		for(int k = 0; k < words[j].length(); k++) {
    			char ch = words[j].charAt(k);
    			count_temp[ch - 'a']++;
    		}
    		
    		for(int r = 0; r < 26; r++) {
    			count_letter[r] = Math.min(count_letter[r], count_temp[r]);
    		}
    	}
    	
    	for(int i = 0; i < 26; i++) {
    		while(count_letter[i] > 0) {
    			res.add( (char) ('a'+i) + "");
    			count_letter[i]--;
    		}
    	}
    	
    	return res;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = {"bella", "label", "roller"};
		List<String> ans = commonChars(words);
		for(String i : ans) {
			System.out.print(i + " ");
		}

	}

}
