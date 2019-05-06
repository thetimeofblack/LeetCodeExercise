

import java.util.*; 

class LeetCode15{
	    public static List<List<Integer>> threeSum(int[] nums) {
			Arrays.sort(nums);
			List<List<Integer>> listlist = new LinkedList<List<Integer>>();
			HashSet<List<Integer>> set = new HashSet<List<Integer>>();
			/* depends on the set search algorithm efficiency */
			for(int i=0;i<nums.length;i++)
			{
				for(int j=i+1,k=nums.length-1;j<k;)
				{
					if(nums[i]+nums[j]+nums[k]==0)
					{		
						List<Integer> l= new LinkedList<Integer>();
						l.add(nums[i]);
						l.add(nums[j]);
						l.add(nums[k]);
					if(set.add(l))
						listlist.add(l);
						j++;
						k--;
					}
					else if(nums[i]+nums[j]+nums[k]<0)
						j++;
					else
						k--;
				}
			}
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