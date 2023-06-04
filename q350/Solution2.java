package q350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Solution2 {
	public static int[] intersection(int[] nums1, int[] nums2) {
		//如果给定的数组已经排好序呢？你将如何优化你的算法？
		//2ms 41.1MB
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0;
		int j = 0;
		
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] > nums2[j]) {
				j++;
			}else if (nums1[i] < nums2[j]) {
				i++;
			}else {
				list.add(nums1[i]);
				i++;
				j++;
			}
		}
		
		int[] res = new int[list.size()];
		int index = 0;
		for (int num : list) {
			res[index++] = num;
		}
		
		return res;
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
