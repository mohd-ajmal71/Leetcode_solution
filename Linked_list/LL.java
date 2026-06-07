import java.util.*;



class LL
{
   private static  class Node
    {
      String data ;
      Node next;

      Node(String data)
       {
         this.data=data;
         next=null;
       }
   }
    private  Node head;



    void addFirst(String d)
    {
        Node newnode=new Node(d);
        newnode.next=head;
        head=newnode;
    }
    void addLast(String d)
    {
        Node newnode = new Node(d);

        if(head==null)  
        {
            head=newnode;
            return;

        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;

    }

    void printlist(Node head)
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }

        System.out.print("Null");
    }

    public static void main (String args[])
    {
        LL list=new LL();
        list.addLast("is good ");
        list.addFirst("Ajmal");
        list.addLast("boy");
        list.printlist(list.head);

        
    }
}