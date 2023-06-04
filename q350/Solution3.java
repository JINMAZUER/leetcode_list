package q350;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution3 {
	public static int[] intersection(int[] nums1, int[] nums2) {
		//改进Solution2
		//如果给定的数组已经排好序呢？你将如何优化你的算法？
		//2ms 41.1MB
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int[] res = new int[nums1.length];
		int index = 0;
		int i = 0;
		int j = 0;
		
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] > nums2[j]) {
				j++;
			}else if (nums1[i] < nums2[j]) {
				i++;
			}else {
				res[index++] = nums1[i];
				i++;
				j++;
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
