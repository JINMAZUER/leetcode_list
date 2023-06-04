package q541;

public class Solution {
    public static String reverseStr(String s, int k) {
    	char[] str = s.toCharArray();
    	for (int left = 0; left < s.length(); left += 2*k) {
    		int i = left;
    		int j = left + k - 1;
    		if (j > s.length() - 1) {
    			j = s.length() - 1;
    		}
    		while (i < j) {
    			char temp = str[i];
    			str[i] = str[j];
    			str[j] = temp;
    			i++;
    			j--;
    		}
    		
    	}
    	
    	return String.valueOf(str);
    	

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdef";
		System.out.println(s);
		String s_rev = (reverseStr(s, 2));
		System.out.println(s_rev);
	}

}
