

import java.util.*; 

class LeetCode15{
	    public static List<List<Integer>> threeSum(int[] nums) {
					if(nums==null) return null ; 
					List<List<Integer>> listlist  = new LinkedList<>(); 
					
					HashMap<Integer, Integer> map= new HashMap<>(); 
					Arrays.sort(nums);
					Set<List<Integer>> numberListSet = new HashSet<List<Integer>>();
					for(int i=0 ; i<nums.length ;i++){
						map.put(i,nums[i]); 
					}
					int start = 0 ;
					int end = nums.length-1 ;
					while(start<end){
						int temp = 0-nums[start]-nums[end];
						System.out.println(temp);
						if(start>0&&nums[start]==nums[start-1]){
							if(nums[start]+nums[start-1]+nums[end]==0) {
								List<Integer> list = new LinkedList<>(); 
									list.add(nums[start]); 
									list.add(temp); 
									list.add(nums[end]);
									numberListSet.add(list); 
							}
							start++; 
							continue;
						}
						if(end<nums.length-2&&nums[end]==nums[end+1]){
							if(nums[end]+nums[end+1]+nums[start]==0) {
								List<Integer> list = new LinkedList<>(); 
									list.add(nums[start]); 
									list.add(temp); 
									list.add(nums[end]);
									numberListSet.add(list); 
							}
							end++; 
							continue;
						}
						if(temp<nums[start]||temp>nums[end]){ 
							start++;
							continue;
						} 
						if(map.containsValue(temp)){
									List<Integer> list = new LinkedList<>(); 
									list.add(nums[start]); 
									list.add(temp); 
									list.add(nums[end]);
									numberListSet.add(list); 
									end--; 
						} 
						start++;
					}
					
					listlist.addAll(numberListSet);
					return listlist; 
				
				
					
		}
		public static void main(String[] args){
				int[] n1 = {-1,0,1,2,-1,-4}; 
				int[] n2 = {0,-1,3,-2,1,3}; 
				int[] n3 = {0, 0 , 0 , 0}; 
				int[] n4 = {0,0,1,2,3,4,-4,-5,-6};				
				System.out.println("The result of test 1 is " + threeSum(n1));
				System.out.println("The result of test 2 is " + threeSum(n2)); 				
				System.out.println("The result of test 3 is " + threeSum(n3)); 
				System.out.println("The result of test 4 is " + threeSum(n4)); 
		}
	
}