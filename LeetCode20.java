/*
Runtime: 2 ms, faster than 81.99% of Java online submissions for Valid Parentheses.
Memory Usage: 33.2 MB, less than 100.00% of Java online submissions for Valid Parentheses.
*/

import java.util.*;
class LeetCode20{
	public static  boolean isValid(String s) {
        Stack<Character> st =  new Stack<Character>();
		s = s.trim(); 
		if(s==null||s.length()<1){
			return true ;
		}
		if(s.length()==1) return false;
		for(int i=0;i<s.length();i++){
			
			char ch = s.charAt(i); 
			if(ch=='('||ch=='['||ch=='{'){
				st.push(ch); 

			}else if(ch==')'){
				if(st.empty()) return false; 
				char ch2 = st.pop(); 
				if(ch2=='(') {
					continue ;
				}else{
					return false; 
				}
			}else if(ch==']'){
				if(st.empty()) return false; 
				char ch2 = st.pop(); 
				if(ch2=='['){
					continue; 
				}else{
					return false; 
				}
			}else{
				if(st.empty()) return false; 
				char ch2 = st.pop(); 
				if(ch2=='{'){
					continue; 
				}else{
					return false; 
				}
			}
		}
		
		return true&&st.empty(); 
    }
	
	public static void main(String[] args){
		String s1 = "()()"; 
		String s2 = " ";
		String s3 = "[(()())]"; 
		String s4 = "[(])"; 
		System.out.println("The result of test 1 is "+isValid(s1)); 
		System.out.println("The result of test 2 is "+isValid(s2)); 
		System.out.println("The result of test 3 is "+isValid(s3)); 
		System.out.println("The result of test 4 is "+isValid(s4)); 
	
		
	}
}
	
