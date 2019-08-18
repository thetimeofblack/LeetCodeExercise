/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Nth Node From End of List.
Memory Usage: 34 MB, less than 100.00% of Java online submissions for Remove Nth Node From End of List.
*/

class LeetCode19{
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode chead =head; 
		ListNode fast = head ; 
		ListNode slow = head ;
		int i = 0 ;
		
		if(head.next==null && n==1) {
			return null; 
		}
		
		while(fast.next!=null){
			fast = fast.next; 
			if(i>=n) slow = slow.next; 
			i++;  
		}
		if(i<n) return slow.next;
		ListNode next = slow.next.next;
		slow.next = null; 
		slow.next = next; 
		return chead ;         
		
    }
	public static void main(String[] args){
		ListNode cnode = new ListNode(0); 
		ListNode head = cnode; 
		for(int i= 1 ;i < 10 ;i++){
			ListNode node = new ListNode(i); 
			cnode.next = node; 
			cnode = cnode.next ;
		}
		removeNthFromEnd(head,4); 
		ListNode index = head; 
		while(index.next!=null){
			System.out.println(index.val); 
			index = index.next ;
		}
		System.out.println(index.val); 
	}
}

