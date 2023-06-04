package q383;

public class Solution {
	
    public static boolean canConstruct(String ransomNote, String magazine) {
    	if (magazine.length() < ransomNote.length()) {
    		return false;
    	}
    	
    	int[] count = new int[26];
    	for (int i = 0; i < magazine.length(); i++) {
    		char ch = magazine.charAt(i);
    		count[ch - 'a']++;
    	}
    	
    	for (int i = 0; i < ransomNote.length(); i++) {
    		char ch = ransomNote.charAt(i);
    		if(--count[ch - 'a'] < 0) {
    			return false;
    		}
    	}
    	
    	return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ransomNote = "aa";
		String magazine = "aab";
		System.out.println(canConstruct(ransomNote, magazine));

	}

}
