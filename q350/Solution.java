package q350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
    	//3ms 42.8MB
    	if (nums1.length < nums2.length) {
    		int[] temp = nums1;
    		nums1 = nums2;
    		nums2 = temp;
    	}
    	HashMap<Integer, Integer> map = new HashMap<>();
    	
    	for(int key : nums1) {
    		map.put(key, map.getOrDefault(key, 0) + 1);
    	}
    	
    	int[] res = new int[nums2.length];
    	int index = 0;
    	for (int key : nums2) {
    		if (map.containsKey(key) && map.get(key) > 0) {
    			res[index++] = key;
    			map.put(key, map.get(key) - 1);
    		}
    	}
    	
    	return Arrays.copyOfRange(res, 0, index);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2};
		int[] nums2 = {1,1};
		int[] ans = intersection(nums1, nums2);
		for(int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}
