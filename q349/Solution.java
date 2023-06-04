package q349;

import java.util.HashSet;

public class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
    	//HashSet做法，优点速度快但内存大
    	//2ms 42MB
    	HashSet<Integer> set1 = new HashSet<>();
    	HashSet<Integer> set1_set2 = new HashSet<>();
    	for(int i = 0; i < nums1.length; i++) {
    		set1.add(nums1[i]);
    	}
    	
    	for(int j = 0; j < nums2.length; j++) {
    		if(set1.contains(nums2[j])) {
    			set1_set2.add(nums2[j]);
    		}
    	}
    	
    	int[] res  = new int[set1_set2.size()];
        int index = 0;
    	for(int key : set1_set2) {
    		res[index++] = key;
    	}
    	
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2,1};
		int[] ans = intersection(nums1, nums2);
		for(int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
