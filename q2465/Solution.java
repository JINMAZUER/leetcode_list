package q2465;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

    public static int distinctAverages(int[] nums) {
    	//错误，使用hashset的话不需要记住平均数，只用查看和就可以
    	//hashset不会重复添加元素，LinkedList会
        if(nums.length == 2){
            return 1;
        }
        HashSet<Double> set = new HashSet<>();
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        double ave;
        while (left < right){
            ave = (nums[left] + nums[right]) / 2.0;
            left++;
            right--;
            if(!set.contains(ave)){
                set.add(ave);
            }
        }

        return set.size();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,5,7,8,7,9,8,2,0,7};
		System.out.println(distinctAverages(nums));

	}

}
