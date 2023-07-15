package LinkedList.Explore;

/*
1 . MyLinkedList() Initializes the MyLinkedList object.
2 . int get(int index) Get the value of the indexth node in the linked list. If the index is invalid, return -1.
3 . void addAtHead(int val) Add a node of value val before the first element of the linked list.
    After the insertion, the new node will be the first node of the linked list.
4. void addAtTail(int val) Append a node of value val as the last element of the linked list.
5. void addAtIndex(int index, int val) Add a node of value val before the indexth node in the linked list.
   If index equals the length of the linked list, the node will be appended to the end of the linked list.
   If index is greater than the length, the node will not be inserted.
6. void deleteAtIndex(int index) Delete the indexth node in the linked list, if the index is valid.
 */

public class DesignSLL {
    class Node{
        int val;
        Node next;
        Node(int x){
            this.val = x;
        }
    }
    int length;
    Node head;
    public DesignSLL() {
        this.length = 0;
        this.head = null;
    }

    public int get(int index) {
        if(index < 0 || index >= this.length){
            return -1;
        }
        else{
            int counter = 0;
            Node temp = head;
            while (counter <= index){
                temp=temp.next;
            }
            return temp.val;
        }
    }

    public void addAtHead(int val) {
        Node newHead = new Node(val);
        newHead.next = this.head;
        this.head = newHead;
        this.length++;
    }

    public void addAtTail(int val) {
        if(this.head == null && this.length == 0)
            addAtHead(val);
        Node temp = this.head;
        Node newNode = new Node(val);
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = null;
        this.length++;
    }

    public void addAtIndex(int index, int val) {
        if(index == this.length)
            addAtTail(val);
        else{
            Node temp = this.head;
            Node newNode = new Node(val);
            int counter = 0;
            while (counter != index){
                temp = temp.next;
                counter++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            this.length++;
        }
    }

    public void deleteAtIndex(int index) {
        if(index <= this.length && index >=0){
            Node temp = this.head;
            int counter = 0;
            while (counter != index){
                temp = temp.next;
                counter++;
            }
            temp.next = temp.next.next;
            this.length--;
        }
    }
}
