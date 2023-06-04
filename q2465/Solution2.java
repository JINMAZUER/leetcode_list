package q2465;

import java.util.Arrays;
import java.util.HashSet;

public class Solution2 {

    public static int distinctAverages(int[] nums) {
    	//改进
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
        	set.add(nums[left++] + nums[right--]);
        }

        return set.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,5,7,8,7,9,8,2,0,7};
		System.out.println(distinctAverages(nums));

	}
}
