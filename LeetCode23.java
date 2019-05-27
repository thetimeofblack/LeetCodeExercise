class LeetCode23{
	public static ListNode mergeKLists(ListNode[] lists) {
        ListNode result = new ListNode(0);
		if(lists==null||lists.length<1) return null ; 
		ListNode head = result ; 
		while(true){
			int min_val = Integer.MAX_VALUE;  
			int position = 0 ; 
			for(int i=0;i<lists.length;i++){
				if(lists[i]==null) continue; 
				int cur_val = lists[i].val; 
				if(min_val>=cur_val) {
					min_val = cur_val; 
					position = i ; 
				}
			}
			
			if(min_val==Integer.MAX_VALUE&&lists[position]==null) break ;
			
			ListNode newNode = new ListNode(min_val); 
			head.next = newNode; 
			head = head.next; 
			lists[position] = lists[position].next; 
		 
		}
		return result.next; 
	}
	
	public static boolean judgeEnd(ListNode[] lists){
			return true; 
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
		int[] n3 = {0,1,3,4,5,6,8,8,9,10}; 
		int[] n4 = {1,2,3,3,3,3,3,4,9}; 
		ListNode h1 = createNewListNode(n1); 
		ListNode h2 = createNewListNode(n2); 
		ListNode h3 = createNewListNode(n3); 
		ListNode h4 = createNewListNode(n4); 
		ListNode[] lists = new ListNode[4]; 
		lists[0] = h1;
		lists[1] = h2 ;
		lists[2] = h3 ;
		lists[3] = h4; 
		ListNode result = mergeKLists(lists); 
		printListNode(result); 
			
		
		
		
	}
	
}