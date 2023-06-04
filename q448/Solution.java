package q448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
				for(int i = 0; i < nums.length; i++){
					int index = Math.abs(nums[i]) - 1;
					if(nums[index] > 0){
						nums[index] = -nums[index];
					}
				}

				for(int i = 0; i < nums.length; i++){
					if(nums[i] > 0){
						res.add(i+1);
					}
				}

				return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> ans = findDisappearedNumbers(nums);
		System.out.println(ans);

	}

}
