import java.util.Scanner;

public interface Resume {
	void biodata();
}


class Teacher implements Resume
{
	String name,qualification,achievements;
	int age,exp;
	
	public void biodata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Teacher: ");
		name = sc.next();
		System.out.println("Enter the age: ");
		age = sc.nextInt();
		System.out.println("Enter Qualification: ");
		qualification = sc.next();
		System.out.println("Enter achievements: ");
		achievements = sc.next();
		System.out.println("Enter Experience: ");
		exp = sc.nextInt();
		
		System.out.println("-----------TEACHER RESUME----------");
		System.out.println("Name"			+":"+name);
		System.out.println("Age"			+":"+age);
		System.out.println("Qualification"	+":"+qualification);
		System.out.println("Achievements"	+":"+achievements);
		System.out.println("Experience"		+":"+exp);
    System.out.println("-----------------------------------");
    
	}
}


class Student implements Resume
{
	String name,discipline;
	int age,result;
	
	public void biodata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of Student: ");
		name = sc.next();
		System.out.println("Enter the age: ");
		age = sc.nextInt();
		System.out.println("Enter Discipline: ");
		discipline = sc.next();
		System.out.println("Enter Result: ");
		result = sc.nextInt();
		
		System.out.println("-----------STUDENT RESUME----------");
		System.out.println("Name"			+":"+name);
		System.out.println("Age"			+":"+age);
		System.out.println("Discipline"		+":"+discipline);
		System.out.println("Result"			+":"+result);
    System.out.println("-----------------------------------");
	}
}

class resume{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int ch;
		System.out.println("1.TEACHER RESUME\n2.STUDENT RESUME\n");
		System.out.println("Enter youe choice: ");
		ch = sc.nextInt();
		switch(ch)
		{
		case 1 : 
			Teacher t = new Teacher();
			t.biodata();
			break;
		case 2 : 
			Student s = new Student();
			s.biodata();
			break;
		}

	} 
}
