
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
		System.out.print("\nThe values are: ");
		Node currentNode = head;
		while(currentNode!=null){
			System.out.print(currentNode.getData() + " ");
			currentNode = currentNode.getNext();
			
		}
	}
}
