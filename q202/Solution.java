package q202;

import java.util.HashSet;

public class Solution {
	public static boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<>();
		int n_copy = n;
		while (n_copy != 1){
			if (set.contains(n_copy)) {
				return false;
			}
			set.add(n_copy);
			n_copy = getHappy(n_copy);
		}
		
		return true;
    }
	
	
	
	public static int getHappy(int n) {
		int ans = 0;
		int temp = n;
		while(temp > 0) {
			int t = temp % 10;
			ans += t*t;
			temp /= 10;
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(20));
	}

}
