import java.util.*;
class LinkedList2
{ 
    Node head;  // head of list 
  
    
    class Node 
    { 
        int data; 
        Node next; 
        Node(int d) {data = d; next = null; } 
    } 
  
    // Inserting at Front 
    public void push(int new_data) 
    { 
        // Allocating the node and adding data
        Node new_node = new Node(new_data); 
  
        //Make next of new Node as head 
        new_node.next = head; 
  
        // Move the head to point to new Node 
        head = new_node; 
    } 
  
    // Inserting a node after a given node
    public void insertAfter(Node prev_node, int new_data) 
    { 
        // Check if the given Node is null 
        if (prev_node == null) 
        { 
            System.out.println("The given previous node cannot be null"); 
            return; 
        } 
  
        // Allocate the Node and adding data 
        Node new_node = new Node(new_data); 
  
        //  Make next of new Node as next of prev_node 
	new_node.next = prev_node.next; 
  
        //  make next of prev_node as new_node 
        prev_node.next = new_node; 
    } 
     
    // Appends a new node at the end.  
    public void append(int new_data) 
    { 
        // Allocating the node and adding data
        Node new_node = new Node(new_data); 
  
        // If the Linked List is empty, then make the new node as head 
        if (head == null) 
        { 
            head = new Node(new_data); 
            return; 
        } 
  
        // This new node is going to be the last node, so 
           //   make next of it as null 
        new_node.next = null; 
  
        // Else traverse till the last node 
        Node last = head;  
        while (last.next != null) 
            last = last.next; 
  
        // Change the next of last node 
        last.next = new_node; 
        return; 
    } 
  
    // Prints the Linked List
    public void printList() 
    { 
        Node nod = head; 
        while (nod != null) 
        { 
            System.out.print(nod.data+" "); 
            nod = nod.next; 
        } 
    } 
  
    public static void main(String[] args) 
    { 
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number of nodes you want to add: ");
		int g =s.nextInt();
		LinkedList2 list = new LinkedList2();
	    //Inserting at the front by taking input from user 
		for (int i =0;i<g;i++){
			int c=s.nextInt();
			list.push(c);
		}
          
  
        // Inserting a node at the end  
        list.append(6);  
        list.append(4); 
  	
	// Inserting a node after a given node 
        list.insertAfter(list.head.next, 8); 
  
        System.out.println("\nCreated Linked list is: "); 
        list.printList(); 
    } 
}
