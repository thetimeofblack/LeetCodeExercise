class LeetCode19{
	public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head ; 
		ListNode slow = head ; 
		while(cnode.next!=null){
			fast = fast.next; 
			if(n==0) slow = slow.next; 
			n--; 
		}
		
		
    }
	public static void main(String[] args){
		ListNode cnode = new ListNode(0); 
		ListNode head = cnode; 
		for(int i= 1 ;i < 10 ;i++){
			ListNode node = new ListNode(i); 
			cnode.next = node; 
			cnode = head.next ;
		}
	}
}

