import java.util.Scanner;
class switchdemo
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the choice");
		int n = sc.nextInt();
		switch(n)
		{
		case 1: 
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednessday");
			break;
		case 4: 
			System.out.println("Thusday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:	
			System.out.println("sunday");
			break;
		default:
			System.out.println("day");
					
		}
		
		
	}
}