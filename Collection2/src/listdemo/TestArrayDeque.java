package listdemo;

import java.util.ArrayDeque;
import java.util.Iterator;

public class TestArrayDeque {

	public static void main(String[] args) {

		ArrayDeque<String> queue = new ArrayDeque<>();

		queue.addLast("first");
		queue.addLast("second");
		queue.addLast("third");
		queue.addLast("fourth");
		queue.addLast("fifth");

		System.out.println(queue);
		System.out.println(queue.size());

		String ele = queue.peek(); // queue.getFirst(); to get the first element
		System.out.println(ele);

		queue.pollFirst(); // to remove an element from the queue
		System.out.println(queue);
		
		Iterator<String> iter = queue.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}

	}

}
