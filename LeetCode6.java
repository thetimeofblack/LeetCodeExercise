class LeetCode6 {
	public static String convert(String s, int numRows) {
		String newstring = "";
		if(s==null||s.length()<1) return null ;
		if(numRows<1) return s;   
		int fd = (numRows -2 )*2+2 ; 
		//firstrows 
		int totallength = s.length(); 
		for(int i=0;i<totallength;i+=fd){
			newstring+= s.charAt(i); 
		}
		//middlerows  
		
    }
	public static void main(String[] args){
		String teststring1 = "asdfasdfasdf"; 
		String teststring2 = "sdf"; 
		String teststring3 =  "PAYPALISHIRING"; 
		String teststring4 = "SFDOIUOIU";
		String teststring5 = "HAPPY NEW YEAR"; 
		
		int testrows1 = 3 ; 
		int testrows2 = 4 ; 
		int testrows3 = 5 ; 
		int testrows4 = 3 ;
		int testrows5 = 2 ; 
		System.out.println("The Result of Test 1 is " + convert(teststring1,testrows1)); 
		System.out.println("The Result of Test 2 is " + convert(teststring2,testrows2)); 
		System.out.println("The Result of Test 3 is " + convert(teststring3,testrows3)); 
		System.out.println("The Result of Test 4 is " + convert(teststring4,testrows4)); 
		System.out.println("The Result of Test 5 is " + convert(teststring5,testrows5)); 
	} 
} 