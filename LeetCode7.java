/*

Runtime: 2 ms, faster than 73.27% of Java online submissions for Reverse Integer.
Memory Usage: 33.2 MB, less than 100.00% of Java online submissions for Reverse Integer.
*/

class LeetCode7{

	public static int reverse(int x) {
			if(x==Integer.MIN_VALUE) return 0 ; 
			boolean negative = false; 
			if(x<0) negative = true; 
			String s = String.valueOf(x); 
			String result = ""; 
			for(int i=s.length()-1 ; i>=0 ;i--){
				if(s.charAt(i)=='-') break; 
				result += s.charAt(i); 
			}
			//System.out.println(result);
			if((result.length()==10)&&negative&&result.substring(1,s.length()-1).compareTo("2147483648")>0){ 
				return 0 ; 
			}else if((result.length()==10)&&result.compareTo("2147483647")>0){
				return 0 ; 
			}
			
			int n = Integer.valueOf(result); 
			if(negative) {
				n = 0-n ;
			} 
			return n ; 
    }
	public static void main(String[] args){
		int n1 = 234; 
		int n2 = -123; 
		int n3 = 120 ;
		int n4 = Integer.MAX_VALUE; 
		int n5 = Integer.MIN_VALUE;
		int n6 = 0; 
		System.out.println("The Result of Test 1 is "+reverse(n1));
		System.out.println("The Result of Test 2 is "+reverse(n2));
		System.out.println("The Result of Test 3 is "+reverse(n3));
		System.out.println("The Result of Test 4 is "+reverse(n4));
		System.out.println("The Result of Test 5 is "+reverse(n5));
		System.out.println("The Result of Test 6 is "+reverse(n6));

	}
	



}