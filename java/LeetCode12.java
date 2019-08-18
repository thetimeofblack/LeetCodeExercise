/*
Runtime: 19 ms, faster than 54.34% of Java online submissions for Integer to Roman.
Memory Usage: 36.3 MB, less than 100.00% of Java online submissions for Integer to Roman.
*/

class LeetCode12{
	public static String intToRoman(int num) {
        int cnum = num ; 
		String result = ""; 
		if(cnum>=1000){
			int n ; 
			n = cnum/1000; 
			for(int i= 0 ;i<n;i++) result += 'M';
			cnum -= n*1000; 	
		}
		if(cnum>=900){
			result+="CM"; 
			cnum-=900; 
		}
		if(cnum>=500){
			result+="D";
			cnum-=500;
			
		}
		if(cnum>=400){
			result+="CD"; 
			cnum-=400; 
		}
		if(cnum>=100){ 
			int n ; 
			n = cnum/100; 
			for(int i= 0 ;i<n;i++) result += 'C';
			cnum -= n*100; 
		}
		if(cnum>=90){
			result+="XC"; 
			cnum-=90; 
		}
		if(cnum>=50){
			result+="L"; 
			cnum-=50; 
		}
		if(cnum>=40){
			result+="XL"; 
			cnum-=40; 
		}
		if(cnum>=10){
			int n ; 
			n = cnum/10; 
			for(int i= 0 ;i<n;i++) result += 'X';
			cnum -= n*10; 
		}
		if(cnum>=9){
			result+="IX"; 
			cnum-=9; 
		}
		if(cnum>=5){
			result+="V"; 
			cnum-=5; 
		}
		if(cnum>=4){
			result+="IV"; 
			cnum-=4; 
		}
		if(cnum>=1){
			int n =cnum; 
			for(int i=0 ;i<n;i++) result+='I'; 
			cnum-=n; 
		}
		if(cnum==0) System.out.println("yes"); 
		return result; 
    }
	public static void main(String[] args){
		int num1 = 3999; 
		int num2 = 19; 
		int num3 = 1994; 
		int num4 = 58; 
		int num5 = 4; 
		System.out.println("The Result of Test 1 is "+intToRoman(num1)); 
		System.out.println("The Result of Test 2 is "+intToRoman(num2)); 
		System.out.println("The Result of Test 3 is "+intToRoman(num3)); 
		System.out.println("The Result of Test 4 is "+intToRoman(num4));
		System.out.println("The Result of Test 5 is "+intToRoman(num5));


	}
	
}