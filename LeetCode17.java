
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
		result.add("hello"); 
		return result; 
	}
	
	public static void solve(String digits,HashMap<Character,List<Character>> map, int position){
		
	}
	
	public static void main(String[] args){
		List<String> list = new LinkedList<String>(); 
		String d1 = "23"; 
		list = letterCombinations(d1); 
		for(int i= 0 ;i<list.size(); i++){
			System.out.println(list.get(i)); 
		}
	}
	
	
}