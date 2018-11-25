package java_programs;

public class StaticStack extends Stack {
	
	private int stackTop;
    private int stackSize;
    private int[] stack;
    
    public StaticStack(int size) {
    	stackSize = size;
    	stackTop = -1;
    	
    	stack = new int[stackSize];
    }
	
	@Override
	void push(int element) {
		if (stackTop == stackSize-1)
			System.out.println("\nStack Overflow\n");
		else 
			stack[++stackTop] = element;
	}

	@Override
	int pop() {
		int ele = -1;
		
		if (stackTop == -1)
			System.out.println("\nStack Underflow\n");
		else 
			ele = stack[stackTop--];
		
		return ele;
	}
	
	@Override
	void display() {
        for(int i = 0; i <= stackTop; i++)
            System.out.print(stack[i] + "  ");
    }
}
