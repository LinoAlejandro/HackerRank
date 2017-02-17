/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    Node node = head;
    Node aux1 = new Node();
    Node aux2 = null;
    while(node != null) {
        aux1.data = node.data;
        aux2 = aux1;
        aux1 = new Node();
        aux1.next = aux2;
       
        node = node.next;
    }
    return aux2;
}
