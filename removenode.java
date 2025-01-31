// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


public class removenode {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;

            ListNode fast = dummy;
            ListNode slow = dummy;

            while(n >0){
                fast = fast.next;
                n--;
            }

            while(fast.next != null){
                slow = slow.next;
                fast = fast.next;
            }

            slow.next = slow.next.next;
            return dummy.next;
        }
    }
