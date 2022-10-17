import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	
	LinkedList list = new LinkedList();
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	
	//To append an linkedlist to be called in the operations method
	public void append()throws IOException{
		System.out.print("Enter an Integer number: ");
		int n = Integer.parseInt(in.readLine());
		list.addNode(new Node(n));
		list.displayList();
		
	}
	
	//TO initialize the linkedlist
	public void initialize() throws IOException {
		System.out.print("Enter initial size of the linked list: ");
		int n = Integer.parseInt(in.readLine());

		for(int i = 0 ; i < n ; i++) {
			System.out.print("Enter a number: ");
			int num = Integer.parseInt(in.readLine());
			list.addNode(new Node(num));
		}
		
		
	}
	
	//The Menu that will display the Operations
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
	
	//the operations that will be used
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
	
	
	//the main method
	public static void main(String[] args) throws IOException {
		
		Main objMain = new Main();
		
		objMain.menu();
		
		
	}

}
