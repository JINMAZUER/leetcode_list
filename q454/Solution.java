package q454;

import java.util.HashMap;

public class Solution {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
    	//建立一个哈希表用来保存num1元素和nums2元素的和以及出现次数
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < nums1.length; i++) {
        	for (int j = 0; j < nums2.length; j++) {
        		int sum = nums1[i] + nums2[j];
        		map.put(sum, map.getOrDefault(sum, 0) + 1);
        	}
        }
        
        for (int i = 0; i < nums3.length; i++) {
        	for (int j = 0; j < nums4.length; j++) {
        		int sum = - (nums3[i] + nums4[j]);
        		if(map.containsKey(sum)) {
        			res += map.get(sum);
        		}
        	}
        }
        
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1, 2};
		int[] nums2 = {-2, -1};
		int[] nums3 = {-1, 2};
		int[] nums4 = {0, 2};
		System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
	}

}
