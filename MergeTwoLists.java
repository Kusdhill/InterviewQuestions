class MergeTwoLists{
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		ListNode l3 = new ListNode(-1);
		ListNode dummy = l3;
		while(l1!=null || l2!=null){
			if(l1!=null && l2!=null){
				if(l1.val<l2.val){
					l3.next = l1;
					l1 = l1.next;
				}else{
					l3.next = l2;
					l2 = l2.next;
				}
			}else if(l1!=null){
				l3.next = l1;
				l1 = l1.next;
			}else{
				l3.next = l2;
				l2 = l2.next;
			}
			l3 = l3.next;
		}
		return dummy.next;
	}

	public static void main(String[] args){
		// construct first linked list
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);

		// construct second linked list
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);

		mergeTwoLists(l1, l2);
	}

}