/**
 * This program implements a program that ...
 *
 * @class Main
 * 
 * @author Ezra Micah Malsi
 * @author Steven Clark Manalo
 * @author M-Jey Saturno
 * @author Esmael Gelera Jr.
 * @author Jomar Geron
 * @author Jefrey Landong
 */


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	//initialized to be easily accessed by the methods for much shorter lines
	static LinkedList list = new LinkedList();
	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	/*The method that will be called in order to append the linked list
	 * inside the method it will ask for an input from the user and
	 * will call the list object with the addNode method with parameter that have been
	 * inputed by the user
	 */
	
	/*This initialize method will be called if the user selected the first option in the menu
	 * inside the method will ask the user for input that will determine the size of the linked list
	 * after asking for  the size of linked list , a for loop will continue asking for input to
	 * add the elements in the linked list
	 */
	
	/*this method contains the menu that will be called every time- 
	 * the user ends a action. This method also catches the input from the user-
	 * in order to keep only integer inputs
	 */
	public static void menu()throws IOException{
				
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
		
      	//will check if the input is string or integer
		try {
  
			System.out.print("\n>> ");
			choice = Integer.parseInt(in.readLine());
			operations(choice);
	
		} catch(NumberFormatException ex) {
			//will print if the entered value is not an integer
			System.out.println("Only input integers only!");
			menu();          
		}		
	}
	
	public static void initializeLinkedList() throws NumberFormatException, IOException {
		while(true) {
			try {
				System.out.print("Enter initial size of the linked list: ");
				int size = Integer.parseInt(in.readLine());
				
				if(size > 0) {
					for(int i = 0 ; i < size ; i++) {
						System.out.print("\nEnter a number: ");
						int num = Integer.parseInt(in.readLine());
						list.addNode(new Node(num));
					}
					System.out.println("\nThe linked list has been successfully created.");
					menu();
					
				} else throw new Exception();
				
			} catch (Exception e) {
				System.out.println("Invalid input.\n");
				list.setHead(null);
			}
		}
	}
	
	/*This method with the parameter of integer will be the one to call
	 * the other methods by using switch case and if-else.
	 */
	public static void operations(int choice) throws IOException{
		switch(choice) {     
          	case 1:
          		if(list.getHead() == null) {
          			System.out.println("\nInitialize an array first");
          		}else {
          			list.displayList();
              		System.out.println("");
          		}
          		
          		//to loop menu after the action
          		menu();
            	break;
            
            case 2:
        		System.out.print("\nEnter an integer number: ");
        		int caseTwo = Integer.parseInt(in.readLine());
        		list.addNode(new Node(caseTwo));
        		list.displayList();
            	System.out.println();
            	//to loop menu after the action
            	menu();
            	break;
            
			case 3:
				System.out.print("\nEnter an integer number: ");
				int caseThree = Integer.parseInt(in.readLine());
				System.out.print("\nEnter the position: ");
				int positionAfter = Integer.parseInt(in.readLine());
				if(positionAfter <= list.length() &&  positionAfter > 0) {
					list.insertAfter(caseThree, positionAfter);
	        		list.displayList();
	            	System.out.println();
	            	
				} else System.out.println("Invalid Position. ");
				//to loop menu after the action
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
				//to loop menu after the action
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
				//to loop menu after the action
				menu();
				break;		
            
            case 6:
            	System.exit(0);
            	break;	
            
			default:
				System.out.println("Enter a valid choice only");
				//to loop menu after the action
				menu();
				break;
		}
		
	}
	
	/** 
	 * This is the main method which makes use of calling the initializeLinkedList method.
	 * @param args Unused.
	 * @throws IOException If an input or output exception occurred.
	 * @return Nothing.
	 */
	
	public static void main(String[] args) throws IOException {
		initializeLinkedList();
	}
}
