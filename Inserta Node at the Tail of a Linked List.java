/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
  Node insertar = new Node();
  insertar.data = data;
  insertar.next = null;
  Node node = head;
    while(node != null && node.next != null){
        node = node.next;
    }
   node.next = insertar;
   return head;
}
