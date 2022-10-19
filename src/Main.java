import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	//initialized to be easliy accessed by the methods for much shorter lines
	LinkedList list = new LinkedList();
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	/*The method that will be called in order to append the linked list
	 * inside the method it will ask for an input from the user and
	 * will call the list object with the addNode method with parameter that have been
	 * inputed by the user
	 */
	public void append()throws IOException{
		System.out.print("Enter an Integer number: ");
		int n = Integer.parseInt(in.readLine());
		list.addNode(new Node(n));
		list.displayList();
		
	}
	
	/*This initialize method will be called if the user selected the first option in the menu
	 * inside the method will ask the user for input that will determine the size of the linked list
	 * after asking for  the size of linked list , a for loop will continue asking for input to
	 * add the elements in the linked list
	 */
	public void initialize() throws IOException {
		System.out.print("Enter initial size of the linked list: ");
		int n = Integer.parseInt(in.readLine());

		for(int i = 0 ; i < n ; i++) {
			System.out.print("Enter a number: ");
			int num = Integer.parseInt(in.readLine());
			list.addNode(new Node(num));
		}
		
		
	}
	
	/*this method contains the menu that will be called every time- 
	 * the user ends a action. This method also catches the input from the user-
	 * in order to keep only integer inputs
	 */
	public void menu()throws IOException{
				
		int choice;
		
		System.out.println("=================");	
		System.out.println("Choose a Action: ");
		System.out.println("1. Initialize");
		System.out.println("2. Display");
		System.out.println("3. Append");
		System.out.println("4. Insert After");
		System.out.println("5. Insert Before");
		System.out.println("6. Delete");
		System.out.println("7. Exit");
		System.out.println("=================");
		
      	//will check if the input is string or integer
		try {
  
			System.out.print("Enter Your Action: ");
			choice = Integer.parseInt(in.readLine());
			operations(choice);
	
		}catch(NumberFormatException ex) {
			//will print if the entered value is not an integer
			System.out.println("Only input integers only!");
			menu();
          
		}
				
	}
	
	/*This method with the parameter of integer will be the one to call
	 * the other methods by using switch case and if-else.
	 */
	public void operations(int choice) throws IOException{
		switch(choice) {
			case 1:
				//call method here
				initialize();
				
				//to loop menu after the action
				menu();
				break;
            
          	case 2:
          		//call method here
          		if(list.getHead() == null) {
          			System.out.println("Initialize an array first");
          		}else {
          			list.displayList();
              		System.out.println("");
          		} 		
          		//to loop menu after the action
          		menu();
            	break;
            
            case 3:
            	//call method here
            	append();
            	System.out.println("");
            	//to loop menu after the action
            	menu();
            	break;
            
			case 4:
            	//call method here
				
				//to loop menu after the action
				menu();
				break;	
            
            case 5:
            	//call method here
            	
            	//to loop menu after the action
            	menu();
            	break;
            
            case 6:
            	//call method here
            	
            	//to loop menu after the action
            	menu();
            	break;	
            
            case 7:
            	System.exit(0);
            	break;	
            
			default:
				System.out.println("Enter a valid choice only");
				//to loop menu after the action
				menu();
				break;
		}
		
	}
	
	/*the main method that will call the menu method
	 */
	public static void main(String[] args) throws IOException {
		Main objMain = new Main();
		objMain.menu();	
	}

}
