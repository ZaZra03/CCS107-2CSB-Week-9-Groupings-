public class LinkedList {
	
	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
	
	/** 
	 * This is the addNode method which makes use of calling the initializeLinkedList
	 * method or appending in the linked list. If the head node is empty 
	 * 
	 * @param Node node This is the first parameter.
	 * @return Nothing.
	 */
	
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
	
	/** 
	 * This is the displayList method which makes use of 
	 * @return Nothing.
	 */
	
	public void displayList() {
		System.out.print("\nThe values in the linked list are: ");
		Node currentNode = head;
		while(currentNode!=null){
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext();	
		}
	}
	
	/** 
	 * This is the length method which makes use of 
	 * @return int count.
	 */
	
	public int length() {
		Node tempNode = getHead();
		int count = 0;
		
		while(tempNode != null) {
			count++;
			tempNode = tempNode.getNext();
		}
		return count;
	}
	
	/** 
	 * This is the insertAfter method which makes use of 
	 * @param int data This is the first parameter.
	 * @param int position This is the second parameter.
	 * @return Nothing.
	 */
	
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
	
	/** 
	 * This is the insertBefore method which makes use of 
	 * @param int data This is the first parameter.
	 * @param int position This is the second parameter.
	 * @return Nothing.
	 */
	
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
	
	/** 
	 * This is the deleteAt method which makes use of 
	 * @param int position This is the second parameter.
	 * @return Nothing.
	 */
	
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
