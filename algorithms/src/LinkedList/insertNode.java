package LinkedList;

public class insertNode {

	Node head;
	
	 class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	void sort(Node node){
		Node current; 
		
		if(head == null){
			head = node;
			node.next = null;
		}
		else if(head.data>node.data && head!=null){
			node.next = head;
			head = node;
		}
		else{
			current = head;
			while(current.next!=null && node.data<current.next.data){
				current = current.next;
			}
			node.next = current.next;
            current.next = node;
		}
	}
	
	
	Node newNode(int data)
	    {
	       Node x = new Node(data);
	       return x;
	    }
	 
	void printlist(){
		Node temp = head;
		while(temp.next!=null){
			System.out.println("Value: "+temp.data);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		insertNode insertnode = new insertNode();
		Node node;
		node = insertnode.newNode(5);
		insertnode.sort(node);
		node = insertnode.newNode(1);
		insertnode.sort(node);
		node = insertnode.newNode(6);
		insertnode.sort(node);
		node = insertnode.newNode(8);
		insertnode.sort(node);
		node = insertnode.newNode(7);
		insertnode.sort(node);
		insertnode.printlist();
		
	}

}
