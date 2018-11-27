public class InsertionSortList {

	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) {val = x;}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
   static public ListNode insertionSortList(ListNode head) {
        
	   if(head == null || head.next == null) return head;
	   
	   ListNode newHead = new ListNode(0), x = head;
	   newHead.next = head;
	   
	   while(x.next != null){
		   if (x.val <= x.next.val){
			   x = x.next;
		   } else {
			   ListNode temp = x.next, n  = newHead;
			   x.next = x.next.next;
			   while (n.next.val < temp.val){
				   n = n.next;
			   }
			   temp.next = n.next;
			   n.next = temp;
		   }
	   }
	   
	   return newHead.next;
        
    }

}
