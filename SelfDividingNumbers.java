/*A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.*/

import java.util.*;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		selfDividingNumbers(1,10000);
	}
	
	static public List<Integer> selfDividingNumbers(int left, int right) {
		
        List<Integer> ans = new ArrayList<Integer>();
        int[] nums = new int[right-left+1];
        
        System.out.println("Numbers array: ");
        for(int i = 0; i < nums.length; i++){
        	nums[i] = left;
        	left++;
        	System.out.print(nums[i] + " ");
        }
        
        for (int k = 0; k < nums.length; k++){
        	boolean isSelfDiv = false;
        	String temp = Integer.toString(nums[k]);
        	//System.out.println();
        	//System.out.println("Temp = " + temp);
        	char [] charArr = temp.toCharArray();
        	for (int j = 0; j < charArr.length; j++){
            	int num = charArr[j] - 48;
            	//System.out.println(num);
            	if (num == 0){
            		isSelfDiv = false;
            		break;
            	}
        		if (nums[k] % num == 0){
        			isSelfDiv = true;
        			//System.out.println(nums[k] + " IS GOOD " + num);
        		} else {
        			isSelfDiv = false;
        			//System.out.println(nums[k] + " IS NOT GOOD " + num);
        			break;
        		}
        	}
        	if (isSelfDiv)
        		ans.add(nums[k]);
        }
        
        System.out.println();
        for (Integer i: ans){
        	System.out.print(i + " ");
        }
        
        return ans;
    }

}
