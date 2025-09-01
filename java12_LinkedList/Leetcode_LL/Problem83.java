package java12_LinkedList.Leetcode_LL;

public class Problem83 {
    static class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 public static  ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        ListNode temp1 = temp.next;
        System.out.println(temp.val);
        System.out.println(temp1.val);
        while ( temp1 != null) {
            while ( temp.val == temp1.val) {
                System.out.println(true);
                temp1 = temp1.next;
            }
            System.out.println(temp1.val);
            temp.next = temp1;
            temp = temp1;
            temp1 = temp1.next;
            
        }
        // while ( temp1 != null ) {
        //     while ( temp.val == temp1.val) {
        //         temp1 = temp1.next;
        //     }
        //     temp.next = temp1;
        //     temp = temp1;
        // }
        return head;
    }

    public static void main(String[] args) {
       ListNode node1 = new ListNode(1);
       ListNode node2 = new ListNode(1);
       ListNode node3 = new ListNode(2);

       node1.next = node2;
       node2.next = node3;
       deleteDuplicates(node1);
    //    ListNode ans = deleteDuplicates(node1);
    //    System.out.println(ans.val);

    }

}

