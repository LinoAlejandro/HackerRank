/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method

    Node node = head;
    Node ant = null;
    int c = 0;
    while(c < position){
        ant = node;
        node = node.next;
        c++;
    }
    if(ant == null){
        if(head != null){
            head = head.next;
        } else {
            head = null;
        }
    } else {
        if(node != null){
            ant.next = node.next;
        } else {
            //nothing
        }
        
    }
    return head;
}