public class Linkedlist5 {
    Node head;
    private int size;

    Linkedlist5(){
        this.size =0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add- First, Last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //Print
    public void printList(){
        if(head == null){
            System.out.println("This List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deleteFirst(){
        if(head ==  null){
             System.out.println("This List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last
    public void deleteLast(){
        if(head ==  null){
             System.out.println("This List is empty");
            return;
        }

        size--;
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode != null){
            lastNode = lastNode.next;
            secondLast =secondLast.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    //Iterative approach: To Reverse a LinkedList
    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;

        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //Update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next =null;
        head = prevNode;
    }

    //Recursive approach: To Reverse a Linkedlist
    
    public Node reverseListRecursive(Node head) {
        //empty node || last node or only one node
        if(head == null || head.next == null) {
            return head;
        }
 
 
        Node newHead = reverseListRecursive(head.next);
       
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
 

    public static void main(String[] args) {
        Linkedlist5 list = new Linkedlist5();
        
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.printList();

        //list.reverseIterate();
        //list.printList();

        list.head = list.reverseListRecursive(list.head);
        list.printList();
    }

    
}
