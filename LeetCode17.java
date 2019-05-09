/*
Runtime: 32 ms, faster than 8.05% of Java online submissions for Letter Combinations of a Phone Number.
Memory Usage: 35.3 MB, less than 89.31% of Java online submissions for Letter Combinations of a Phone Number.
Next challenges:
*/
import java.util.*; 
class LeetCode17{
	public static List<String> letterCombinations(String digits){
		List<String> result = new LinkedList<String>(); 
		HashMap<Character, List<Character>> map = new HashMap<>(); 
		
		map.put('2',Arrays.asList('a','b','c'));
		map.put('3',Arrays.asList('d','e','f')); 
		map.put('4',Arrays.asList('g','h','i')); 
		map.put('5',Arrays.asList('j','k','l')); 
		map.put('6',Arrays.asList('m','n','o')); 
		map.put('7',Arrays.asList('p','q','r','s')); 
		map.put('8',Arrays.asList('t','u','v'));
		map.put('9',Arrays.asList('w','x','y','z'));
		if(digits.isEmpty()) return result; 
		solve(digits, "",map , 0, result);
		return result; 
	}
	
	public static void solve(String digits,String currentstring, HashMap<Character,List<Character>> map, int position,List<String> result){
		char ch = digits.charAt(position);
		List<Character> chlist = map.get(ch); 
		if(position==digits.length()-1) {
			chlist.forEach((letter)->{
				result.add(currentstring+letter);
			});
		}else{
		
		chlist.forEach((letter)->{
			solve(digits,currentstring+letter,map,position+1,result);  
		}); 
		}
	}
	
	public static void main(String[] args){
		List<String> list = new LinkedList<String>(); 
		String d1 = "23";
		String d2 = "22333"; 
		
		list = letterCombinations(d1); 
		for(int i= 0 ;i<list.size(); i++){
			System.out.println(list.get(i)); 
		}
		list = letterCombinations(d2); 
		for(int i= 0 ;i<list.size(); i++){
			System.out.println(list.get(i)); 
		}
	}
	
	
}