package learn;

public class CustomLinked {
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	class Linkedlist{
		Node head;
		
		Linkedlist(){
			
		}
		void insertAtFront(int data) {
			Node newNode = new Node(data);
			newNode.next = head;
			head = newNode;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Linkedlist ll = new Linkedlist();
	}

}
