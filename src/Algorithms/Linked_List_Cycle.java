package Algorithms;

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
}

public class Linked_List_Cycle {

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(12);
        ListNode listNode2 = new ListNode(13);
        ListNode listNode3 = new ListNode(14);
        ListNode listNode4 = new ListNode(15);
        ListNode listNode5 = new ListNode(16);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode2;

        Boolean b = hasCycle(listNode1);
        System.out.println(b);

    }

    public static boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }

        ListNode temp1 = head;
        ListNode temp2 = temp1;
        while(temp2.next != null && temp2.next.next != null){
            temp1 = temp1.next;
            temp2 = temp2.next.next;
            if(temp1 == temp2){
                return true;
            }
        }

        return false;
    }
}
