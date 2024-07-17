package cristiano.Neymar;
class LL{
    Node head;

public class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public Node addFirst(int data){
    Node temp=new Node(data);
    temp.next= head;
    head=temp;

    return head;

}
public void posistion(int pos,int data){
    Node temp=head;
    int cnt=1;
    while(cnt<pos-1){
        temp=temp.next;
        cnt++;
    }
    Node nw=new Node( data);
    nw.next=temp.next;
    temp.next=nw;
}
public void delete (int data)
  {
    if (head == null)
      {
	System.out.println ("List is empty, not possible to delete");
	return;
      }

    System.out.println ("Deleted: " + head.data);
    // move head to next node
    head = head.next;
  }
public void print(){
    Node temp=head;
     while(temp !=null){
        System.out.println(temp.data);
        temp=temp.next;
     }
     System.out.println("  ");
}

}


public class nymar {
    public static void main(String[] args){
        LL node1=new LL();
        node1.addFirst(45);
        node1.addFirst(23);
        node1.addFirst(22);
        node1.addFirst(25);
        node1.addFirst(26);
        node1.print();
        node1.delete(22);
        node1.delete(26);
        node1.print();

        node1.posistion(2,45);
        node1.print();




    }
    
}
