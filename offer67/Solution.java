package offer67;

public class Solution {
	
    public static int strToInt(String str) {

        str = str.trim();
        if(str.length() == 0){
            return 0;
        }
        boolean isNeg = false;

        int i = 0;
        int res = 0;
        if ( i < str.length() && !(Character.isDigit(str.charAt(i)) || str.charAt(i) == '-' || str.charAt(i) == '+' )){
            return 0;
        }

        if( i < str.length() && str.charAt(i) == '-'){
            isNeg = true;
            i++;
        }else if (i < str.length() &&  str.charAt(i) == '+'){
            i++;
        }

        while (i < str.length()){
            char ch = str.charAt(i);
            if(!(Character.isDigit(ch))){
                break;
            }
            
            //判断res*10+x是否溢出
            int num = Character.getNumericValue(ch);
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && num > Integer.MAX_VALUE % 10)) {
                return isNeg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            res = res * 10 + Character.getNumericValue(ch);
            i++;
        }



        if(isNeg){
            return -1 * res;
        }else{
            return res;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="2147483646";
		str.trim();
		System.out.println(strToInt(str));
	}

}
