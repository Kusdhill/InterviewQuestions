class MergeTwoLists{
	public static ListNode(ListNode l1, ListNode l2){
		ListNode l3(0);
		ListNode dummy = l3;
		while(l1!=null || l2!=null){
			if(l1!=null && l2!=null){
				if(l1.val<l2.val){
					l3.next = l1.val;
					l1 = l1.next;
				}else{
					l3.next = l2.val;
					l2 = l2.next;
				}
			}else if(l1!=null){
				l3.next = l1.val;
				l1 = l1.next;
			}else{
				l3.next = l2.val;
				l2 = l2.next;
			}
		}
		return dummy.next;
	}

	public static void main(String[] args){
		System.out.println("I still need to implement ListNode class");
	}

}