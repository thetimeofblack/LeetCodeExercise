/*
Runtime: 1 ms, faster than 61.04% of Java online submissions for Reverse Nodes in k-Group.
Memory Usage: 35.8 MB, less than 99.98% of Java online submissions for Reverse Nodes in k-Group.
*/
class LeetCode25{
	public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode result = new ListNode(-1);
		result.next = head ; 
		ListNode start = result; 
		ListNode Node = head; 
		boolean isfirstGroup = true; 
		boolean midend = false ; 
		while(Node!=null){
			ListNode nextNode = Node; 
			ListNode firstNode = Node ; 
			ListNode preNode = start; 
			
			for(int i = 0 ;i<k ;i++){
			
			nextNode = Node.next; 
			Node.next = preNode; 
			preNode = Node; 
			Node = nextNode; 
			if(Node==null&&i!=k-1) {
				midend =true; 
				Node = preNode ;
				preNode = preNode.next; 
				ListNode prepreNode = preNode.next; 
				Node.next = null ; 
				while(i>=0){
					i--; 
					preNode.next= Node ; 
					Node = preNode; 
					preNode = prepreNode; 
					prepreNode = prepreNode.next ; 
				}
				break;
			} 
			}
			if(midend) break; 
			if(isfirstGroup){
				result.next  = preNode ; 
				isfirstGroup = false; 
			}
			firstNode.next=Node; 
			start.next = preNode; 
			start = firstNode; 
			
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
		System.out.print(head.val +" "); 
	}
	
	public static void main(String[] args){
		int[] n1 = {1,2,3,4,5,6,6,8}; 
		int[] n2 = {2,3,4,5,6,6,9,10}; 
		ListNode h1 = createNewListNode(n1); 
		ListNode h2 = createNewListNode(n2);
		ListNode r1 = reverseKGroup(h1,3); 
		ListNode r2 = reverseKGroup(h2,4); 
		printListNode(r1); 
		printListNode(r2); 
		
	}
	
	
}