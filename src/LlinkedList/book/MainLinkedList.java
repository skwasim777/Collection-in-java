package LlinkedList.book;

import java.util.LinkedList;

public class MainLinkedList {
	public static void main(String[] args) {
		// creating ist of books
		LinkedList<Book> b = new LinkedList<>();
		// creating books
		Book b1 = new Book(101, "C Program", "Danies Ritche", "NareshIt", 10);
		Book b2 = new Book(103, "Java Program", "James Gosling", "DuragIt", 20);
		Book b3 = new Book(102, "Python", "Guido Rossum", "AshikIt", 15);
		b.add(b1);
		b.add(b2);
		b.add(b3);
		for (Book books : b) {
			System.out.println(
					books.id + " " + books.name + " " + books.author + " " + books.publisher + " " + books.quantity);
		}
	}
}
