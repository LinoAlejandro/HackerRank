/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
  Node node = head;
  ArrayList<String> text = new ArrayList<String>();
  while(node != null){
      text.add(String.valueOf(node.data));
      node = node.next;
  }
  for(int c = text.size() - 1; c >= 0; c--){
      System.out.println(text.get(c));
  }
}

