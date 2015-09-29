import java.util.Scanner;

//import java.lang.*;  // added by compiler
public class FirstClass {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the First No");
	
	int  firstNumber = scanner.nextInt();
	System.out.println("Enter the Second No");
	int secondNumber = scanner.nextInt();
	int result = firstNumber + secondNumber;
	System.out.println("Sum is "+result);
	scanner.close();
}

}
