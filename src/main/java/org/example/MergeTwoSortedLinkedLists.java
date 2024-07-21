package org.example;


public class MergeTwoSortedLinkedLists {

    public static void main(String[] args) {

        //In question it is given linked lists are sorted.
        //   3,4,8,12
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(8);
        head1.next.next.next = new ListNode(12);

        // 1,6,15,19
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(6);
        head2.next.next = new ListNode(15);
        head2.next.next.next = new ListNode(19);

        ListNode mergedhead = merge2SortedLists(head1, head2);

        printList(mergedhead);

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static ListNode merge2SortedLists(ListNode head1, ListNode head2) {
        ListNode nn = new ListNode(-1);
        ListNode temp = nn;
        ListNode t1 = head1;
        ListNode t2 = head2;
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }
        while (t1 != null && t2 != null) {
            if (t1.val < t2.val) {
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        while (t1 != null) {
            temp.next = t1;
            temp = temp.next;
            t1 = t1.next;
        }
        while (t2 != null) {
            temp.next = t2;
            temp = t2;
            t2 = t2.next;
        }
        return nn.next;
    }

    static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


}
