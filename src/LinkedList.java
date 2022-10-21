
public class LinkedList {
	
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	public void addNode(Node node) {
		if(head==null) {
			head = node;
		}
		else {
			Node currentNode = head;
			while(currentNode.getNext()!=null)
			currentNode = currentNode.getNext();
			currentNode.setNext(node);
			}
		}
	
	public void displayList() {
		System.out.print("\nThe values in the linked list are: ");
		Node currentNode = head;
		while(currentNode!=null){
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext();	
		}
	}
	
	public int length() {
		Node tempNode = getHead();
		int count = 0;
		
		while(tempNode != null) {
			count++;
			tempNode = tempNode.getNext();
		}
		return count;
	}
	
	public void insertAfter(int data, int position) {
		Node newNode = new Node(data);
		Node temp = getHead();
		
		if(position == 1) {
			newNode.setNext(temp.getNext());
			head.setNext(newNode);
			
		} else {
			for(int i = 1; i < position; i++) {
				if(temp.getNext() != null) {
					temp = temp.getNext();
				}
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
	}
	
	public void insertBefore(int data, int position) {
		Node newNode = new Node(data);
		Node temp = head;

		if(position == 1) {
			newNode.setNext(temp);
			head = newNode;
				
		} else {
			for(int i = 1; i < position-1; i++) {
				if(temp.getNext() != null) {
					temp = temp.getNext();
				}
			}
			newNode.setNext(temp.getNext());
			temp.setNext(newNode);
		}
	}
	
	public void deleteAt(int position) {
		Node temp = head;
		
		if(position == 1) {
			head = temp.getNext();
		} else {
			for(int i = 1; i < position; i++) {
				if(temp.getNext() != null) {
					temp = temp.getNext();
				}
			}
			head.setNext(temp.getNext());
		}
	}
}
