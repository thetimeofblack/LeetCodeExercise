class LeetCode25{
	public ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = new ListNode(-1);
		result.next = head ; 
		ListNode start = result; 
		while()
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
		System.out.print(head.val +" "); 
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