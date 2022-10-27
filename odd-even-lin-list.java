class Solution {

  public ListNode oddEvenList(ListNode head) {
    if (head == null) {
      return head;
    }
    ListNode temp1 = head;
    ListNode temp2 = head.next;
    ListNode odd = temp1, prevOdd = null, even = temp2, prevEven = null;
    while (odd != null && even != null && even.next != null) {
      odd.next = odd.next.next;
      prevOdd = odd;
      odd = odd.next;
      even.next = even.next.next;
      prevEven = even;
      even = even.next;
    }
    head = temp1;
    odd.next = temp2;
    return head;
  }
}
