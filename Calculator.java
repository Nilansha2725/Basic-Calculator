package github;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number: ");
double x= sc.nextDouble();
System.out.println("Enter the second number: ");
double y=sc.nextDouble();
System.out.println(" Enter the operator (+,-,/,*,%): ");
char ch=sc.next().charAt(0);
switch(ch)
{
case '+':
System.out.println("Result: "+(x+y));
break;
case '-':
System.out.println("Result: "+(x-y));
break;
case '/':
System.out.println("Result: "+(x/y));
break;
case '%':
System.out.println("Result: "+(x%y));
break;
	
}
sc.close();

	}

}
