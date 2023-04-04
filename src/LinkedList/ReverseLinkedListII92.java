package LinkedList;

//https://leetcode.com/problems/reverse-linked-list-ii/description/
public class ReverseLinkedListII92 {
    //iteration method:
    public ListNode reverseBetween(ListNode head, int left, int right) {

        //if left and right are same then we don't need to reverse the linked list
        if(left == right)
            return head;

        //first place the two pointers at starting and prev node of the portion that need to reversed
        ListNode previous = null;
        ListNode current = head;
        while(left > 1){
            previous = current;
            current = current.next;
            left--;
            right--;
        }

        //create 2 pointers start , end and point them to previous and current respectively
        ListNode start = previous,end = current;
        //we need a 3rd pointer nextptr to traverse the linked list by changing the direction of link between current and previous
        ListNode nextptr = null;

        //do the reversal till the previous pointer reach the end of the portion that need to reversed
        while(right > 0){
            nextptr = current.next;
            current.next = previous;
            previous = current;
            current = nextptr;
            right--;
        }


        if(start != null){
            start.next = previous;
        }
        // else statement is used to handle the case where the portion of the linked list that needs to be reversed starts from the head node itself.
        // In this case, the start pointer would be null,so the head needs to be updated to point to the new head node
        // which is the previous node of the reversed portion.
        else{
            head = previous;
        }
        //is used to join the reversed portion of the linked list with the remaining portion of the linked list.
        end.next = current;

        return head;
    }































    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
