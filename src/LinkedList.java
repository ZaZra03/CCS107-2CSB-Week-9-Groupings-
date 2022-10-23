public class LinkedList {
	//Class fields
	private Node head;
	
	//getter
	public Node getHead() {
		return head;
	}
	
	//setter
	public void setHead(Node head) {
		this.head = head;
	}
	
	/** 
	 * This is the addNode method which makes use for adding a node
	 * to the linked list. It is use for initializing a linked list or
	 * adding a node at the end of the linked list. If the head node is
	 * empty, the node that will be initialize will declare as the head.
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
	 * This is the displayList method which makes use of displaying
	 * the node/s present in the linked list.
	 * 
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
	 * This is the length method which makes use of getting
	 * the number the of node/s present in the linked list.
	 * 
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
	 * This is the insertAfter method which makes use of inserting
	 * a new node after a given position.
	 * <p>The method accept a two integer as parameter that is the
	 * data of the node and the position of the node after a given
	 * position.
	 * <p>The first lines of the code is it initialize two nodes, and
	 * that is the node that will be inserted and a temporary head node.
	 * If the position is 1, then the address of the newNode will be the
	 * next node of the head. After that, the address of the head 
	 * node will be change to the newNode. If the position is not 1,
	 * then it will iterate until it reaches the designated position. After
	 * that, the newNode address will be set to the address of the 
	 * position node, and the position node address will be set to
	 * newNode.
	 * 
	 * 
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
	 * This is the insertBefore method which makes use of inserting
	 * a new node before a given position.
	 * <p>The method accept a two integer as parameter that is the
	 * data of the node and the position of the node after a given
	 * position.
	 * <p>The first lines of the code is it initialize two nodes, and
	 * that is the node that will be inserted and a temporary head node.
	 * If the position is 1, then the address of the newNode will be the
	 * head. After that, the newNode will be the new head. If the position 
	 * is not 1,then it will iterate until it reaches the designated 
	 * position. After that, the newNode address will be set to the 
	 * address of the previous position node, and the position node 
	 * address will be set to newNode.
	 * 
	 * 
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
	 * This is the deleteAt method which makes use of deleting a
	 * given a position. The method accept an integer as parameter
	 * and that is the position the user wants to delete. If the
	 * position is 1, then the next address of the head node will
	 * be the new head node. Else, it will iterate until it reaches 
	 * the previous node of the node that will be deleted.
	 * <p>
	 * The previous node address will be set to the address of the 
	 * node that will be deleted.
	 * 
	 * @param int position This is the second parameter.
	 * @return Nothing.
	 */
	
	public void deleteAt(int position) {
		Node temp = head;
		
		if(position == 1) {
			head = temp.getNext();
		} else {
			for(int i = 1; i < position-1; i++) {
				if(temp.getNext() != null) {
					temp = temp.getNext();
				}
			}
			temp.setNext(temp.getNext().getNext());
		}
	}
}
