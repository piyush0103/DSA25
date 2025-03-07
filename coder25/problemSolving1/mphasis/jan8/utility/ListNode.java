package coder25.problemSolving1.mphasis.jan8.utility;

public class ListNode {
   public int val;
    public ListNode next;
    public ListNode head;
    public ListNode tail;
    public ListNode newNode;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return iterateval() + " ]";
    }

    private String iterateval() {
        String str = "[ ";
        newNode = head;
        while (newNode != null) {
            str += " " + newNode.val;
            newNode = newNode.next;
        }
        return str;
    }

    public void add(int val) {
        newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            tail = head;
        }
        tail.next = newNode;
        tail = newNode;
    }
}
