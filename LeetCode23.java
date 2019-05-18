class LeetCode23{
	public ListNode mergeKLists(ListNode[] lists) {
        ListNode newhead = new ListNode(Interger.MAX_VALUE);
		if(list.length<1) return null ; 
		int length = lists.length; 
		ListNode min  = newhead; 
		while(1){
			boolean flag = false ; 
			for(int i=0;i<lists.length;i++){
			
				ListNode cur = lists.get(i); 
				if(cur.next==null) continue;
				flag = true; 
				if(cur.val<min.val){
					min = cur ;
					cur = cur.next; 
				}
		}
		if(!flag) break ;
		ListNode next = ListNode(Integer.MAX_VALUE); 
		min.next =  next;
		 
		}
		return newhead; 
	}
	
	public static boolean judgeEnd(ListNode[] lists){
			
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