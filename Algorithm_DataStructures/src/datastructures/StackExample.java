package datastructures;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackExample {
	private int stackSize;
	private int[] stackArray;
	private int top;

	public StackExample(int size) {
		this.stackSize = size;
		this.stackArray = new int[stackSize];
		this.top = - 1;
	}

	private void push(int item) {
		if (this.isStackFull()) {
			System.out.println("Stack is full. Increasing the size");
			this.increaseSize();
		}
		System.out.println("Adding elements: " + item);
		this.stackArray[++top] = item;
	}
	
	private int pop() throws Exception{
		if(this.isStackEmpty()){
			throw new EmptyStackException();
		}
		int list = stackArray[top];
		System.out.println("Removed top element: " + list);
		stackArray[top] = 0;
		return list;
	}
	
	private int peek() {
		return stackArray[this.top];
	}

	private void increaseSize() {
		int[] newStack = new int[this.stackSize * 2];
		for (int i = 0; i < this.stackSize; i++){
			newStack[i] = this.stackArray[i];
		}
		this.stackArray = newStack;
		this.stackSize = this.stackSize * 2;
	}
	
	private boolean isStackEmpty() {
		return (this.top == -1);
	}

	private boolean isStackFull() {
		return (top == stackSize - 1);
	}

	public static void main(String[] args) {
		StackExample se = new StackExample(5);
		for(int i=0; i<11;i++){
			se.push(i);
		}
		try {
			se.pop();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(se.peek());
	}
}