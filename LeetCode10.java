class LeetCode10{
	public static boolean isMatch(String s, String p){
		if(!s.length()&&!p.length()) return true; 
		if(!p.length()&&s.length()>0) return false; 
		boolean [][] dp = new boolean[s.length()+1][p.length()+1];
		dp[0][0] = true; 
		dp[1][1] = s.charAt(0)==p.charAt(0) || p.charAt(0) == '.' ; 
		for(int i=0 ; i<p.length()+1;i+=2){
			if(p.charAt(i)==s.charAt(0)&&p.charAt(i+1) == '*') dp[0][i+2] = dp[0][i]; 
		}
		
		for(int i = 1 ;i<s.length()+1; i++){
			for(int j = 1 ; j<p.length()+1; j++){
			 if(s.charAt(i) == p.charAt(j)||p.charAt(j) == '.') {
				 dp[i+1][j+1]= dp[i][j];
				 if(j>=1){
					 dp[i][j] = dp[i][j-1]; 
				 }
			 }else if(p.charAt(j) == '.'){
				 dp[i][j] = true; 
			 } 
			  
			}
		}
		return dp[s.length()][p.length()]; 
		
	}
	
	public static void main(String[] args){
		
		String s1 = "abcde" ; 
		String p1 = ".*"; 
		String s2 = "aa"; 
		String p2 = "a"; 
		String s3 = "aa"; 
		String p3 = "a*"; 
		String s4 = "aab"; 
		String p4 = "c*a*b"; 
		String s5 = "mississippi"; 
		String p5 = "mis*is*p*."; 
		String s6 = "sss"; 
		String p6 = "sss"; 
		System.out.println("The result of test 1 is "+isMatch(s1,p1)); 
		System.out.println("The result of test 2 is "+isMatch(s2,p2)); 
		System.out.println("The result of test 3 is "+isMatch(s3,p3)); 
		System.out.println("The result of test 4 is "+isMatch(s4,p4)); 
		System.out.println("The result of test 5 is "+isMatch(s5,p5)); 
		System.out.println("The result of test 6 is "+isMatch(s6,p6)); 
		
	}
	
	
}