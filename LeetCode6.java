class LeetCode6 {
	/*
	only defeat 41.05% 
	bound decision is not clear 
	
	*/
	
	public static String convert(String s, int numRows) {
		String newstring = "";
		
		if(s==null||s.length()<1) return "" ;
		if(numRows>=s.length()) return s; 
		if(numRows<1) return "";
		if(numRows == 1) return s; 
		int n = numRows - 1 ; 
		s = s.trim(); 
		//System.out.println("The length of s is "+ s.length());
		//first row		
		for(int i=0 ;i<s.length();i+=2*n){
			newstring += s.charAt(i);
			//System.out.println("The index of string is "+i);
			
		}
		//median rows
		for(int i=1 ;i<n;i++){
			for(int j = 1 ;;j++){
				
				int bound1 = j/2*2*n - i; 
				int bound2 = j/2*2*n + i;				
				if(j==1) {
					if(i>=s.length()) break; 
					newstring+=s.charAt(i);
					//System.out.println("The index of string is "+i);
				}else if(j%2==1){
					if(bound2>=s.length()) break;
					newstring+=s.charAt(bound2); 
					//System.out.println("The index of string is "+bound2);
				}else{
					if(bound1>=s.length()) break;
				    newstring+=s.charAt(bound1); //k=1 ,2, 2, 4, 4, 6 , 6
					//System.out.println("The index of string is "+bound1);
	
				}
				 
				
			}
		}
		//last rows
		for(int i=n ;i<s.length() ; i+=2*n){
			newstring+=s.charAt(i); 
			//System.out.println("The index of string is "+i);

		}
		return newstring;   
		
    }
	public static void main(String[] args){
		String teststring1 = "asdfasdfasdf"; 
		String teststring2 = "sdf"; 
		String teststring3 =  "PAYPALISHIRING"; 
		String teststring4 = "PAYPALISHIRING";
		String teststring5 = "HAPPY NEW YEARsdfasfsadf"; 
		String teststring6 = "asdfasdf"; 
		int testrows1 = 3 ; 
		int testrows2 = 4 ; 
		int testrows3 = 3 ; 
		int testrows4 = 4 ;
		int testrows5 = 5 ; 
		int testrows6 = 1 ;
		System.out.println("The Result of Test 1 is " + convert(teststring1,testrows1)); 
		System.out.println("The Result of Test 2 is " + convert(teststring2,testrows2)); 
		System.out.println("The Result of Test 3 is " + convert(teststring3,testrows3)); 
		System.out.println("The Result of Test 4 is " + convert(teststring4,testrows4)); 
		System.out.println("The Result of Test 5 is " + convert(teststring5,testrows5)); 
		System.out.println("The Result of Test 6 is " + convert(teststring6,testrows6)); 

	} 
} 