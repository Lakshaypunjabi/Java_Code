public class Linkedlist7 {
    class ListNode{
        String data;
        ListNode next;

        ListNode(String data){
            this.data = data;
            this.next = null;
            // size++;
        }
    }
    public ListNode getMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = (ListNode) slow.next;
        }
        return slow;
     }
     
     
     public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
       
        while (curr != null) {
            ListNode next = (ListNode) curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
     }
     
     
     
     
     public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) {
            return true;
        }
       
        ListNode firstHalfEnd = getMiddle(head);
        ListNode secondHalfStart = reverse(firstHalfEnd.next);
        ListNode firstHalfStart = head;
       
        //Comparison 
        while(secondHalfStart != null) {
            if(secondHalfStart!= firstHalfStart) {
                return false;
            }
            secondHalfStart = secondHalfStart.next;
            firstHalfStart = firstHalfStart.next;
        }
       
        return true;
     }
     
}
