/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;

    Node node = head;
    Node ant = null;
    int c = 0;
    while(c < position){
        ant = node;
        node = node.next;
        c++;
    }
    if(ant == null) {
        head = newNode;
        newNode.next = node;
    } else {
        ant.next = newNode;
        newNode.next = node;
    }

    return head;
}
