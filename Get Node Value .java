/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
    Node node = head;
	int cont = 0;
	    
	while(node != null) {
	   cont++;
	   node = node.next;
	}
	    
	node = head;
	cont = cont - 1;
	    
	while(cont > n){
	   cont--;
	   node = node.next;
   }
	    
    return node.data;
}