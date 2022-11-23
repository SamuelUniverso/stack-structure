package br.univates.main;

public class Stack {
	
	private int top;
	private Object[] queue;

	private final int DEFAULT = 10;

	public Stack() {
		queue = new Object[DEFAULT];
		top = -1;
	}
	
	public void push(Object o) {
		top++;
		if(top == queue.length) {
			doubleQueueSize();
		}
		queue[top] = o;
		
	}
	
	public Object pop() {
		if(top >= 0) {
			return (queue[top--]);
		}
		else {
			return (null);
		}
	}
	
	public Object top() {
		if(top >= 0) {
			return (queue[top]);
		}
		else {
			return (null);
		}
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
	 * If top is reached, double size
	 */
	private void doubleQueueSize() {
		Object newQueue[] = new Object[2 * queue.length];
		for(int i = 0; i < queue.length; i++) {
			newQueue[i] = queue[i];
		}
		queue = newQueue;
	}
}
