package day23;
// *****This one by it self*****
public class Main {
	public static void main(String[] args) {
		Student student = new Student();
		student.firstName = "John";
		student.lastName = "Doe";
		student.program = "Java";
		student.grade = 95.0;
		// System.out.println(student.lastName);
		student.printDetails();
		
		Student student2 = new Student();
		student2.printDetails();
// TODO
//		 create an object with constructor that has arguments
//		 print object properties
		System.out.println("---------");
		Student student3 = new Student("Alex", "Rodriguez", "SQL", 99.0);
		student3.printDetails();
		
		System.out.println(student3.grade);
	}
}
class Student {
	public String firstName;
	public String lastName;
	public String program;
	public double grade;
	// TODO
	// -> create an empty constructor.
	// -> create constructor that will accept all arguments to assign object properties
	//    assign all object properties in the constructor.
	public Student() {
		}
	public Student(String firstName, String lastName, String program, double grade) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.program = program;
		this.grade = grade;
	}
	public void  printDetails() {
		System.out.println("first name: " + firstName);
		System.out.println("last name: " + lastName);
		System.out.println("program: " + program);
		System.out.println("grade: " + grade);
	}
}


	

