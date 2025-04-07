class ListNode {
  int val;
  ListNode next;

  ListNode(int val) {
    this.val = val;
  }
}

public class LinkedListExample {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);

    ListNode current = head;
    while (current != null) {
      System.out.println(current.val + " ");
      current = current.next;
    }
  }
}
