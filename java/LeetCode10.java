class LeetCode10{
	/*
		The code should be eligible for any test case including some strange case.
	
	*/
	
	public static boolean isMatch(String s, String p){
		//for special null string 
		
		
		boolean [][] dp = new boolean[s.length()+1][p.length()+1];
		for(int i= 0 ;i <=s.length();i++){
			for(int j=0 ; j<p.length();j++){
				dp[i][j] = false; 
			}
		}
		dp[0][0] = true; 
		
		for(int i = 0 ;i<=s.length(); i++){
			for(int j = 1 ; j<=p.length(); j++){
			 if(i>0&&(s.charAt(i-1) == p.charAt(j-1)||p.charAt(j-1) == '.')) {
				 dp[i][j]= dp[i-1][j-1];
				 System.out.println("step1:dp "+i+" "+j+" is "+dp[i][j]); 
			 }
			 if(p.charAt(j-1) == '*'){
				if(i==0||(s.charAt(i-1)!=p.charAt(j-2)&&p.charAt(j-2)!='.')){
					dp[i][j] = dp[i][j-2];
					System.out.println("step2:dp "+i+" "+j+" is "+dp[i][j]);					
				}else{
					dp[i][j] = dp[i-1][j]||dp[i][j-1]||dp[i][j-2];
					System.out.println("step3:dp "+i+" "+j+" is "+dp[i][j]);
				}
				 
			 } 
			}
		}
		return dp[s.length()][p.length()]; 
		
	}
	
	public static void main(String[] args){
		
		String s1 = "abcde" ; 
		String p1 = ".*";  //true 
		String s2 = "aa"; 
		String p2 = "a";  // false 
		String s3 = "aa"; 
		String p3 = "a*";  // true
		String s4 = "aab"; 
		String p4 = "c*a*b";  //true  
		String s5 = "mississippi"; 
		String p5 = "mis*is*p*."; //false
		String s6 = "sss"; 
		String p6 = "sss";  //true
		String s7 = "ab"; 
		String p7 = ".*";    //true
		String s8 = "  " ;  
		String p8 = ".*.*.*.*";   //false 
		
		System.out.println("The result of test 1 is "+isMatch(s1,p1)); 
		System.out.println("The result of test 2 is "+isMatch(s2,p2)); 
		System.out.println("The result of test 3 is "+isMatch(s3,p3)); 
		System.out.println("The result of test 4 is "+isMatch(s4,p4)); 
		System.out.println("The result of test 5 is "+isMatch(s5,p5)); 
		System.out.println("The result of test 6 is "+isMatch(s6,p6)); 
		System.out.println("The result of test 7 is "+isMatch(s7,p7)); 
		System.out.println("The result of test 8 is "+isMatch(s8,p8)); 

	}
	
	
}