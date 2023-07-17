package Linklist;

public class ls1 {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.println(current.data + "-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // SINGLY LINKLIST

        ls1 sil = new ls1();
        sil.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(8);

        // now we will connect them together to form a chain
        sil.head.next = second;// 10-->1
        second.next = third;// 10--->1--->4
        third.next = fourth;// 10-->1-->4-->8-->null

    }
}
