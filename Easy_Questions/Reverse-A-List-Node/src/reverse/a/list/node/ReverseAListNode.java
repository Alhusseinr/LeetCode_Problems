package reverse.a.list.node;

public class ReverseAListNode {

    public static ListNode reverslist(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;

        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode List = new ListNode();
        reverslist(List);

    }

}
