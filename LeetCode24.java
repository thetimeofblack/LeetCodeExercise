/*
There are many problems with the test code 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
Memory Usage: 33.7 MB, less than 100.00% of Java online submissions for Swap Nodes in Pairs.

*/

class LeetCode24{
	public static ListNode swapPairs(ListNode head) {
        ListNode result = new ListNode(-1); 
		result.next = head ;
		ListNode pre = result ; 
		ListNode mid = head ; 
		ListNode lat = head.next ;
		
		 
		while(pre!=null&&mid!=null&&lat!=null){
			//System.out.println("The pre "+pre.val+" The mid "+mid.val+"The lat "+lat.val); 
			pre.next = lat;
			mid.next = lat.next ; 
			lat.next = mid ; 
			
			 
			if(mid.next==null||mid.next.next==null) break; 
			pre = mid ; 
			mid = mid.next;
			lat = mid.next;
			//System.out.println("The pre "+pre.val+" The mid "+mid.val+"The lat "+lat.val);
			
		}
		return result.next; 
    }
	
	public static ListNode createNewListNode(int[] nums){
		if(nums.length<1) return null; 
		ListNode head = new ListNode(nums[0]);
		ListNode cur = head;  
		for(int i= 1 ;i<nums.length;i++){
			ListNode next = new ListNode(nums[i]); 
			cur.next = next;
			cur = cur.next; 
		}	
		return head; 
	}
	
	public static void printListNode(ListNode head){
		if(head == null) {
			System.out.println("The ListNode is empty"); 
			return ;
		}
		if(head.next == null) {
			System.out.println("The ListNode is a single node, the value is "+head.val);
			return ;
		}
		System.out.println("The value is listed as follows: "); 
		while(head.next!=null){
			System.out.print(head.val +" "); 
			head = head.next; 
		}
	}
	
	public static void main(String[] args){
		int[] n1 = {1,2,3,4,5,6,6,8}; 
		int[] n2 = {2,3,4,5,6,6,9,10}; 
		ListNode h1 = createNewListNode(n1); 
		ListNode h2 = createNewListNode(n2);
		ListNode r1 = swapPairs(h1); 
		ListNode r2 = swapPairs(h2); 
		printListNode(r1); 
		printListNode(r2); 
		
	}
	
	
}