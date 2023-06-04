package q209;

import java.util.Arrays;

class Solution {
    public static int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int i = 0;
        boolean chk = false;
        int sum = 0;
        for(int j = 0; j < nums.length; j++) {
        	sum += nums[j];
        	
        	//只要窗口内大于target就不断更新窗口范围
        	while(sum >= target) {
        		int subLen = j - i + 1;
        		min = Math.min(subLen, min);
        		sum -= nums[i++];
        		chk = true;
        	}
        }
        
        if(chk) {
        	return min;
        }
        
        return 0;
        

    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target = 7;
		int[] nums = {2,3,1,2,4,3};
		System.out.println(minSubArrayLen(target, nums));

	}

}
