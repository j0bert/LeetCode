/*Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.*/

import java.util.ArrayList;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {
		
		int [] blue = {-1,0,1,4,-1,-3};
		
		ArrayList<int[]> red = threeSum(blue);
		System.out.println(red.toString());
	}
	
public static ArrayList<int[]> threeSum(int[] nums) {
        
        ArrayList<int[]> ans = new ArrayList<int[]>();
        
        for (int a = 0; a < nums.length - 2; a++){
            int [] sol = new int[3];
            for (int b = a+1; b < nums.length - 1; b++){
                for (int c = b+1; c < nums.length; c ++){
                    if ((a+b+c) == 0){
                        sol[0] = a;
                        sol[1] = b;
                        sol[2] = c;
                        ans.add(sol);
                    }
                }
            }
        }
        
        return ans;
        
    }
	}
