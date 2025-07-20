package device;

import java.util.Scanner;
class Person{
	String name;
	String age;
}

class Student extends Person{
	String rollNo;
	
	void attendclass(){
		System.out.println(name + "is attending class" );
	}
}

class Teacher extends Person{
	String subject;
	
	void teach() {
		System.out.println(name + " is teaching " + subject);
	}
}


public class Education {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name:");
		String studentName = sc.nextLine();
		System.out.println("Enter age:");
		String studentAge = sc.nextLine();
		System.out.println("Enetr RollNo:");
		String RollNo =sc.nextLine();
		
		Student student = new Student();
		student.name = studentName;
		student.age = studentAge;
		student.rollNo = RollNo;
		
	    student.attendclass();
		
		System.out.println("Enter teacher Name:");
		String teacherName = sc.nextLine();
		System.out.println("Enter teacher age:");
		String teacherAge = sc.nextLine();
		System.out.println("Enter Subject:");
		String Subject  =sc.nextLine();
		
		Teacher teacher =new Teacher();
		teacher.name=teacherName;
		teacher.age = teacherAge;
		teacher.subject=Subject;
		
		teacher.teach();
		sc.close();
		

	}

}
