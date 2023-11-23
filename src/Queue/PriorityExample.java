package Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityExample {
	public static void main(String[] args) {
		Queue<Book> q = new PriorityQueue<Book>();
		// creating books
		Book b1 = new Book(101, "C", "Danies Ritchi", "NareshIt", 100);
		Book b2 = new Book(102, "Java", "James Gosling", "GirgaSoft", 120);
		Book b3 = new Book(103, "Pythin", "Rossum", "AshotIt", 90);
		// adding books to the queue
		q.add(b1);
		q.add(b2);
		q.add(b3);
		// traversing book objects
		for (Book book : q) {
			System.out.println(
					book.id + " " + book.name + " " + book.author + " " + book.publisher + " " + book.quantity);
		}
		System.out.println();
		q.remove();
		for (Book book : q) {
			System.out.println(
					book.id + " " + book.name + " " + book.author + " " + book.publisher + " " + book.quantity);
		}
	}
}
