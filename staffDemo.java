import java.util.Scanner;

class staff {
	String staffid;
	String name;
	long phone;
	int salary;
	
	void read() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the staff ID: ");
		staffid = s.next();
		System.out.println("Enter the staff Name: ");
		name = s.next();
		System.out.println("Enter the staff Phone Number: ");
		phone = s.nextLong();
		System.out.println("Enter the staff salary: ");
		salary = s.nextInt();
		}
	void display() {
		System.out.println("Staff ID: "+staffid+"\nStaffName:"+name+"\nPhoneNumber:"+phone+"\nSalary:"+salary);
	}
}

class Teaching extends staff{
	String domain;
	int publications;
	
	void read() {
		Scanner s = new Scanner(System.in);
		super.read();
		System.out.println("Enter the domain: ");
		domain = s.next();
		System.out.println("Enter the Publications: ");
		publications = s.nextInt();
	}
	void display() {
		super.display();
		System.out.println("\nDomain :"+domain+"\nPublications: "+publications);
	}
}


class Technical extends staff{
	String skills;
	
	void read() {
		Scanner s = new Scanner(System.in);
		super.read();
		System.out.println("Enter the Skills: ");
		skills = s.next();
	}
	void display() {
		super.display();
		System.out.println("\nSkills :"+skills);
	}
}


class Contract extends staff{
	int period;
	
	void read() {
		Scanner s = new Scanner(System.in);
		super.read();
		System.out.println("Enter the Period: ");
		period = s.nextInt();
	}
	void display() {
		super.display();
		System.out.println("\nPeriod :"+period);
	}
}


public class Staffdemo {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.println("Enter the number of Teaching Staffs: ");
		n1 = s.nextInt();
		Teaching arr[]= new Teaching[n1];
		for (int i=0;i<n1;i++)
		{
			arr[i]=new Teaching();
			arr[i].read();
		}
		
		System.out.println("Enter the number of Technical Staffs: ");
		n2 = s.nextInt();
		Technical arr1[]= new Technical[n2];
		for (int i=0;i<n2;i++)
		{
			arr1[i]=new Technical();
			arr1[i].read();
		}
		
		
		System.out.println("Enter the number of Contract Staffs: ");
		n3 = s.nextInt();
		Contract arr2[]= new Contract[n1];
		for (int i=0;i<n3;i++)
		{
			arr2[i]=new Contract();
			arr2[i].read();
		}
		
		//Displaying
		
		for (int i=0;i<n1;i++)
		{
			arr[i].display();
		}
		
		for (int i=0;i<n2;i++)
		{
			arr1[i].display();
		}
		
		for (int i=0;i<n3;i++)
		{
			arr2[i].display();
		}
	}
}
