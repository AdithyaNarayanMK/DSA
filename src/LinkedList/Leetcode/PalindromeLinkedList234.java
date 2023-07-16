package LinkedList.Leetcode;

import java.util.Stack;

public class PalindromeLinkedList234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();

        ListNode temp = head;
        if(temp == null){
            return false;
        }else{
            stack.push(temp.val);
        }

        while(temp.next != null){
            temp = temp.next;
            if(stack.peek() == temp.val){
                stack.pop();
            }else{
                stack.push(temp.val);
            }
        }

        return stack.isEmpty();
    }


    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
