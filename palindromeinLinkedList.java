import java.util.*;
class palindromeinLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
        {
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

        }
         ListNode mid = slow;
         ListNode curr = mid.next;
         mid.next= null;
         ListNode next;
         ListNode prev = null;
         while( curr != null)
         {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
         }

         ListNode left = head;
         ListNode right = prev;

         while(right != null)
         {
            if(right.val != left.val)
            {
                return false;
            }
            right = right.next;
            left = left.next;
         }

        return true;
    }
}