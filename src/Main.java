/**
 * <h1>LinkedList Menu-Driven Program</h1>
 * This program implements a program that perform the given linked list 
 * operations such as Display, Append, Insert After, Insert Before, and Delete. 
 * Before performing the operations the user must initialized a linked list first 
 * by calling the initializeLinkedList method in the program. <b>The initializeLinkedList method 
 * can only be executed once.</b>
 * 
 * <p>The user can perform 6 operations in the menu-driven program and these are the following:
 * <ul>
 * <li><b>Display</b> This operation traverses and displays all the integer 
 * values in the linked list. The user cannot execute this operation if 
 * the linked list is empty. By calling the displayList method in the LinkedList 
 * class we can perform this operation.
 * 
 * <li><b>Append</b> This operation inserts a new node at the end of the linked list. 
 * If the linked list is empty, this operation creates the head of the linked list.
 * By calling the addNode method in the LinkedList class we can perform this operation.
 * 
 * <li><b>Insert After</b> This operation inserts a new node after a given position. 
 * This operation cannot be executed if the position does not exist. For example, if the user have 
 * 5 nodes in the linked list, valid positions are 1 to 5 only. If the last position is chosen, 
 * the new node will be inserted at the end of the linked list. By calling the insertAfter method in the 
 * LinkedList class we can perform this operation.
 * 
 * <li><b>Insert Before</b> This operation inserts a new node before a given position. 
 * This operation cannot be executed if the position does not exist. For example, if the user 
 * have 5 nodes in the linked list, valid positions are 1 to 5 only. The user cannot execute 
 * this operation if the linked list is empty. By calling the insertBefore method in the LinkedList 
 * class we can perform this operation.
 * 
 * <li><b>Delete</b> This operation removes a node at a given position. This operation 
 * cannot be executed if the position does not exist. For example, if the user have 5 nodes 
 * in the linked list, valid positions are 1 to 5 only. You cannot execute this operation 
 * if the linked list is empty. By calling the deleteAt method in the LinkedList class 
 * we can perform this operation.
 * 
 * <li><b>Exit</b> This simply exits the program.
 * </ul>
 *
 * @class Main
 * 
 * @author Ezra Micah Malsi
 * @author Steven Clark Manalo
 * @author M-Jey Saturno
 * @author Esmael Gelera Jr.
 * @author Jomar Geron
 * @author Jefrey Landong
 * @see LinkedList
 * @see Node
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	//initialized to be easily accessed by the methods for much shorter lines
	static LinkedList list = new LinkedList();
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	/** 
	 * This is the menu method which makes use of displaying the information about the operation, so that
	 * the user will be aware of what number will be inputed in the program. Below the displaying the details
	 * of the program is a try-catch block for input checking if the user inputed a correct format
	 * 
	 * @throws IOException If an input or output exception occurred.
	 * @return Nothing.
	 */
	
	public static void menu() throws IOException{
		int choice;
		System.out.println("\n=================");	
		System.out.println("Choose a Action: ");
		System.out.println("[1] Display");
		System.out.println("[2] Append");
		System.out.println("[3] Insert After");
		System.out.println("[4] Insert Before");
		System.out.println("[5] Delete");
		System.out.println("[6] Exit");
		System.out.println("=================");
		
		try {
			System.out.print("\n>> ");
			choice = Integer.parseInt(in.readLine());
			operations(choice);
	
		} catch(NumberFormatException ex) {
			System.out.println("Only input integers only!");
			menu();          
		}		
	}
	
	/** 
	 * This is the initializeLinkedList method which makes use of initializing
	 * a linked list first before performing any operation in the program. This method
	 * can be only executed once. 
	 *
	 * <p>The first part of the code is surrounded by a try-catch block for input checking
	 * of getting the size of the linked list; thus, the input must be greater than zero.
	 * <p>After getting the size of the linked list, we use a for-loop to iterate as many 
	 * as the size, and getting the data of the node we will be creating using the addNode
	 * method from the LinkedList class. We used again a try-catch block for input checking.
	 * 
	 * @throws IOException If an input or output exception occurred.
	 * @throws NumberFormatException
	 * @return Nothing.
	 */
	
	public static void initializeLinkedList() throws NumberFormatException, IOException {
			try {
				System.out.print("Enter initial size of the linked list: ");
				int size = Integer.parseInt(in.readLine());
				
				if(size > 0) {
					while(true) {						
							for(int i = 0 ; i < size ; i++) {
								try {
									System.out.print("\nEnter a number: ");
									int num = Integer.parseInt(in.readLine());
									list.addNode(new Node(num));
								} catch (Exception e) {
									System.out.println("Invalid input.\n");
									i--;
								}
							}
							System.out.println("\nThe linked list has been successfully created.");
							menu();
					}
					
				} else throw new Exception();
				
			} catch (Exception e) {
				System.out.println("Invalid input.\n");
				list.setHead(null);
				initializeLinkedList();
			}
	}
	
	/** 
	 * This is the operations method which makes use of 
	 * @param int choice This is the only parameter.
	 * @throws IOException If an input or output exception occurred.
	 * @return Nothing.
	 */
	
	public static void operations(int choice) throws IOException{
		switch(choice) {     
          	case 1:
          		if(list.getHead() != null) {
          			list.displayList();
              		System.out.println("");
          			
          			
          		} else System.out.println("\nLinked list is empty");
          		menu();
            	break;
            
            case 2:
        		System.out.print("\nEnter an integer number: ");
        		int caseTwo = Integer.parseInt(in.readLine());
        		list.addNode(new Node(caseTwo));
        		list.displayList();
            	System.out.println();
            	menu();
            	break;
            
			case 3:
          		if(list.getHead() != null) {
    				System.out.print("\nEnter an integer number: ");
    				int caseThree = Integer.parseInt(in.readLine());
    				System.out.print("\nEnter the position: ");
    				int positionAfter = Integer.parseInt(in.readLine());
    				
    				if(positionAfter <= list.length() &&  positionAfter > 0) {
    					list.insertAfter(caseThree, positionAfter);
    	        		list.displayList();
    	            	System.out.println();
    	            	
    				} else System.out.println("Invalid Position. ");
          			
          			
          		} else System.out.println("\nLinked list is empty");
				
				menu();
				break;	
            
            case 4:
				System.out.print("\nEnter an integer number: ");
				int caseFour = Integer.parseInt(in.readLine());
				System.out.print("\nEnter the position: ");
				int positionBefore = Integer.parseInt(in.readLine());
				
				if(positionBefore <= list.length() &&  positionBefore > 0) {
					list.insertBefore(caseFour, positionBefore);
	        		list.displayList();
	            	System.out.println();
	            	
				} else System.out.println("Invalid Position. ");
				
				menu();
				break;	
            
            case 5:
            	System.out.print("\nEnter the position: ");
            	int deletePositionAt = Integer.parseInt(in.readLine());
            	
				if(deletePositionAt <= list.length() &&  deletePositionAt > 0) {
					list.deleteAt(deletePositionAt);
	        		list.displayList();
	            	System.out.println();
	            	
				} else System.out.println("Invalid Position. ");
				
				menu();
				break;		
            
            case 6:
            	System.exit(0);
            	break;	
            
			default:
				System.out.println("Enter a valid choice only");
				menu();
				break;
		}
		
	}
	
	/** 
	 * This is the main method which makes use of calling the initializeLinkedList method.
	 * The other methods will called inside the initializeLinkedList method.
	 * 
	 * @param args Unused.
	 * @throws IOException If an input or output exception occurred.
	 * @return Nothing.
	 */
	
	public static void main(String[] args) throws IOException {
		initializeLinkedList();
	}
}
