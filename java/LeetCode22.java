/*
use recursive programming to solve the problem.
Runtime: 4 ms, faster than 10.36% of Java online submissions for Generate Parentheses.
Memory Usage: 37.1 MB, less than 99.67% of Java online submissions for Generate Parentheses.
*/
import java.util.*; 
class LeetCode22{
	
	public static List<String> generateParenthesis(int n) {
		List<String> result = new LinkedList<String>(); 
		solve(result,"",0,n); 
		return result; 
    }
	
	public static void  solve(List<String> liststring,String s,int position, int n ){
		if(s.length()==n*2){
			System.out.println(s);
			liststring.add(s); 
			return ; 
		}
		if(position==n) return ;
		System.out.println(s);
		Stack<Character> stack = new Stack<Character>();
		if(position<n) {
			s+='(';
			solve(liststring,s,position+1,n); 
		}  
		for(int i=0 ;i<s.length();i++){
			char ch = s.charAt(i); 
			//System.out.println(ch);
			if(ch=='('){
				stack.push(ch); 
			}else{
				stack.pop(); 
			}
		}
		while(!stack.empty()){
			char ch = stack.pop();
			//System.out.println(ch);
			if(ch=='('){
			s+=')'; 
			solve(liststring,s,position+1,n);
			}
		}
		
		
	}
	
	public static void main(String[] args){
		int n1 = 3; 
		List<String> list = generateParenthesis(n1); 
		for(int i=0 ;i<list.size();i++){
			System.out.println("The " + list.get(i));
		}
	}
}
