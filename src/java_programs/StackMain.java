package java_programs;

import java.util.Scanner;

public class StackMain {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int size, option;
		Stack st;
		
		System.out.println("Choose Stack: ");
		System.out.println("1.Static Stack");
		System.out.println("2. Dynamic Stack");
		
		System.out.print(" :: ");
		option = sc.nextInt();
		
		if (option == 1) {
			System.out.println("\nStatic Stack");
			
			System.out.print("\nSize of the Stack: ");
			size = sc.nextInt();
			
			st = new StaticStack(size);
			
			stackOperations(st);
		}
		
		else if (option == 2) {
			System.out.println("\nDynamic Stack");
			
			st = new DynamicStack();
			
			stackOperations(st);
		}

	}

	private static void stackOperations(Stack st) {
		int choice = 0, ele;
		
		do {
			System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3. Display");
            
            System.out.print("\n : (-1 to Exit) :: ");
            choice = sc.nextInt();
            
            switch(choice) {
            	case 1:
            		System.out.print("\nEnter Element to Push: ");
            		ele = sc.nextInt();
            		
            		st.push(ele);
            		break;
            	case 2:
            		ele = st.pop();
            		
            		System.out.println("Element Popped: " + ele + "\n");
            		break;
            		
            	case 3:
            		System.out.print("\nElement in Stack:");
            		st.display();
            		
            		System.out.println();
            		break;
            }
			
		} while (choice != -1);
		
		st.display();
	}

}
