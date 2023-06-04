package q977;

import java.util.Arrays;

class Solution {
    public static int[] sortedSquares(int[] nums) {
    	int[] res = new int[nums.length];
    	int left = 0;
    	int right = nums.length - 1;
    	int index = right;
    	while(left <= right) {
    		if(nums[left]*nums[left] > nums[right]*nums[right]) {
    			res[index--] = nums[left]*nums[left];
    			left++;
    		}else {
    			res[index--] = nums[right]*nums[right];
    			right--;
    		}
    	}
    	
    	return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-7,-3,2,3,11};
		nums = sortedSquares(nums);
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

}
