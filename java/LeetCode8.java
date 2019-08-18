class LeetCode8{
	public static int myAtoi(String str) {
		str = str.trim();
		if(str == null || str.length()<1){
			return 0 ; 
		}
		if(str.length()==1){
			if(!Character.isDigit(str.charAt(0))){
				return 0 ;
			}else{
				return Integer.valueOf(str.charAt(0)-'0');
			}
		}
		char fchar = str.charAt(0);
		char schar = str.charAt(1); 
		boolean negative = false ;
		int start = 0 ; 
		int pointer = 0 ; 
		if(fchar=='-') {
			negative = true;
			start = 1; 
			pointer++;
			if(!Character.isDigit(schar)) return 0; 
		}else if(fchar=='+') {
			negative = false;
			start =1 ;
			pointer++; 
			if(!Character.isDigit(schar)) return 0; 
		} else {
			if(!Character.isDigit(fchar)) return 0 ; 
		} 
		
		while(pointer<str.length()&&Character.isDigit(str.charAt(pointer))){
			pointer++; 
		}
		while(start<str.length()&&str.charAt(start)=='0'){
			start++; 	
		}
		
		int length = pointer-start; 
		if(length==0) return 0 ; 
		if(length>10&&negative){
			return Integer.MIN_VALUE; 
		}else if(length>10){
			return Integer.MAX_VALUE;
		}
		if(length==10&&negative){
			String str1 = str.substring(start,pointer); 
			if(str1.compareTo("2147483648")<0) {
				return Integer.valueOf(str.substring(0,pointer));
			}else{
				return Integer.MIN_VALUE; 
			}
		}else if(length==10){
			String str1 = str.substring(start,pointer); 
			if(str1.compareTo("2147483647")<0){
				return Integer.valueOf(str.substring(0,pointer));
			}else{
				return Integer.MAX_VALUE; 
			}
			
		}
		
		if(negative){
			return Integer.valueOf('-'+str.substring(start,pointer)); 
		}else{
			return Integer.valueOf(str.substring(start,pointer)); 
		}
		
    }
	
	
	public static void main(String[] args){
		String test1 =  "42312312312313123"; 
		String test2 =  "   -42"; 
		String test3 =  " 4193 with words"; 
		String test4 = "words and 987" ; 
		String test5 = "-9329847982374"; 
		String test6 = "+-1";
		String test7 = "-2147483647"; 
		String test8 = "+2147483647"; 
		String test9 = "1"; 
		String test10 = "000000123123"; 
		String test11 = "0000000 "; 
		System.out.println("The Result of Test 1 is "+myAtoi(test1));
		System.out.println("The Result of Test 2 is "+myAtoi(test2));
		System.out.println("The Result of Test 3 is "+myAtoi(test3));
		System.out.println("The Result of Test 4 is "+myAtoi(test4));
		System.out.println("The Result of Test 5 is "+myAtoi(test5));
		System.out.println("The Result of Test 6 is "+myAtoi(test6));
		System.out.println("The Result of Test 7 is "+myAtoi(test7));
		System.out.println("The Result of Test 8 is "+myAtoi(test8));
		System.out.println("The Result of Test 9 is "+myAtoi(test9));
		System.out.println("The Result of Test 10 is "+myAtoi(test10));
		System.out.println("The Result of Test 11 is "+myAtoi(test11));
		
		
	}
}