package q904;

public class Solution {
    public static int totalFruit(int[] fruits) {
    	if(fruits == null) {
    		return 0;
    	}
    	
    	int max = Integer.MIN_VALUE;
    	//做一个bucket来查看保存了哪几种的水果
    	int[] bucket = {-1, fruits[0]}; //{old, new}
    	//做一个滑动窗口
    	int left = 0;
    	for(int right = 0; right < fruits.length; right++) {
    		//如果当前的水果没有出现过，将这个水果添加进new中把原来的new移动到old中
    		if(fruits[right] != bucket[0] && fruits[right] != bucket[1]) {
    			bucket[0] = bucket[1];
    			bucket[1] = fruits[right];
    			left = right;
    			while(left > 0 && fruits[left-1] == bucket[0]) {
    				left--;
    			}
    		}else if(fruits[right] == bucket[0]) {
    			bucket[0] = bucket[1];
    			bucket[1] = fruits[right];
    		}
    		int max_len = right - left + 1;
    		
    		max = Math.max(max_len, max);
    	}
    	
    	return max;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fruits = {1,2,3,2,2};
		System.out.println(totalFruit(fruits));

	}

}
