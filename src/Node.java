public class Node {
	//Class Fields
	private int data;
	private Node next;
	
	//Parameterized constructor
	public Node(int data) {
		this.data = data;
		next = null;
	}
	
	//getters
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
	
	//setters
	public void setData(int data) {
		this.data = data;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}