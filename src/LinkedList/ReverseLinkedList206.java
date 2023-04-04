package LinkedList;


//https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseLinkedList206 {
    public ListNode reverseList(ListNode head) {
        //iterative method

        //if linkedList is Empty return the head
        if (head == null) {
            return head;
        }
        //creating three pointers previous = null , present = head  next = previous.next
        ListNode previous = null;
        ListNode present = head;
        ListNode next = present.next;

        while(present != null){
            present.next = previous;
            previous = present;
            present = next;
            if(next != null)
                next = next.next;
        }
        //return previous as at last iteration present = null and previous is equal to last node in linkedList
        return previous;
    }



























    private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
