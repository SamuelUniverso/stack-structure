package br.univates.main;

/// Source: http://sites.poli.usp.br/p/fabio.cozman/Didatico/Comp/Material/estruturas.pdf

public class Stack {
	
	private int top;
	private Object[] stack;

	private final int DEFAULT = 10;

	public Stack() {
		stack = new Object[DEFAULT];
		top = -1;
	}
	
	public void push(Object o) {
		top++;
		if(top == stack.length) {
			doubleQueueSize();
		}
		stack[top] = o;
		
	}
	
	public Object pop() {
		if(top >= 0) {
			return (stack[top--]);
		}
		else {
			return (null);
		}
	}
	
	public Object top() {
		if(top >= 0) {
			return (stack[top]);
		}
		else {
			return (null);
		}
	}

	public void print() {
		System.out.print("[");
		for(int i = 0; i < stack.length; i++) {
			if(stack[i] != null) {
				System.out.print(stack[i] + ",");
			}
		}
		System.out.print("]");
	}

	public void clear()
	{
		top = -1;
	}
	
	public int getSize()
	{
		return top +1;
	}
	
	/**
	 * If top is reached, double the size
	 */
	private void doubleQueueSize() {
		Object newQueue[] = new Object[2 * stack.length];
		for(int i = 0; i < stack.length; i++) {
			newQueue[i] = stack[i];
		}
		stack = newQueue;
	}
}
