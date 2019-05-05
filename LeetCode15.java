

import java.util.*; 

class LeetCode15{
	    public static List<List<Integer>> threeSum(int[] nums) {
					if(nums==null) return null ; 
					List<List<Integer>> newlist  = new LinkedList<>(); 
					List<Integer> list = new LinkedList<>(); 
					Arrays.sort(nums);
					int start = 0; 
					int end = nums.length -1 ;
					for(int i=0 ; i<nums.length ;i++){
						list.add(nums[i]); 
					}
					newlist.add(list); 
					return newlist; 
		}
		public static void main(String[] args){
				int[] n1 = {1,2,3,4,5}; 
				int[] n2 = {0,-1,3,-2,1,3}; 
				int[] n3 = {0, 0 , 0 , 0}; 
				int[] n4 = {};				
				System.out.println("The result of test 1 is " + threeSum(n1));
				System.out.println("The result of test 2 is " + threeSum(n2)); 				
				System.out.println("The result of test 3 is " + threeSum(n3)); 
				System.out.println("The result of test 4 is " + threeSum(n4)); 
		}
	
}