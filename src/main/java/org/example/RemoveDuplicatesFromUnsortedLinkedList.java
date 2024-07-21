/*

package org.example;

import java.util.HashSet;
import java.util.Set;

class RemoveDuplicatesFromUnsortedLinkedList {

    ListNode head;

    class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    private void removeDuplicates() {
        Set<Integer> s = new HashSet<>();
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            if (s.contains(curr.val)) {
                prev.next = curr.next;
            } else {
                s.add(curr.val);
                prev = curr;
            }
            curr = curr.next;
        }
    }

    // Helper method to print the linked list
    public void printLinkedList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromUnsortedLinkedList list = new RemoveDuplicatesFromUnsortedLinkedList();
        list.head = list.new ListNode(3);
        list.head.next = list.new ListNode(5);
        list.head.next.next = list.new ListNode(3);
        list.head.next.next.next = list.new ListNode(7);
        list.head.next.next.next.next = list.new ListNode(8);
        list.head.next.next.next.next.next = list.new ListNode(5);
        list.head.next.next.next.next.next.next = list.new ListNode(10);

        System.out.println("Original list:");
        list.printLinkedList();

        list.removeDuplicates();

        System.out.println("List after removing duplicates:");
        list.printLinkedList();
    }
}
*/
