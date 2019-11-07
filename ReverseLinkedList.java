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
}