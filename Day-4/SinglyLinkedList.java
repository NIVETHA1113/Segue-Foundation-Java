class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList{
void addAtBeg(int data){
Node ptr=new Node(data); // creating a new node
if(head==null) // checking if there is any node present previously
{
  head=ptr;
}
else
{
ptr.next=head;
head=ptr;
    }
}
}
public class SinglyLinkedList {
    
}
