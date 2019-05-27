import java.util.*;
class LeetCode23_2{
		private static Comparator<ListNode> comp = new Comparator<ListNode>(){
			@Override 
			public int compare(ListNode o1, ListNode o2){
				//ToDo Auto-generated method stub 
				return o1.val - o2.val ; 
			}
		};
		
		public static ListNode mergeKLists(ListNode[] lists) {
			ListNode result = new ListNode(0); 
			ListNode head = result; 
			PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length,comp); 
			for(int i = 0 ; i<lists.length; i++){
				while(lists[i]!=null){
					queue.offer(lists[i]); 
					lists[i] = lists[i].next; 
				}
			}
			
			while(!queue.isEmpty()){
				ListNode cur_node = queue.poll(); 
				head.next = cur_node;
				head = head.next; 
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