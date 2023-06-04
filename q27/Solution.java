package q27;

public class Solution {
	    public static int removeElement(int[] nums, int val) {
	        int i = 0; //i表示左指针
	        for(int j = 0; j < nums.length; j++){
	            if(nums[j] != val){
	                int temp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = temp;
	                i++;
	            }
	        }

	        return i;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {3,2,2,3};
		int val = 3;
		System.out.println(removeElement(nums, val));
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

	}

}
