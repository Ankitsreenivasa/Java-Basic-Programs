package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayList {
	
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int choice=0;
			options ch = new options();
			while(choice<=7)
			{	
				System.out.println("ArrayList Operations : \n");
				System.out.println("1.ADD\n2.INSERT AT END\n3.INSERT AT PARTICULAR POSITION\n4.DISPLAY\n5.LENGTH\n6.STARTS_WITH....\n7.SORT\n");
				System.out.println("Enter your choice: \n");
				choice = sc.nextInt();
				switch(choice)
				{
				case 1 :ch.add();
						break;
				case 2 :ch.insert_at_end();
						break;
				case 3 :ch.insert_at_position();
						break;
				case 4 :ch.display();
						break;
				case 5 :ch.length();
						break;
				case 6 :ch.starts_with();
						break;
				case 7 :ch.sort();
						break;
				default :
					System.out.println("Thanks for using!!!");
					System.exit(0);
			}
		}
	}
}

class options{
	Scanner sc = new Scanner(System.in);
	ArrayList<String> list = new ArrayList<String>();
	String str,end,start;
	int i;
	void add()
	{
		System.out.println("Enter the String: ");
		str = sc.next();
		list.add(str);
	}
	void display()
	{
		System.out.println(list);
	}
	
	void insert_at_end()
	{
		System.out.println("Enter the String you want to insert at end: ");
		end = sc.next();
		list.add(end);
	}
	
	void insert_at_position()
	{
		System.out.println("Enter Index at which you want to insert: ");
		i = sc.nextInt();
		System.out.println("Enter the String: ");
		str = sc.next();
		list.add(i,str);
	}
	
	void length()
	{
		System.out.println("The length of the Arraylist is: "+list.size());
	}
	
	void starts_with()
	{
		System.out.println("String starting with: ");
		start = sc.next();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).startsWith(start))
			{
				System.out.println(list.get(i));
			}
		}
	}
	
	void sort()
	{
		Collections.sort(list);
		for(int i=0;i<list.size();i++)
		{
				System.out.println(list.get(i));
		}
	}
	
}
