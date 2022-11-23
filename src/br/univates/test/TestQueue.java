package br.univates.test;

import org.junit.Test;

import br.univates.main.Stack;

public class TestQueue {
	
	@Test
	public void testQueue()
	{
		Stack s = new Stack();
		s.push("Frango com Catupiry");
		s.push("Calabresa");
		s.push("Quatro Queijos");
		
		s.print();
	}

}
