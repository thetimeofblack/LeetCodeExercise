/*
Runtime: 4 ms, faster than 98.50% of Java online submissions for 3Sum Closest.
Memory Usage: 35.5 MB, less than 98.09% of Java online submissions for 3Sum Closest.
*/
import java.util.*;
class LeetCode16{
	public static int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums); 
		int result =nums[0]+nums[1]+nums[2]; 
		int distance  =Integer.MAX_VALUE ; 
		for(int i=0 ;i<nums.length;i++){
			int start = i+1 ;
			int end = nums.length-1; 
			while(start<end){
				int sum = nums[start]+nums[end]+nums[i]; 
				 
				int td = sum-target; 
				System.out.println("i:"+i+"start:"+start+"end:"+end+"td:"+td);
				if(distance>=Math.abs(td)){
					System.out.println(distance); 
					distance = Math.abs(td) ; 
					if(td==0) return target ; 
					result = sum ;
				}
				if(td>0){
					end--; 
					continue;
				}
				start++;
			}
		}
		return result; 
	}
	public static void main(String[] args){		
		int[] n1 = {-1, 2, 1, -4}; 
		int[] n2 = {0,-1,3,-2,1,3}; 
		int[] n3 = {0, 0 , 0 , 0}; 
		int[] n4 = {0,0,1,2,3,4,-4,-5,-6};	
		int t1 = 1; 
		int t2 = 2; 
		int t3 = 0 ; 
		int t4 = 2; 
		System.out.println("The result of test 1 is " + threeSumClosest(n1,t1));
		System.out.println("The result of test 2 is " + threeSumClosest(n2,t2)); 				
		System.out.println("The result of test 3 is " + threeSumClosest(n3,t3)); 
		System.out.println("The result of test 4 is " + threeSumClosest(n4,t4)); 
	}
	
}