package hard;

public class ReverseLinkedList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList(0);
        list.next = new LinkedList(1);
        list.next.next = new LinkedList(2);

        LinkedList res = reverseLinkedList(list);

        while (res != null) {
            System.out.print(res.value + " ");
            res = res.next;
        }
    }

    public static LinkedList reverseLinkedList(LinkedList head) {
        // Write your code here.

        LinkedList prev = null, curr = head;

        while (curr != null) {
            LinkedList temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;
    }

    static class LinkedList {
        int value;
        LinkedList next = null;

        public LinkedList(int value) {
            this.value = value;
        }
    }
}
