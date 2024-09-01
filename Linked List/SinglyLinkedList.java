import java.lang.IllegalArgumentException;
import java.util.List;


public class SinglyLinkedList 
{
    private ListNode head;


    //Creation of list
    private static class ListNode
    {
        private int data;
        private ListNode next;

        private ListNode(int data)
        {
            this.data = data;
            this.next = null;
        }

    }

    //displaying the list
    public void display(ListNode head)
    {
        ListNode ptr = head;

        while(ptr != null)
        {
            System.out.print(ptr.data+" --> ");
            ptr = ptr.next;
        }

        System.out.print("null \n");
    }

    //finding length of the list
    public int findLength()
    {
        int length=0;
        ListNode ptr = head;
        while(ptr!=null)
        {
            ptr = ptr.next;
            length++;
        }
        return length;
    }

    //insert at beginning of the list
    public void insertBeg(int data)
    {
        ListNode newnode = new ListNode(data);
        newnode.next = head;
        head = newnode;
    }

    //insert at ending of the list
    public void insertEnd(int data)
    {
        ListNode newnode = new ListNode(data);

        ListNode ptr = head;

        while(ptr.next != null)
            ptr = ptr.next;
        
        ptr.next = newnode;
    }

    //insert at position
    public void insertPos(int data,int position)
    {
        ListNode newnode = new ListNode(data);

        if(position == 1)
        {
            newnode.next = head;
            head = newnode;
        }
        else
        {
            int count = 1;
            ListNode ptr = head;

            while(ptr!=null && count<position-1)
            {
                ptr = ptr.next;
                count++;
            }

            newnode.next = ptr.next;
            ptr.next = newnode;
        }
    }

    //delete at beginning
    public void deleteBeg()
    {
        head = head.next;
    }

    //delete at end
    public void deleteEnd()
    {
        ListNode ptr = head;
        ListNode preptr = null;
        while(ptr.next != null)
        {
            preptr = ptr;
            ptr = ptr.next;
        }
        
        preptr.next = null;
    }

    //delete at position
    public void deletePos(int position)
    {
        if (position <= 0 || head == null) {
            // Position is invalid or list is empty
            return;
        }
        if(position == 1)
            head = head.next;
        else
        {
            ListNode ptr = head;
            int count = 1;

            while(ptr!=null && count<position-1)
            {
                ptr = ptr.next;
                count++;
            }
            ptr.next = ptr.next.next;
        }
    }

    //search an element in the list
    public boolean searchElement(int key)
    {
        ListNode ptr = head;

        while(ptr != null)
        {
            if(ptr.data == key)
                return true;
            ptr = ptr.next;
        }

        return false;
    }

    //Reverse a list
    public ListNode reverse()
    {
        if(head == null)
            return null;

        ListNode cur = head;
        ListNode prev = null;
        ListNode nxt = null;
        
        while(cur != null)
        {
            nxt = cur.next;
            cur.next = prev;
            prev =  cur;
            cur = nxt;    
        }
        return prev;
    }

    //finding middle node
    public ListNode findMiddleNode()
    {
        ListNode slowptr = head;
        ListNode fastptr = head;

        while(fastptr!=null && fastptr.next!=null)
        {
            fastptr = fastptr.next.next;
            slowptr  = slowptr.next;
        }
        return slowptr;
    }

    //find last n-th node
    public ListNode findLastNthNode(int n)
    {
        if(head == null)
            return null;
        if(n<=0)
            throw new IllegalArgumentException("Value of n out of bounds\n");     
        
        ListNode refptr = head;
        ListNode mainptr = head;

        int count = 0;
        while(count < n)
        {
            if(refptr == null)
                throw new IllegalArgumentException("Value of count out of bounds\n");
            refptr = refptr.next;
            count ++;
        }
        while(refptr!=null)
        {
            refptr = refptr.next;
            mainptr=mainptr.next;
        }
        return mainptr;
    }
    
    //remove duplicates in sorted list
    public void removeDuplicates()
    {
        if(head==null)
            return;
        ListNode ptr = head;

        while(ptr != null)
        {
            if(ptr.data == ptr.next.data)
            {
                ptr.next = ptr.next.next;
            }
            ptr = ptr.next;
        }
    }

    //insert an element in a sorted linked list
    public void insertSorted(int data)
    {
        ListNode newnode = new ListNode(data);

        if(newnode.data < head.data)
        {
            newnode.next = head;
            head = newnode;
            return;
        }
        
        ListNode ptr = head;
        while(ptr.next!=null && newnode.data>ptr.data)
            ptr = ptr.next;
        
        newnode.next = ptr.next;
        ptr.next = newnode;

    }

    //remove a given key
    public void removekey(int key)
    {
        if(head == null)
            return;
        if(head.data == key)
        {
            head = head.next;
            return;
        }
        ListNode ptr = head;
        while(ptr != null)
        
    }



    // main method
    public static void main(String[] args) 
    {
        SinglyLinkedList sll  = new SinglyLinkedList();
        
        sll.head = new ListNode(2);

        //creation of nodes
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(4);
        ListNode fourth = new ListNode(5);

        //linking the nodes
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        //displaying the nodes
        System.out.println("\nInitial list....");
        sll.display(sll.head);  

        //length of list
        System.out.print("\nInitial length of the list....");
        System.out.println(sll.findLength());

        //insert at beginning
        sll.insertBeg(10);
        sll.insertBeg(7);
        sll.insertBeg(12);
        System.out.println("\nAfter insertBeg....");
        sll.display(sll.head);

        //insert at end
        sll.insertEnd(20);
        sll.insertEnd(21);
        sll.insertEnd(30);
        System.out.println("\nAfter insertEnd....");
        sll.display(sll.head);

        //insert at position
        sll.insertPos(15, 1);
        System.out.println("\nAfter insertPos....1");
        sll.display(sll.head);
        sll.insertPos(40, 5);
        System.out.println("\nAfter insertPos....5");
        sll.display(sll.head);
        sll.insertPos(50, 4);
        System.out.println("\nAfter insertPos....4");
        sll.display(sll.head);

        //delete at beginning
        sll.deleteBeg();
        sll.deleteBeg();
        System.out.println("\nAfter deleteBeg....");
        sll.display(sll.head);

        //delete at ending
        sll.deleteEnd();
        sll.deleteEnd();
        System.out.println("\nAfter deleteEnd....");
        sll.display(sll.head);

        //delete position
        sll.deletePos(1);
        System.out.println("\nAfter deletePos....1");
        sll.display(sll.head);
        sll.deletePos(8);
        System.out.println("\nAfter deletePos....3");
        sll.display(sll.head);

        //Search an element
        System.out.println("\nSearch a value");
        boolean res = sll.searchElement(3);
        System.out.println("3:"+res);
        res = sll.searchElement(100);
        System.out.println("100:"+res);

        //reverse list
        //System.out.println("\nReverse of list");
        //ListNode reversed = sll.reverse();
        //sll.display(reversed);

        //Middle node
        System.out.print("\nMiddle node data: ");
        System.out.println(sll.findMiddleNode().data);

        //find last n-th node
        System.out.print("\nLast Nth node data: ");
        System.out.println(sll.findLastNthNode(2).data);

        //remove duplicates from sorted list

        //creating sorted list
        SinglyLinkedList sortedlist = new SinglyLinkedList();
        sortedlist.head = new ListNode(1);

        ListNode two = new ListNode(2);
        ListNode two1 = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode three1 = new ListNode(3);
        ListNode four  = new ListNode(4);
        ListNode four1  = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode five1 = new ListNode(5);

        sortedlist.head.next = two;
        two.next = two1;
        two1.next = three;
        three.next = three1;
        three1.next = four;
        four.next = four1;
        four1.next = five;
        five.next = five1;
        sortedlist.display(sortedlist.head);

        //calling remove duplicate function
        System.out.println("\nAfter removing duplicates");
        sortedlist.removeDuplicates();
        sortedlist.display(sortedlist.head);

        //insert a node in sorted linked list
        sortedlist.insertSorted(3);
        sortedlist.insertSorted(4);
        System.out.println("\nAfter inserting to sorted list");
        sortedlist.display(sortedlist.head);

        //remove a given key

    }


}
