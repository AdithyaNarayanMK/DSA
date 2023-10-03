package LeetCodeContest.WeeklyContest358;

import java.math.BigInteger;

public class DoubleaNumberRepresentedasaLinkedList {

//      Definition for singly-linked list.
      public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) {
              this.val = val;
          }
          ListNode(int val, ListNode next) {
              this.val = val;
              this.next = next;
          }
      }
    public ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        StringBuilder num = new StringBuilder();
        while(temp != null){
            num.append(temp.val);
            temp = temp.next;
        }
        BigInteger originalNum = new BigInteger(num.toString());
        BigInteger doubledNum = originalNum.multiply(BigInteger.valueOf(2));

        String ans = doubledNum.toString();

        ListNode newHead = new ListNode(Character.getNumericValue(ans.charAt(0)));
        ListNode currentHead = newHead;

        for(int i = 1;i<ans.length();i++){
            ListNode node = new  ListNode(Character.getNumericValue(ans.charAt(i)));
            currentHead.next = node;
            currentHead = currentHead.next;
        }

        return newHead;
    }

//    public ListNode doubleItAnotherMethod(ListNode){
//
//
//
//          return null;
//    }

}
