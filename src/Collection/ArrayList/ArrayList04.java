package Collection.ArrayList;

import java.util.ArrayList;

public class ArrayList04 {
	public static void main(String[] args) {
		// creating student class object
		Student s1 = new Student(101, "Wasim", 23);
		Student s2 = new Student(102, "Ubed", 24);
		Student s3 = new Student(103, "Salman", 23);
		Student s4 = new Student(104, "Lukman", 25);
		ArrayList<Student> std = new ArrayList<>();
		std.add(s1);
		std.add(s2);
		std.add(s3);
		std.add(s4);

		for (Student student : std) {
			System.out.println(student);
		}
	}
}

class Student {

	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
}