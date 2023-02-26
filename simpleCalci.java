import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		int num1, num2;
		String op;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number:");
		num1 = sc.nextInt();
		System.out.println("Enter the Second number:");
		num2 = sc.nextInt();
		System.out.println("Enter the operator:");
		op = sc.next();
		switch(op)
		{
			case "+":
			{
				System.out.println("Your Result is = "+(num1+num2));
				break;
			}
			case "-":
			{
				System.out.println("Your Result is = "+(num1-num2));
				break;
			}
			case "*":
			{
				System.out.println("Your Result is = "+(num1*num2));
				break;
			}
			case "/":
			{
				if(num2 == 0)
				{
					System.out.println("Divide by Zero Error!");
					break;
				}
				else
				{
					System.out.println("Your Result is = "+(num1/num2));
					break;					
				}
			}
			case "%":
			{
				if(num2 == 0)
				{
					System.out.println("Divide by Zero Error!");
				}
				else
				{
					System.out.println("Your Result is = "+(num1%num2));
					break;					
				}
			}
			
		}
	}

}
