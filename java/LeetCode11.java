/*

Runtime: 697 ms, faster than 5.04% of Java online submissions for Container With Most Water.
Memory Usage: 37.7 MB, less than 95.02% of Java online submissions for Container With Most Water.
Next challenges:
*/

class LeetCode11{
	public static int maxArea(int[] height) {
		int len = height.length - 1; 
		int result = 0 ; 
		while(len>=1){
			int tempma= 0 ;  
			
			for(int i= 0 ;(i+len)<height.length;i++){
				
				if((i+len)>height.length-1) break; 
				int temp = 0; 
				if(height[i]>height[i+len]){
					
					temp = len*height[i+len]; 
				}else{
					temp = len*height[i]; 
				}
				if(temp>=tempma) tempma = temp ; 
			
			} 
			if(result<=tempma) result = tempma;  
			len--;
		}
		return result ; 
    }
	
	public static void main(String[] args){
		int[] h1 = {1,2,3,4,5}; 
		int[] h2 = {1,8,6,2,5,4,8,3,7}	; 
		System.out.println("The Result of Test 1 is "+maxArea(h1)); 
		System.out.println("The Result of Test 2 is "+maxArea(h2)); 
	
	}
	
}