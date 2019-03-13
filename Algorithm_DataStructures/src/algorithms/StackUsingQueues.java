package algorithms;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

	Queue<Integer> queue1 = new LinkedList<>();
	Queue<Integer> queue2 = new LinkedList<>();

	public void push(int data) {
		if (isEmpty()) {
			queue1.add(data);
		} else {
			if (queue1.size() > 0) {
				queue2.add(data);
				int size = queue1.size();
				while (size > 0) {
					queue2.add(queue1.poll());
					size--;
				}
			} else if (queue2.size() > 0) {
				queue1.add(data);
				int size = queue2.size();
				while (size > 0) {
					queue1.add(queue2.poll());
					size--;
				}
			}
		}
	}

	public int pop() throws NullPointerException{
		if (queue1.size() > 0) {
			return queue1.poll();
		} else if (queue2.size() > 0) {
			return queue2.poll();
		} else {
			throw new NullPointerException();
		}
	}

	private Boolean isEmpty() {
		if (queue1.isEmpty() && queue2.isEmpty()) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		StackUsingQueues stack = new StackUsingQueues();

		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Result: " + stack.pop());
		System.out.println("Result: " + stack.pop());
		System.out.println("Result: " + stack.pop());
		System.out.println("Result: " + stack.pop());
	}
}
