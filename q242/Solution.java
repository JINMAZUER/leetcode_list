package q242;

public class Solution {
    public static boolean isAnagram(String s, String t) {
    	//使用数组的做法
    	if(s.length() != t.length()) {
    		return false;
    	}
    	
    	int[] count = new int[26];
    	for(int i = 0; i < s.length(); i++) {
    		count[s.charAt(i) - 'a']++;
    	}
    	
    	for(int i = 0; i < t.length(); i++) {
    		count[t.charAt(i) - 'a']--;
    	}
    	
    	for(int i = 0; i < count.length; i++) {
    		if(count[i] > 0) {
    			return false;
    		}
    	}
    	
    	return true;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdef";
		String t = "bcdfeb";
		System.out.println(isAnagram(s,t));
	}

}
