/*
Runtime: 28 ms, faster than 60.47% of Java online submissions for 4Sum.
Memory Usage: 38.1 MB, less than 88.11% of Java online submissions for 4Sum.
Next challenges:
*/

import java.util.*; 
class LeetCode18{
	
	public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums); 
		List<List<Integer>> result = new LinkedList<>(); 
		Set<List<Integer>> set = new HashSet<>(); 
		for(int i= 0; i<nums.length;i++){
			for(int j=i+1; j<nums.length;j++){
				int start = j+1; 
				int end = nums.length - 1; 
			while(start<end){
				int sum = nums[i]+nums[j]+nums[start]+nums[end]; 
				
				if(sum>target) {
					end--;
				}else if(sum==target){
					List<Integer> list = new LinkedList<>(); 
					list.add(nums[i]); 
					list.add(nums[j]);
					list.add(nums[start]);
					list.add(nums[end]);
					set.add(list); 
					end--;
				} else{
					start++; 
				}
			}
			}
		}
		result.addAll(set); 
		return result ; 
    }
	public static void main(String[] args){
		int[] n1 = {1,2,3,-1,-2,-3}; 
		int t1 = 0 ;
		List<List<Integer>> list = fourSum(n1,t1); 
		list.forEach((l)->{
			l.forEach((n)->{
				System.out.print(n+" ");
			});
			System.out.println(); 
		});
	}
}