class ReverseLinkedList{
	public static ListNode reverseLinkedList(ListNode head){
		ListNode dummyHead = null;
		while(head!=null){
			ListNode next = head.next;
			head.next = dummyHead;
			dummyHead = head;
			head = next;
		}
		
		return dummyHead;
	}

	public static ListNode recursiveReverseLinkedList(ListNode head){
		if(head == null || head.next == null) return head;
		ListNode node = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return node;
	}
}