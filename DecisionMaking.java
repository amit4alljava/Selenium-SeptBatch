import java.util.Scanner;


public class DecisionMaking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the First No");
		int firstNo = scanner.nextInt();
		System.out.println("Enter the Second No");
		int secondNo = scanner.nextInt();
		
		System.out.println(firstNo>secondNo?"First No is Greater":"Second No is Greater");
		
		System.out.println("Enter the Third No");
		int thirdNo = scanner.nextInt();
		
		if(firstNo>secondNo){
			if(firstNo>thirdNo){
				System.out.println("First No is Greater");
			}
			else
			if(thirdNo>secondNo)	
			{
				System.out.println("Third No is Greater");
			}
		}
		else
		if(secondNo>thirdNo)	
		{
			System.out.println("Second is Greater");
		}
		
		if(firstNo>secondNo  && firstNo>thirdNo){
			System.out.println("First No is Greater");
		}
		else
		if(secondNo>firstNo && secondNo>thirdNo){
			System.out.println("Second No is Greater");
		}
		else
		if(firstNo == secondNo){
			System.out.println("Same ");
		}
		
		else
		{
			System.out.println("Second No is Greater");
		}
		
		
		
		int ch = 1;
		switch(ch){
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		default:
			System.out.println("Wrong Value");
		}

	}

}
