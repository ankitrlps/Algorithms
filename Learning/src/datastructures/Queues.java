package datastructures;

import java.util.EmptyStackException;

public class Queues {
	private int first;
	private int last;
	private int[] queueArray;
	private int queueSize;
	private int alwaysFirst;
	
	public Queues(int size) {
		this.queueSize = size;
		this.queueArray = new int[this.queueSize];
		this.first = -1;
		this.last = 0;
		this.alwaysFirst = 0;
	}

	private void push(int item) {
		if (this.isQueueFull()) {
			System.out.println("Queue is full. Increasing the stack.");
			increaseQueue();
		}
		this.queueArray[last++] = item;
		//this.first = this.queueArray[0];
		System.out.println("added " + item);
	}

	private int pop() {
		if (this.isQueueEmpty()) {
			throw new EmptyStackException();
		}
		/*
		 * int remItem = this.queueArray[--last]; this.queueArray[last] = 0;
		 * System.out.println("removed " + remItem); return remItem;
		 */

		// System.out.println("first item " + remItem);
		int firstItem = this.queueArray[++first];
		this.queueArray[alwaysFirst++] = 0;
		System.out.println("pop items: " + firstItem);
		return firstItem;
	}

	private void increaseQueue() {
		int[] newArray = new int[this.queueSize * 2];
		for (int i = 0; i < this.queueSize; i++) {
			newArray[i] = this.queueArray[i];
		}
		this.queueArray = newArray;
		this.queueSize = this.queueSize * 2;
	}

	private int peek() {
		return this.queueArray[--alwaysFirst];
	}

	private boolean isQueueFull() {
		return (this.last == this.queueSize - 1);
	}

	private boolean isQueueEmpty() {
		return (this.last == -1);
	}

	public static void main(String[] args) {
		Queues que = new Queues(5);

		for (int i = 0; i < 10; i++) {
			que.push(i);
		}
		que.pop();
		que.pop();
		System.out.println(que.peek());
		
		System.out.println(que.pop());
	}
}