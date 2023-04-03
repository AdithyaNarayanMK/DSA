package LinkedList;

public class BinaryToIntegerInLL1290 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public int getDecimalValue(ListNode head) {
        ListNode temp = new ListNode();
        temp = head;
        StringBuilder binaryNumber = new StringBuilder();
        while(temp.next != null){
            binaryNumber.append(temp.val);
            temp = temp.next;
        }

        return Integer.parseInt(binaryNumber.toString(),2);
    }
}
