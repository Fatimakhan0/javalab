public class StudentDetails{
	public static void main(String[] ar){
		Student s=new Student("James","1032");
		s.display();
	}
}
class Student{
	String nam,rn;
	Student(String name, String rno){
		nam=name;
		rn=rno;
	}
public void display(){
	System.out.printf("Welcome %s! Roll no: %s ",nam,rn);
	}
}