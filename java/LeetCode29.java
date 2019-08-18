class LeetCode29{
	public static int divide(int dividend, int divisor) {
        if(dividend==Integer.MIN_VALUE&&divisor==-1) return Integer.MAX_VALUE;
	    dividend = Math.abs(dividend); 
		divisor = Math.abs(divisor); 	
        if(dividend<divisor) return 0 ; 
		int result = 0;  
		int sign = 1 ; 
		if((dividend>0&&divisor<0)||(dividend<0&&divisor>0)) sign =-1; 
		while(dividend>=divisor*result){
			result++; 
		}
		result = result-1;
		if(sign==-1) return -result; 		
		return result; 
    }
	
	public static void main(String[] args){
		int divid1 = 1000 ; 
		int divis1 = -7; 
		int divid2 = Integer.MIN_VALUE ; 
		int divis2 = -1; 
		int divid3 = 100 ; 
		int divis3 = 3; 
		int divid4 = 10 ; 
		int divis4 = 100; 
		System.out.println("The result of test1 is"+ divide(divid1,divis1)); 
		System.out.println("The result of test2 is"+ divide(divid2,divis2)); 
		System.out.println("The result of test3 is"+ divide(divid3,divis3)); 
		
		
	}
	
}
