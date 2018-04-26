public class PerfectNumbers {

	public static void main(String[] args) {
		
		System.out.println(checkPerfectNumber(28));
		System.out.println(checkPerfectNumber(1000000000));
		System.out.println(checkPerfectNumber(273184));
		System.out.println(checkPerfectNumber(1));
		System.out.println(checkPerfectNumber(496));
		
	}
	
    static public boolean checkPerfectNumber(int num) {
        
        boolean ans = false;
        if (num == 1) return false;
        
        int check = 1;
        
        for (int i = 2; i*i <= num; ++i){
        	if (num % i == 0) check += (i + num / i);
        	if (i*i == num) check -= i;
        	if (check > num) return false;
        }
        
        //System.out.println(check);
        
        if (check == num)
        	ans = true;
        return ans;
        
    }
    
    static public int sumDivs(int num, int x){
    	
    	if (x==1)
    		return 1;
    	if (num%x == 0)
    		return x + sumDivs(num,x-1);
    	else
    		return sumDivs(num,x-1);
    	
    }

}
