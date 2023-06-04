package q349;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Solution2 {
    public static int[] intersection(int[] nums1, int[] nums2) {
    	//LinkList做法,优点内存小，但速度慢
    	//11ms 41.4MB
    	ArrayList<Integer> list1 = new ArrayList<>();
    	ArrayList<Integer> list2 = new ArrayList<>();
    	for(int num : nums1) {
    		list1.add(num);
    	}
    	
    	for(int num : nums2) {
    		//确保同一个数字只添加一次
    		if(list1.contains(num) && !list2.contains(num)) {
    			list2.add(num);
    		}
    	}
    	int[] res = new int[list2.size()];
    	int index = 0;
    	for(int num : list2) {
    		res[index++] = num;
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
