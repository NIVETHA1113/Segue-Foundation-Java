class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
 
    Node head = null;
 
    // Add node at last
    void addAtLast(int data) {
 
        Node ptr = new Node(data);
 
        if (head == null) {
            head = ptr;
        }
        else {
            Node temp = head;
 
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ptr;
        }
    }
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
 
void addAtPosition(int data, int pos) {

    Node ptr = new Node(data);

    int l = 1;
    Node temp = head;

    while (temp.next != null) {

        if (l == pos) {

            ptr.next = temp.next;
            temp.next = ptr;

            return;
        }

        temp = temp.next;
        l++;
    }

    // Insert at the last position
    if (l == pos) {
        temp.next = ptr;
    }
}
//deleting at the end

void deleteAtBeg() {
 if (head == null){
    System.out.print("The List is empty");
    return;
 }
 Node temp = head;
 head = head.next;
 temp = null;

}


void deleteAtPosition(int pos) {

    // Check whether list is empty
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    // Delete first node
    if (pos == 1) {
        head = head.next;
        return;
    }

    Node temp = head;
    Node save = null;

    int l = 1;

    while (temp != null && l < pos) {

        save = temp;
        temp = temp.next;
        l++;
    }
if(l==pos){
      save.next = temp.next;
}
    
}

    // Display linked list
    void show() {
 
        Node temp = head;
 
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
 
        System.out.println("null");
    }
}
 
public class LinkedListImplementation {
    public static void main(String[] args) {
 
        LinkedList list = new LinkedList();
 
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.addAtBeg(5);
        list.addAtBeg(2);
        list.deleteAtPosition(5);
        list.deleteAtBeg();
        list.show();
    }
}