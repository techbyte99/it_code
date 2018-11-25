package java_programs;

import java.util.ArrayList;

public class DynamicStack extends Stack {
	
	private int stackTop;
	private ArrayList<Integer> stack = new ArrayList<>();
	
	public DynamicStack() {
		stackTop = -1;
	}

	@Override
	void push(int element) {
		stackTop++;
		stack.add(stackTop, element);
	}

	@Override
	int pop() {
		int ele = -1;
		
		if (stackTop == -1)
			System.out.println("\nStack Underflow\n");
		else {
			stackTop--;
			
			ele = stack.remove(stack.size() - 1);
		}
		
		return ele;
	}
	
	@Override
	void display() {
        for(int i = 0; i <= stackTop; i++)
            System.out.print(stack.get(i)+"  ");
    }

}
