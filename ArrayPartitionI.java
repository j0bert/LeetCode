import java.util.Arrays;

public class ArrayPartitionI {

	public static void main(String[] args) {
		int [] A = {5,4,37,1,3,2,4,5,6,3,4,34,235, 11};
		
		System.out.println("Answer:" + arrayPairSum(A));
	}
	
    public static int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        
        int ans = 0;
        
        for (int i = 0; i < nums.length; i++){
        	//System.out.print("Index: " + i);
        	//System.out.print("Ans before: " + ans);
        	//System.out.print("Min: " + min(nums[i],nums[i+1]));
            ans = ans + min(nums[i],nums[i+1]);
            i++;
            //System.out.println();
        }
        
        return ans;
        
    }
    
    public static int min(int a, int b){
    	if (a<b)	{return a;}
    	else	{return b;}
    }

}
