/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    Node nodeA = headA;
    Node nodeB = headB;

    while(nodeA != null && nodeB != null && nodeA.data == nodeB.data){
        nodeA = nodeA.next;
        nodeB = nodeB.next;
    }
    
    if(nodeA == null && nodeB == null){
        return 1;
    } else {
        return 0;
    }
  
}