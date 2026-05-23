
public class Linkedlist6 {
    class ListNode{
        String data;
        ListNode next;

        ListNode(String data){
            this.data = data;
            this.next = null;
            // size++;
        }
    }
    public ListNode removeNthFrontEnd(ListNode head,int n){
        if(head.next==null){
            return null;
        }
        //Size
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr = (ListNode) curr.next;
            size++;
        }

        //removing SIZEth node from last head
        if(n == size){
            return (ListNode) head.next;
        }

        //Find Previous Node
        int indexToSearch = size-n;//Position to find
        ListNode prev = head;       //Position to find
        int i= 1;                   //Position to find
        while(i< indexToSearch){
            prev = (ListNode) prev.next;
            i++;
        }
        prev.next = prev.next;
        return head;
    }
    
}
